package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class SungMin {
	//9461 파도반 수열
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long dp[] = new long[101];
		int a = Integer.parseInt(bf.readLine());
		
		dp[1] =1;
		dp[2]=1;
		dp[3] =1;
		for(int i=4; i<=100; i++) {
			dp[i]=dp[i-3]+dp[i-2];
		}
		
		for(int i=0; i<a; i++) {
			System.out.println(dp [Integer.parseInt(bf.readLine())]);
		}
	}
}

