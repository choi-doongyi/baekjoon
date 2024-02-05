package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;
 
public class SungMin {
	//2156 포도주 시식
	static Integer dp[];
	static int one[];
	static int max =0;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		
		
		dp = new Integer[n+1];
		one = new int[n+1];
		for(int i=1; i<=n; i++) {
			one[i] = Integer.parseInt(bf.readLine());
		}
		dp[0] =0;
		dp[1] = one[1];
		if(n >= 2) {
			dp[2] = one[1] + one[2];
		}
		
		System.out.println(find(n));
	}
	static int find(int N) {
		// 아직 탐색하지 않는 N번째 계단일 경우
		if(dp[N] == null) {
			dp[N] = Math.max(Math.max(find(N - 2), find(N - 3) + one[N - 1]) + one[N],find(N-1));
		}
		
		return dp[N];
	}
}

