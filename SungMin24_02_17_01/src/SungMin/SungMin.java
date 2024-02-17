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
	//21736 헌내기는 친구가 필요해
	static String one[][];
	static int a,b,sum=0;
	static boolean check[][];
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		a = Integer.parseInt(st.nextToken()) ;//세로
		b = Integer.parseInt(st.nextToken()) ;//가로
		one = new String[a][b];
		check = new boolean[a][b];
		int start1 =0;
		int start2 =0;
		for(int i=0; i<a; i++) {
			StringTokenizer st2 = new StringTokenizer(bf.readLine());
			String c =st2.nextToken();
			for(int j=0; j<b; j++) {
				String d=String.valueOf(c.charAt(j));
				one[i][j] = d;
				if(d.equals("I")) {
					start1 = i;
					start2 = j;
					check[i][j]=true;
				}
				
			}
		}
		bfs(start1,start2);
		if(sum==0) {
			System.out.println("TT");
		}else {
			System.out.println(sum);
		}
		
	}
	static void bfs(int start1, int start2) {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {start1,start2});
		
		int X[] = {-1,+1,0,0};
		int Y[] = {0,0,-1,+1};
		while(!q.isEmpty()) {
			int[] que = q.poll();
			
			for(int i=0; i<4; i++) {
				int x = que[0];
				int y = que[1];
				x+=X[i];
				y+=Y[i];
				
				if(x>=a||y>=b||x<0||y<0) {
					continue;
				}
				if(one[x][y].equals("O") && check[x][y] == false) {
					q.offer(new int[] {x,y});
					check[x][y] = true;
					
				}
				else if(one[x][y].equals("P") && check[x][y] == false) {
					sum+=1;
					q.offer(new int[] {x,y});
					check[x][y] = true;
				}
			}
		}
	}
}

