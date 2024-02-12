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
	static int sum=0;
	//2606 바이러스
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		node = Integer.parseInt(bf.readLine());
		line = Integer.parseInt(bf.readLine());
		start= 1;
		
		arr = new int[node+1][node+1];
		check = new boolean[node+1];
		
		for(int i = 0 ; i < line ; i ++) {
			StringTokenizer str = new StringTokenizer(bf.readLine());
			
			int a = Integer.parseInt(str.nextToken());
			int b = Integer.parseInt(str.nextToken());
			
			arr[a][b] = arr[b][a] =  1;	
		}
			check = new boolean[node+1];
			
			bfs(start);
			
			System.out.println(sum-1);
		
		}
	
	
	public static void bfs(int start) {
		queue.add(start);
		check[start] = true;
		
		while(!queue.isEmpty()) {
			
			start = queue.poll();
			sum+=1;
			
			for(int i = 1 ; i <= node ; i++) {
				if(arr[start][i] == 1 && !check[i]) {
					queue.add(i);
					check[i] = true;
				}
			}
		}
	}
}
