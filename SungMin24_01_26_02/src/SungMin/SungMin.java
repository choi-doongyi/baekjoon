package SungMin;

import java.io.BufferedReader;   
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//10844 쉬운 계단수
		long dp[][] = new long[101][11];
		int a = Integer.parseInt(bf.readLine());
		
		dp[1][1] =1;
		dp[1][2] =1;
		dp[1][3] =1;
		dp[1][4] =1;
		dp[1][5] =1;
		dp[1][6] =1;
		dp[1][7] =1;
		dp[1][8] =1;
		dp[1][9] =1;
		
		for(int i=2;i<101;i++){
			for(int j=0;j<=9;j++){
                if(j==0)dp[i][j]=dp[i-1][1]%1000000000;
                else dp[i][j]=(dp[i-1][j-1]+dp[i-1][j+1])%1000000000;
            }
        }
		long sum =0;
		for(int i=0;i<=9;i++) {
			sum+=dp[a][i];
		}
            
		
		
		System.out.println(sum%1000000000);
	
    }
}
