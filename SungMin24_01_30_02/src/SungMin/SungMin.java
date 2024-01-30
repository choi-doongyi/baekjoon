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
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//1932 정수 삼각형
		int a = Integer.parseInt(bf.readLine());
		int one[][] = new int[a+1][a+1];
		long dp[][] = new long[a+1][a+1];
		for(int i=1; i<=a; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int j=1; j<=i; j++) {
				one[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dp[1][1] = one[1][1];
		long max =0;
		for(int i=2; i<=a; i++) {		//2~5까지 i 가 바뀔 칸 
			for(int x=1; x<=i-1; x++) {
				for(int j=x; j<=x+1; j++) {	//1~2? 까지(다음칸)
					if(dp[i][j]!=0) {
						if(dp[i][j]< dp[i-1][x]+one[i][j]) {
							dp[i][j]= dp[i-1][x]+one[i][j];
						}
					}
					else {
						dp[i][j]= dp[i-1][x]+one[i][j];
					}
					
					if(max<dp[i][j]) {max = dp[i][j];}
					
				}
			}
			
		}
		if(max ==0) {
			max = dp[1][1];
		}
		System.out.println(max);
		
    }
}
