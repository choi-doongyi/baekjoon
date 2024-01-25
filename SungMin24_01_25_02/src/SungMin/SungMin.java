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
		//11052 카드 구매하기
		int dp[] = new int[1001];
		int a = Integer.parseInt(bf.readLine());
		int one[] = new int[a];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0; i<a; i++) {
			one[i] = Integer.parseInt(st.nextToken());
		}
		dp[1] = one[0]; //입력값은 0부터 시작하니까 0으로 했음
		if(dp[1]*2>dp[2]) {
			dp[2] = one[0]*2;
		}
		else {
			dp[2] = one[2];
		}
		
		for(int i=2; i<=1000; i++) {
			int max = 0;
			for(int j=0; j<a; j++) {
				//2번 돌게 한 후
				if(j<i && dp[i-j-1]+one[j]>max) {max = dp[i-j-1]+one[j];}
				
				// dp[2] + one[0]> max 
				// dp[3] + one[1]>
			}
			dp[i] = max;
		}
		System.out.println(dp[a]);
	
    }
}
