package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;
 
public class SungMin {
	//11399 ATM
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		int one[] = new int[n];
		int dp[] = new int[n];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0; i<n; i++) {
			one[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(one);
		dp[0] = one[0];
		int sum = dp[0];
		for(int i=1; i<n; i++) {
			dp[i] = dp[i-1]+one[i];
			sum +=dp[i];
		}


		System.out.println(sum);
	}
}

