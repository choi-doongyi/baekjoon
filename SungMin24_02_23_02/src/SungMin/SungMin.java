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
	//10026 적록색약
	static Character one[][];
	static boolean check[][];
	static boolean check2[][];
	static int a;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		a = Integer.parseInt(bf.readLine());
		one = new Character[a][a];
		check = new boolean[a][a]; //색약이 아님
		check2 = new boolean[a][a]; //색약임
		for(int i=0; i<a; i++) {
			String b = bf.readLine();
			for(int j=0; j<a; j++) {
				one[i][j]=b.charAt(j);
			}
		}
		int count1 = 0;
		int count2 = 0;
		for(int i=0; i<a; i++) {
			for(int j=0; j<a; j++) {
				if(check[i][j]==false) {
					dfs(i,j,one[i][j]);
					count1+=1;
				}
				
				if(check2[i][j]==false) {
					dfs2(i,j,one[i][j]);
					count2+=1;
				}
			}
		}
		System.out.print(count1+" "+count2);
	}
	public static void dfs(int i, int j,char gam) {
		char scan = gam;
		check[i][j]=true;
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {i,j});
		int X[]={1,-1,0,0};
		int Y[]={0,0,1,-1};
		while(!q.isEmpty()) {
			int poll[] = q.poll();
			
			for(int t=0; t<4; t++) {
				int x = poll[0];
				int y = poll[1];
				x+=X[t];
				y+=Y[t];
				
				if(x>=a||y>=a||x<0||y<0) {
					continue;
				}
				
				if(one[x][y]==scan && check[x][y]==false) {
					q.add(new int[] {x,y});
					check[x][y]=true;
				}
			}
		}
	}
	
	public static void dfs2(int i, int j,char gam) {
		char scan = gam;
		check2[i][j]=true;
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {i,j});
		int X[]={1,-1,0,0};
		int Y[]={0,0,1,-1};
		while(!q.isEmpty()) {
			int poll[] = q.poll();
			
			for(int t=0; t<4; t++) {
				int x = poll[0];
				int y = poll[1];
				x+=X[t];
				y+=Y[t];
				
				if(x>=a||y>=a||x<0||y<0) {
					continue;
				}
				if(scan =='R'||scan=='G') {
					if(one[x][y]!='B' && check2[x][y]==false) {
						q.add(new int[] {x,y});
						check2[x][y]=true;
					}
				}
				else {
					if(one[x][y]==scan && check2[x][y]==false) {
						q.add(new int[] {x,y});
						check2[x][y]=true;
					}
				}
				
			}
		}
	}
}

