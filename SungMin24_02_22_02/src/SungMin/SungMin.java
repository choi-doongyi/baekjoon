package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class SungMin {
	//1389 케빈 베이컨의 6단계 법칙
	static int[][] one;
	static Integer check[];
	static int a;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		one = new int[a+1][a+1];
		
		for(int i=0; i<b; i++) {
			StringTokenizer st2 = new StringTokenizer(bf.readLine());
			int a1=Integer.parseInt(st2.nextToken());
			int a2=Integer.parseInt(st2.nextToken());
			one[a1][a2]=1;
			one[a2][a1]=1;
		}
		int min = 1000000;
		int minValue =0;
		for(int i=1; i<=a; i++) {
			check = new Integer[a+1];
			int gam = dfs(i);
			if(gam<min) {
				min = gam;
				minValue=i;
			}
		}
		System.out.println(minValue);
	}
	public static int dfs(int i) {
		Queue<Integer> q = new LinkedList<>();
		check[i] = 0;
		for(int t=1; t<=a; t++) {
			if(one[i][t]==1) {
				q.add(t);
				check[t]= 1;
			}
		}

		while(!q.isEmpty()) {
			int qoll = q.poll();
			for(int t =1; t<=a; t++) {
				if(one[qoll][t]==1 && check[t]==null) {
					check[t] = check[qoll]+1;
					q.add(t);
				}
			}
		}
		int sum=0;
		for(int t=1; t<=a; t++) {
			if(check[t]!=null) {
				sum+=check[t];
			}
		}
		
		return sum;
	}
}

