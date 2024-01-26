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
		//15990 1, 2, 3 더하기 5
		
		long dp[][] = new long[100001][4];
		int a = Integer.parseInt(bf.readLine());
		
		dp[1][1] =1;
		dp[2][2] =1;
		dp[3][3] =1;
		
		for (int i = 1; i < dp.length; i++) {
            if (i - 2 >= 0) {
                dp[i][1] = (dp[i - 1][2] + dp[i - 1][3])%1000000009;
            }
            if (i - 3 >= 0) {
            	dp[i][2] = (dp[i - 2][1] + dp[i - 2][3])%1000000009;
            }
            if (i - 4 >= 0) {
            	dp[i][3] = (dp[i - 3][1] + dp[i - 3][2])%1000000009;

            }
        }
		for(int i=0; i<a; i++) {
			int b = Integer.parseInt(bf.readLine());
			System.out.println((dp[b][1]+dp[b][2]+dp[b][3])%1000000009);
		}
		
	
    }
}
