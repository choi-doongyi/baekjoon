package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class SungMin {
	//16953 A -> B
	static Queue<int[]> q = new LinkedList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		System.out.println( dfs(a,b));
	}
	static int dfs(int a,int b) {
		q.add(new int[] {a,1});
		while(!q.isEmpty()) {
			int poll[] = q.poll();
			
			int one =0;
			if(poll[0]<100000000) {
				one = Integer.parseInt( String.valueOf(poll[0])+"1");
			}
			else {
				one = 1000000001;
			}
			if(poll[0]*2==b||one==b) {
				return poll[1]+1;
			}
			
			if(poll[0]*2<=1000000000) {
				q.add(new int []{poll[0]*2,poll[1]+1});
				
			}
			if(one<=1000000000) {
				q.add(new int[] {one,poll[1]+1});
			}
		}
		return -1;
	}
}

