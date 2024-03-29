package SungMin;

import java.io.BufferedReader;   
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//11727 2*n 타일링 2
		int a = Integer.parseInt(bf.readLine());
		long [] dp = new long[1001];		
		dp[1] = 1;
		dp[2] = 3;
		
		for(int i=3; i<=a; i++) {
			dp[i] = (dp[i-1]+dp[i-2]*2)%10007;
		}
		bw.write(dp[a]+"");
		bw.close();
	}
}
