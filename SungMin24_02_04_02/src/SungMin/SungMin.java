package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;
 
public class SungMin {
	//1003 파보나치 함수
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int dp[][] = new int[40+1][2];
		int T = Integer.parseInt(bf.readLine());

		dp[0][0] =1;
		dp[0][1] =0;
		dp[1][0] =0;
		dp[1][1] =1;
		for(int i=2; i<41; i++) {
			dp[i][0] = dp[i-2][0]+dp[i-1][0];
			dp[i][1] = dp[i-2][1]+dp[i-1][1];
		}
		for(int i=0; i<T; i++) {
			int a =Integer.parseInt(bf.readLine());
			System.out.println(dp[a][0]+" "+dp[a][1]);
		}

	}
}
