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
	//1107 리모콘
	static int N,M;
	static Integer check[] = new Integer[1000000];
	static Queue<Integer> q = new LinkedList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(bf.readLine());
		M = Integer.parseInt(bf.readLine());
		boolean button[] = new boolean[10];
		if(M!=0) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int i=0; i<M; i++) {
				button[ Integer.parseInt(st.nextToken())]=true;
			}
		}
		
		
		

		for(int i=0; i<1000000; i++) {
			String a = String.valueOf(i);
			boolean gamja = true;
			for(int j=0; j<a.length(); j++) {
				if(button[(int)a.charAt(j)-'0']==true) {
					gamja = false;
				}
			}
			if(gamja) {
				check[i]=a.length();
				q.add(i);
			}
		}
		check[100] =0;
		if(button[1]==true||button[0]==true) {
			q.add(100);
		}
		System.out.println(dfs()); 
	}
	static int dfs() {
		int X[] = {1,-1};
		while(!q.isEmpty()) {
			int poll = q.poll();
			for(int i=0; i<2; i++) {
				int value = poll+X[i];
				
				if(value<0||value>=1000000) {
					continue;
				}
				if(check[value]!=null) {
					if(check[value]>check[poll]+1) {
						check[value] = check[poll]+1;
						q.add(value);
					}
				}
				else {
					check[value] =check[poll]+1;
					q.add(value);
				}
				
			}
		}
		
		return check[N];
	}
}

