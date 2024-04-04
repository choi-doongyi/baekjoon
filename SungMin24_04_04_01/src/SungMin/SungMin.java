package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class SungMin {
	//10819 차이를 최대로
	static int N;
    public static int[] arr;
    public static int[] ans;
    public static boolean[] visit;
    public static int result;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		
		N = Integer.parseInt(bf.readLine());
		arr = new int[N];
        ans = new int[N];
        visit = new boolean[N];
		
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<N; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
		dfs(0);
		System.out.println(result);
	}
	public static void dfs(int cnt){
        if(cnt == N) {
            int sum = 0;
            for(int i = 0; i < N-1; i++) {
                sum += Math.abs(ans[i] - ans[i+1]);
            }
            result = Math.max(result, sum);
            return;
        }
        for(int i = 0; i < N; i++) {
            if(!visit[i]){
                ans[cnt] = arr[i];
                visit[i] = true;
                dfs(cnt + 1);
                visit[i] = false;
            }
        }
    }
}