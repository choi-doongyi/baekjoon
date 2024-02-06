package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;
 
public class SungMin {
	//11054 가장 긴 바이토닉 부분 수열
	static Integer dp[];
	static Integer dp2[];
	static int one[];
	static int max =0;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		
		
		dp = new Integer[n+1];
		dp2 = new Integer[n+1];
		one = new int[n+1];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=1; i<=n; i++) {
			one[i] = Integer.parseInt(st.nextToken());
		}
		dp[1] = 1;
		dp2[1] =1;
		
		for(int i=1; i<=n; i++) {
			lis(i);
			lds(i);
		}
		int max =1;
		for(int i=1; i<=n; i++) {
			if(max<dp[i]+dp2[i]) {
				
				max = dp[i]+dp2[i];
				if(dp[i]!=1) {max-=1;}
				if(dp[i]==1 && dp2[i]==1) {max =1;}
			}
			
		}
		//중복되는 문제
		System.out.println(max);
	}
	static int lis(int N) {
		// 아직 탐색하지 않는 N번째 계단일 경우
		if(dp[N] == null) {
			dp[N] =1;
			for(int i=N-1; i>=1; i--) {
				if(one[N]>one[i]) {
					dp[N]=Math.max(dp[N], lis(i)+1);
				}
			}
		}
		return dp[N];
	}

	static int lds(int N) {

        if(dp2[N] == null) {

            dp2[N] = 1;
            for(int i = N+1; i < dp.length; i++) {
                if(one[i] < one[N]) {
                    dp2[N] = Math.max(dp2[N], lds(i) + 1);
                }
            }
        }
        return dp2[N];
    }
}

