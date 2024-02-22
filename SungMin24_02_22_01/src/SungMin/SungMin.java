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
	//2667 단지번호붙이기
	static int[][] one;
	static boolean check[][];
	static int a;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		a = Integer.parseInt(bf.readLine());
		one = new int[a][a];
		check = new boolean[a][a];
		for(int i=0; i<a; i++) {
			String b = bf.readLine();
			for(int j=0; j<a; j++) {
				one[i][j]=Integer.parseInt(String.valueOf(b.charAt(j)));
			}
		}
		int count =0;
		ArrayList<Integer> gam = new ArrayList<>();
		for(int i=0; i<a; i++) {
			
			for(int j=0; j<a; j++) {
				if(check[i][j]==false&&one[i][j]==1) {
					gam.add(dfs(i,j));
					count+=1;
				}
			}
		}
		Collections.sort(gam);
		int gam1 = gam.size();
		System.out.println(count);
		for(int i=0; i<gam1; i++) {
			System.out.println(gam.get(i));
		}
		
		
	}
	public static int dfs(int i, int j) {
		int count =1;
		Queue<int[]> q = new LinkedList<>();
		q.add(new int []{i,j});
		check[i][j]= true;
		int X[] = {1,-1,0,0};
		int Y[] = {0,0,1,-1};
		while(!q.isEmpty()) {
			int[] qoll = q.poll();
			for(int t=0; t<4; t++) {
				int x = qoll[0];
				int y = qoll[1];
				x+=X[t];
				y+=Y[t];
				
				if(x<0||y<0||x>=a||y>=a) {
					continue;
				}
				if(one[x][y]!=0&&check[x][y]==false) {
					check[x][y]=true;
					q.add(new int[] {x,y});
					count+=1;
				}
			}
		}
		return count;
	}
}

