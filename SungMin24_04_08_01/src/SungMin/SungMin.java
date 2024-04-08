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
	//15665 N과 M (11)
	static int N,M;
    public static int[] arr;
    public static int[] ans;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(bf.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
        ans = new int[M];
        visit = new boolean[N];
		
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<N; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
		dfs(0,0);
		System.out.println(sb);
	}
	public static void dfs(int cnt,int count){
        if(count == M) {
            for(int i = 0; i < M; i++) {
                sb.append(ans[i]+" ");
            }
            sb.append("\n");
            return;
        }
        int gamja = -1;
        for(int i = 0; i < N; i++) {
        	int now = arr[i];
        	if(gamja==now) {
        		continue;
        	}
        	else {
        		gamja = now;

        		ans[count] = arr[i];
                dfs(i,count+1);

        	}
             
        }
    }
}