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
	static int dp[] = new int[100001];
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//1699 제곱수의 합
		int a = Integer.parseInt(bf.readLine());
		for(int i=1; i*i<dp.length; i++) {
			dp[i*i]=1;
		}
		
		System.out.println(dp(a));
    }
	public static int dp(int N){
        if(dp[N] == 0){
        	dp[N] = 100001;
            for (int i = (int)Math.sqrt(N); i >= 0; i--) {
                int pow = (int) Math.pow(i, 2);
                dp[N] = Math.min(dp(N - pow) + 1, dp[N]);
            }
        }
        return dp[N];
    }
}
