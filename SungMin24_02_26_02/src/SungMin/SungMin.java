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
	//7569 토마토
	static boolean check[][][];
	static int tomato[][][];
	static int M,N,H;
	static Queue<tomato> q = new LinkedList<tomato>();
	static int[] X= {0,0,0,0,1,-1};
	static int[] Y= {0,0,1,-1,0,0};
	static int[] Z = {1,-1,0,0,0,0};
	
	static class tomato{
		int x;
		int y;
		int z;
		int day;
		public tomato(int x,int y,int z, int day) {
			this.x = x;
			this.y = y;
			this.z = z;
			this.day = day;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		
		tomato = new int[H][N][M];
		check = new boolean[H][N][M];
		
		for(int i=0; i<H; i++) {
			for(int j=0; j<N; j++) {
				StringTokenizer st2 = new StringTokenizer(bf.readLine());
				for(int x=0; x<M; x++) {
					int mato =Integer.parseInt(st2.nextToken());
					tomato[i][j][x] = mato;
					
					if(mato ==1) {
						q.add(new tomato(i,j,x,0));
						check[i][j][x]=true;
					}
				}
			}
		}
		System.out.println(dfs());
	}
	static int dfs() {
		int maxDay =0;
		while(!q.isEmpty()) {
			tomato poll=q.poll();
			for(int i=0; i<6; i++) {
				int x =poll.x;
				int y =poll.y;
				int z =poll.z;
				x+=X[i];
				y+=Y[i];
				z+=Z[i];
				
				if(x<0||y<0||z<0||x>=H||y>=N||z>=M) {
					continue;
					//x == 1 판 2판 y == 위 아래 z == 좌우
				}
				if(tomato[x][y][z]==0&&check[x][y][z]==false) {
					check[x][y][z] = true;
					q.add(new tomato(x,y,z,poll.day+1));
					if(poll.day+1>maxDay) {
						maxDay = poll.day+1;
					}
				}
			}
		}
		if(check2()) {
			return maxDay;
		}
		else {
			return -1;
		}
	}
	static boolean check2() {
		boolean gamja=true;
		for(int i=0; i<H; i++) {
			for(int j=0; j<N; j++) {
				for(int x=0; x<M; x++) {
					if(check[i][j][x]!=true&&tomato[i][j][x]!=-1) {
						gamja = false;
					}
				}
			}
		}
		return gamja;
	}
}

