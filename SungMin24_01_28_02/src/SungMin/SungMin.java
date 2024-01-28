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
import java.util.StringTokenizer;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//1912 연속합
		int a = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int dp[] = new int[a+1];

		
		for(int i=1; i<=a; i++) {
			dp[i] =Integer.parseInt(st.nextToken());
		}
		int max=dp[1];
		int sum =dp[1];
		for(int i=2; i<=a; i++) {
			if(dp[i]>=0) {
				if(max<0 || sum<0) {
					sum = dp[i];
				}
				else {
					sum += dp[i];
				}
			}
			else {
				if(sum+dp[i]>=0) {
					sum+=dp[i];
				}
				else {
					sum =dp[i];
				}
			}
			
			if(max<sum) {
				max = sum;
			}
		}
		System.out.println(max);
    }
}
