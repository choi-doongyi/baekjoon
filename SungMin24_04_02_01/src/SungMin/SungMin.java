package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class SungMin {
	//15649 N과 M (3)
	static int N, M;
	public static int[] arr;
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(bf.readLine());
		
		N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        dfs(0);
        System.out.println(sb);
	}
	public static void dfs(int depth) {
		// 깊이가 M이랑 같아지면 출력후 return
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append('\n');
			return;
		}
 
		for (int i = 1; i <= N; i++) {
			arr[depth] = i;
			dfs(depth + 1);
		}
	}
}