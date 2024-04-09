package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class SungMin {
	//10974 모든 순열
	static int N;
    public static int[] arr;
    public static int[] ans;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		N = Integer.parseInt(bf.readLine());
		arr = new int[N];
		ans = new int[N];
        visit = new boolean[N];
		
        for(int i=0; i<N; i++) {
        	arr[i] = i+1;
        }
		dfs(0,0);
		System.out.println(sb);
	}
	public static void dfs(int cnt,int count){
        if(count == N) {
            for(int i = 0; i < N; i++) {
                sb.append(ans[i]+" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 0; i < N; i++) {
        	if(visit[i]) {
        		continue;
        	}
    		visit[i] = true;
    		ans[count] = arr[i];
            dfs(i,count+1);
            visit[i] = false;
        }
    }
}