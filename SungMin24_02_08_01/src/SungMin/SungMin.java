package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;
 
public class SungMin {
	//17404 RGB거리 2
	final static int Red = 0;
	final static int Green = 1;
	final static int Blue = 2;
	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
 
		int N = Integer.parseInt(br.readLine());
 
		int[][] arr = new int[N+1][3];
		int[][] dp = new int [N+1][3];
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
 
			arr[i][Red] = Integer.parseInt(st.nextToken());
			arr[i][Green] = Integer.parseInt(st.nextToken());
			arr[i][Blue] = Integer.parseInt(st.nextToken());
 
		}
		int answer =1000*1000;
		// k = 0 -> RED, 1 -> GREEN, 2 -> BLUE로 첫 집을 칠하는 경우이다.
        for(int k = 0; k < 3; k++) {
            //RED, GREEN, BLUE로 칠하는 경우 각 색을 제외한 나머지는 INF로 초기화 해준다.
            for(int i = 0 ; i < 3; i++) {
                if(i == k) dp[1][i] = arr[1][i];
                else dp[1][i] = 1000*1000;
            }

            // 열의 값인 0 -> RED, 1 -> GREEN, 2 -> BLUE로 칠했을 때의 최소값을 의미한다.
            for (int i = 2; i <= N; i++) {
                dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + arr[i][0];
                dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + arr[i][1];
                dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + arr[i][2];
            }

            // 정답인 최솟값을 구하는 부분
            for(int i = 0 ; i < 3; i++)
                if(i != k) answer = Math.min(answer, dp[N][i]);
        }
 
		System.out.println(answer);
	}
}
													