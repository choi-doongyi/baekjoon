package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;


public class SungMin {
	//11404 플로이드
	static final int INF = 987654321;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(bf.readLine());
		int m = Integer.parseInt(bf.readLine());
		int[][] arr = new int[n + 1][n + 1];
		 
        // 초기값 설정
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = INF;
 
                if (i == j) {
                    arr[i][j] = 0;
                }
            }
        }
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            
            // 출발 도시와 도착 도시가 같지만 시간이 다른 입력값이 들어올 수 있음.
            // 예를 들어 "1 4 1"과 "1 4 2"가 입력으로 들어왔으면,
            // "1 4 1"을 택해야 함.
            arr[a][b] = Math.min(arr[a][b], c); 
		}
		 for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    // 최단경로 초기화
                    if (arr[i][j] > arr[i][k] + arr[k][j]) {
                        arr[i][j] = arr[i][k] + arr[k][j];
                    }
                }
            }
        }
		for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= n; j++) {
                // 갈 수 없는 곳은 0으로 초기화
                if (arr[i][j] == INF) {
                    arr[i][j] = 0;
                }
 
                bw.write(arr[i][j] + " ");
            }
            bw.write("\n");
	    }
        bw.flush();
        bw.close();
        bf.close();
	}
}