package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;
 
public class SungMin {
	//11722 가장 긴 감소하는 부분 수열
	static int[] one;
	static int[] dp;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(bf.readLine());
		
		one = new int[N+1];
		dp = new int[N+1];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=1; i<=N; i++) {
			one[i] = Integer.parseInt(st.nextToken());
		}
		for(int i=1; i<=N; i++) {
			Lis(i);
		}
		int max =0;
		for(int i=1; i<=N; i++) {
			if(dp[i]>max) {
				max = dp[i];
			}
		}
		System.out.println(max);
		
	}
	public static int Lis(int n) {
		if(dp[n]==0) {
			dp[n] =1;
			for(int i=n-1; i>=1; i--) {
				if(one[n]<one[i]) {
					dp[n]=Math.max(dp[n], Lis(i)+1);
				}
			}
		}
		return dp[n];
	}

}
