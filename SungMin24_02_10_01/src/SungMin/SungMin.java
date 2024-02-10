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
	static boolean[] check;
	static int[][] arr;
	static int node, line, start;
	static Queue<Integer> queue = new LinkedList<>();
	static StringBuilder sb = new StringBuilder();
	//1260 DFS 와 BFS
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		node = Integer.parseInt(st.nextToken());
		line = Integer.parseInt(st.nextToken());
		start= Integer.parseInt(st.nextToken());
		
		arr = new int[node+1][node+1];
		check = new boolean[node+1];
		
		for(int i = 0 ; i < line ; i ++) {
			StringTokenizer str = new StringTokenizer(bf.readLine());
			
			int a = Integer.parseInt(str.nextToken());
			int b = Integer.parseInt(str.nextToken());
			
			arr[a][b] = arr[b][a] =  1;	
		}
			//sb.append("\n");
			dfs(start);
			sb.append("\n");
			check = new boolean[node+1];
			
			bfs(start);
			
			System.out.println(sb);
		
		}
	
	public static void dfs(int start) {
		
		check[start] = true;
		sb.append(start + " ");
		
		for(int i = 0 ; i <= node ; i++) {
			if(arr[start][i] == 1 && !check[i])
				dfs(i);
		}
		
	}
	
	public static void bfs(int start) {
		queue.add(start);
		check[start] = true;
		
		while(!queue.isEmpty()) {
			
			start = queue.poll();
			sb.append(start + " ");
			
			for(int i = 1 ; i <= node ; i++) {
				if(arr[start][i] == 1 && !check[i]) {
					queue.add(i);
					check[i] = true;
				}
			}
		}
	}
}

