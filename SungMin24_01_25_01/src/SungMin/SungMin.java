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
		//16194 카드 구매하기2
		int dp[] = new int[1001];
		int a = Integer.parseInt(bf.readLine());
		int one[] = new int[a];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0; i<a; i++) {
			one[i] = Integer.parseInt(st.nextToken());
		}
		dp[0] =0;
		dp[1] = one[0]; //입력값은 0부터 시작하니까 0으로 했음
		
		for(int i=2; i<=1000; i++) {
			int min = 10000000;
			for(int j=0; j<a; j++) {
				if(j<i && dp[i-j-1]+one[j]<min) {min = dp[i-j-1]+one[j];}
				
			}
			dp[i] = min;
		}
		System.out.println(dp[a]);
	
    }
}
