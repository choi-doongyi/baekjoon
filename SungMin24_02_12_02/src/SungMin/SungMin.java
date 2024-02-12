package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
 
public class SungMin {
	//17626 Four Squares
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int dp[] = new int [50000+1];
		for(int i=1; i*i<=50000; i++) {
			dp[i*i] =1;
		}
		
		int min = 0;
		for(int i=1; i<=50000; i++) {
			min = Integer.MAX_VALUE;
			for (int j = 1; j * j <= i; j++) {
                int temp = i - j * j;
                min = Math.min(min, dp[temp]);
            }
			
			dp[i] = min+1;
		}
		int a = Integer.parseInt(bf.readLine());
		System.out.println(dp[a]);
	}
}

