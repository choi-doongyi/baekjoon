package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class SungMin {
	//2178 미로 탐색
	static int one[][];
	static boolean check[][];
	static int N,M;
	static class gamja{
		int x;
		int y;
		int su;
		public gamja(int x,int y,int su) {
			this.x =x;
			this.y =y;
			this.su = su;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		one = new int[N][M];
		check = new boolean[N][M];
		for(int i=0; i<N; i++) {
			String gamja = bf.readLine();
			for(int j=0; j<M; j++) {
				one[i][j]=Integer.parseInt(String.valueOf(gamja.charAt(j)));
			}
		}
		dfs();
	}
	static void dfs() {
		Queue<gamja> que = new LinkedList<gamja>();
		que.add(new gamja(0,0,0));
		check[0][0]=true;
		int X[] = {0,0,1,-1};
		int Y[] = {1,-1,0,0};
		while(!que.isEmpty()) {
			gamja poll = que.poll();
			for(int i=0; i<4; i++) {
				int x = poll.x;
				int y = poll.y;
				x+=X[i];
				y+=Y[i];
				if(x<0||y<0||x>=N||y>=M) {
					continue;
				}
				
				if(check[x][y]==false && one[x][y]==1) {
					if(x==N-1&&y==M-1) {
						System.out.println(poll.su+2);
					}
					check[x][y] = true;
					que.add(new gamja(x,y,poll.su+1));
				}
			}
		}
	}
}

