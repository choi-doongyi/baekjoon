package SungMin;
import java.util.Scanner;
 
public class SungMin {
	//11053 가장 긴 증가하는 부분 수열
	static int[] seq;
	static Integer[] dp;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		seq = new int[N+1];
		dp = new Integer[N+1];
		
		
		for(int i = 1; i <= N; i++) {
			seq[i] = in.nextInt();
		}
		
		// 0 ~ N-1 까지 모든 부분수열 탐색 
		for(int i = 1; i <= N; i++) {
			LIS(i);
		}
		
		int max = dp[1];
		// 최댓값 찾기 
		for(int i = 1; i < N; i++) {
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
	}
	
	
	static int LIS(int N) {
		
		// 만약 탐색하지 않던 위치의 경우 
		if(dp[N] == null) {
			dp[N] = 1;	// 1로 초기화 
			
			// N-1 부터 0까지중 N보다 작은 값들을 찾으면서 재귀호출. 
			for(int i = N - 1; i >= 0; i--) {
				if(seq[i] < seq[N]) {
					dp[N] = Math.max(dp[N], LIS(i) + 1);
				}
			}
		}
		return dp[N];
	}
}
