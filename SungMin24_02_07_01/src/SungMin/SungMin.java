package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;
 
public class SungMin {
	//2133 타일 채우기
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		int dp[] = new int[31];
		dp[0] =1;
		dp[1] =0;
		dp[2] = 3;
		int result =0;
		for(int i=4; i<=30; i+=2) {
			result = dp[i-2]*3;
			for(int j=i-4; j>=0; j-=2) {
				result+=dp[j]*2;
			}
			dp[i]=result;
		}

		System.out.println(dp[n]);
	}
}

