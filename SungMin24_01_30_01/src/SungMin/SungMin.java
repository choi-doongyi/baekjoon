package SungMin;

import java.io.BufferedReader;   
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class SungMin {
	static boolean isPrime[];
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//11057 오르막수
		
		int a = Integer.parseInt(bf.readLine());
		long[][] dp = new long[1001][10];
		dp[1][0] = 10;
		dp[1][1] =1;
		dp[1][2] =1;
		dp[1][3] =1;
		dp[1][4] =1;
		dp[1][5] =1;
		dp[1][6] =1;
		dp[1][7] =1;
		dp[1][8] =1;
		dp[1][9] =1;
		for(int i=2; i<=a; i++) {
			long sum = dp[i-1][0];
			dp[i][0] = sum;
			for(int j=1; j<10; j++) {
				dp[i][j] = sum;
				sum-=dp[i-1][j]%10007;
				dp[i][0] += sum%10007;
				
			}
		}
		System.out.println(dp[a][0]%10007);
    }
}
