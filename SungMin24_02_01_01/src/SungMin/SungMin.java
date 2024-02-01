package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;
 
public class SungMin {
	//11053 가장 긴 증가하는 부분 수열
	static int[] seq;
	static Integer[] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(bf.readLine());
		
		seq = new int[N+1];
		dp = new Integer[N+1];
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i = 1; i <= N; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		// 0 ~ N-1 까지 모든 부분수열 탐색 
		for(int i = 1; i <= N; i++) {
			LIS(i);
		}
		
		int max = dp[1];
		int maxCount = 0;
		// 최댓값 찾기 
		for(int i = 1; i <= N; i++) {
			if(max<=dp[i]) {maxCount = i;}
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
		Stack<Integer> sung = new Stack<>();
		while(true) {
			sung.push(maxCount);
			if(SungMin(maxCount)<1) {break;}
			maxCount = SungMin(maxCount);
			
		}
		int susu = sung.size();
		for(int i=0; i<susu; i++) {
			System.out.print(seq[sung.pop()]+" ");
		}
	}
	
	
	static int LIS(int N) {
		// 만약 탐색하지 않던 위치의 경우 
		if(dp[N] == null) {
			dp[N] = 1;	// 1로 초기화 
			
			// N-1 부터 0까지중 N보다 작은 값들을 찾으면서 재귀호출. 
			for(int i = N - 1; i >= 1; i--) {
				if(seq[i] < seq[N]) {
					dp[N] = Math.max(dp[N], LIS(i) + 1);
				}
			}
		}
		return dp[N];
	}
	
	static int SungMin(int N) {
		int count22 =0;
		// N-1 부터 0까지중 N보다 작은 값들을 찾으면서 재귀호출. 
		for(int i = N - 1; i >= 1; i--) {
			if(seq[i] < seq[N]) {
				if(LIS(i)+1>=dp[N]) {count22 =i;}
				dp[N] = Math.max(dp[N], LIS(i) + 1);
			}
		}
		return count22;
	}
}
