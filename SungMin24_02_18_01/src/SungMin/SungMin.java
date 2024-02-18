package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class SungMin {
	//7576 토마토
	
	static class tomato{
		int x;
		int y;
		int day;
		public tomato(int x, int y, int day) {
			this.x =x ;
			this.y = y;
			this.day = day;
		}
	}
	
	static int one[][];
	static boolean check[][];
	static int a,b;
	static int sum=0;
	static Queue<tomato> gamja = new LinkedList<tomato>();
	
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		a =Integer.parseInt(st.nextToken()); //가로
		b =Integer.parseInt(st.nextToken()); //세로
		
		
		
		check = new boolean[b][a];
		one = new int[b][a];
		for(int i=0; i<b; i++) {
			StringTokenizer st2 = new StringTokenizer(bf.readLine());
			for(int j=0; j<a; j++) {
				int c =Integer.parseInt(st2.nextToken());
				one[i][j]=c;
				if(c==1) {
					gamja.offer(new tomato(i,j,0));
					check[i][j]=true;
				}
			}
		}
		dfs();
		
	}
	static void dfs() {
		int X[] = {0,0,-1,1};
		int Y[] = {-1,1,0,0};
		int day =0;
		while(!gamja.isEmpty()) {
			tomato poll = gamja.poll();
			for(int i=0; i<4; i++) {
				int x =poll.x;
				int y =poll.y;
				day = poll.day;
				x += X[i];
				y += Y[i];
				
				if(x>=b||x<0||y>=a||y<0) {
					continue;
				}
				
				if(check[x][y]==false && one[x][y]!=-1) {
					check[x][y]=true;
					one[x][y]=1;
					gamja.offer(new tomato(x,y,day+1));
					
				}
			}
			
		}
		if(check2()) {
			System.out.println(day);
		}
		else {
			System.out.println(-1);
		}
		
	}
	static boolean check2() {
		for(int i=0; i<b; i++) {
			for(int j=0; j<a; j++) {
				if(one[i][j]==0) {return false;}
			}
		}
		return true;
	}
}

