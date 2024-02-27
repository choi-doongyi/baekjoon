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
	//14500 테트로미노
	static int one[][];
	static int N,M;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		one = new int[N][M];
		for(int i=0; i<N; i++) {
			StringTokenizer st2 = new StringTokenizer(bf.readLine());
			for(int j=0; j<M; j++) {
				one[i][j] = Integer.parseInt(st2.nextToken());
			}
		}
		
		System.out.println(Math.max(Math.max(Math.max(dfs(), dfs2()), dfs3()), Math.max(dfs5(), dfs4())));
	}
	static int dfs() {
		int max=0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(i+1<N&&j+1<M) {
					int a = one[i][j]+one[i+1][j]+one[i][j+1]+one[i+1][j+1];
					max = Math.max(max, a);
				}
			}
		}
		return max;
	}
	static int dfs2() {
		int max=0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(i+3<N) {
					int a = one[i][j]+one[i+1][j]+one[i+2][j]+one[i+3][j];
					max = Math.max(max, a);
				}
				if(j+3<M) {
					int a = one[i][j]+one[i][j+1]+one[i][j+2]+one[i][j+3];
					max = Math.max(max, a);
				}
			}
		}
		return max;
	}
	static int dfs3() {
		int max=0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(i+2<N&&j+1<M) {
					int a = one[i][j]+one[i+1][j]+one[i+2][j]+one[i][j+1];
					int b = one[i][j]+one[i][j+1]+one[i+1][j+1]+one[i+2][j+1];
					int c = one[i][j]+one[i+1][j]+one[i+2][j]+one[i+2][j+1];
					int d = one[i+2][j]+one[i][j+1]+one[i+1][j+1]+one[i+2][j+1];
					int ga =Math.max(Math.max(a, b), Math.max(c, d)) ;
					
					max =  Math.max(ga, max);
				}
				if(i+1<N&&j+2<M) {
					int a = one[i][j]+one[i][j+1]+one[i][j+2]+one[i+1][j+2];
					int b = one[i][j]+one[i+1][j]+one[i][j+1]+one[i][j+2];
					int c = one[i][j]+one[i+1][j]+one[i+1][j+1]+one[i+1][j+2];
					int d = one[i+1][j]+one[i+1][j+1]+one[i+1][j+2]+one[i][j+2];
					int ga =Math.max(Math.max(a, b), Math.max(c, d)) ;
					
					max =  Math.max(ga, max);
				}
			}
		}
		return max;
	}
	static int dfs4() {
		int max=0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(i+2<N&&j+1<M) {
					int a = one[i][j]+one[i+1][j]+one[i+1][j+1]+one[i+2][j+1];
					int b = one[i][j+1]+one[i+1][j+1]+one[i+1][j]+one[i+2][j];
					
					max = Math.max(Math.max(a, b), max);

				}
				if(i+1<N&&j+2<M) {
					int a = one[i][j]+one[i][j+1]+one[i+1][j+1]+one[i+1][j+2];
					int b = one[i+1][j]+one[i+1][j+1]+one[i][j+1]+one[i][j+2];
					
					max = Math.max(Math.max(a, b), max);

				}
			}
		}
		return max;
	}
	
	static int dfs5() {
		int max=0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(i+1<N&&j+2<M) {
					int a = one[i][j]+one[i][j+1]+one[i+1][j+1]+one[i][j+2];
					int b = one[i+1][j]+one[i+1][j+1]+one[i][j+1]+one[i+1][j+2];
					
					max = Math.max(Math.max(a, b), max);

				}
				
				if(i+2<N&&j+1<M) {
					int a = one[i][j]+one[i+1][j]+one[i+1][j+1]+one[i+2][j];
					int b = one[i][j+1]+one[i+1][j+1]+one[i+1][j]+one[i+2][j+1];
					
					max = Math.max(Math.max(a, b), max);

				}
			}
		}
		return max;
	}
}

