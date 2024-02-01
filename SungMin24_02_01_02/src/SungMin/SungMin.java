package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;
 
public class SungMin {
	//11055 가장 큰 증가하는 부분 수열
	static int[] one;
	static Integer[] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(bf.readLine());
		
		one = new int[N+1];
		dp = new Integer[N+1];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i = 1; i <= N; i++) {
			one[i] = Integer.parseInt(st.nextToken());
		}
		// 0 ~ N-1 까지 모든 부분수열 탐색 
		for(int i = 1; i <= N; i++) {
			LIS(i);
		}


		int result = 0;
        for (int i = 1; i <= N; i++) result = Math.max(result, dp[i]);
		System.out.println(result);
	}
	
	
	static void LIS(int N) {
		// 만약 탐색하지 않던 위치의 경우 
		if(dp[N] == null) {
			dp[N] = one[N];	// 1로 초기화 

			// N-1 부터 0까지중 N보다 작은 값들을 찾으면서 재귀호출. 
			for(int i = N - 1; i >= 1; i--) {
				if(one[i] < one[N]) {
					dp[N] = Math.max(dp[N], one[N] + dp[i]);
				}
			}
		}
	}
}
