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
		//1309 동물원

		int a = Integer.parseInt(bf.readLine());
		long dp[] = new long[100001];
		dp[0] =1;
		dp[1] =3;
		for(int i=2; i<=100000; i++) {
			dp[i] =(((2*dp[i-1])%9901)+dp[i-2])%9901;
		}
		System.out.println(dp[a]);
    }
}
