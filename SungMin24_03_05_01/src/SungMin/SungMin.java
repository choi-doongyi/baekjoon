package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class SungMin {
	//9465 스티커
	static int[][] one;
    static int[][] dp;
    static int[]X= {1,1,2,2};
    static int[] Y= {1,-1,1,-1};
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(bf.readLine());
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(bf.readLine());
			one = new int[2][n + 1];
            dp = new int[2][n + 1];
			
            
            for (int j = 0; j < 2; j++) { //초기화
            	StringTokenizer st = new StringTokenizer(bf.readLine());
                for (int k = 1; k <= n; k++) {
                    one[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            
            
			dp[0][1] = one[0][1];
            dp[1][1] = one[1][1];
            for (int a = 2; a <= n; a++) {
                dp[0][a] = Math.max(dp[1][a - 1], dp[1][a - 2]) + one[0][a];
                dp[1][a] = Math.max(dp[0][a - 1], dp[0][a - 2]) + one[1][a];
            }
			
			System.out.println(Math.max(dp[0][n],dp[1][n]));
		}
		
	}
}

