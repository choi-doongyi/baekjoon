package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;


public class SungMin {
	//1987 알파벳
	static int r,c,value=0;
	static char[][] english;
	static boolean[] check;
	static int X[]={1,-1,0,0};
	static int Y[] = {0,0,1,-1};
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		english = new char[r][c];
		check = new boolean[26];
		for(int i=0; i<r; i++) {
			String a = bf.readLine();
			for(int j=0; j<c; j++) {
				english[i][j] = a.charAt(j);
			}
		}
		bfs(0,0,0);
		if(value ==0) {
			System.out.println(1);
		}
		else {
			System.out.println(value);
		}
		
		
		
    }
	static void bfs(int x,int y, int count) {
		if(check[english[x][y]-'A']) {
			value = Math.max(value, count);
			return;
		}
		else {
			check[english[x][y]-'A']=true;
			for(int i=0; i<4; i++) {
				int cx = x+X[i];
				int cy = y+Y[i];
				
				if(cx>=0 && cx<r&& cy>=0&&cy<c) {
					bfs(cx,cy,count+1);
				}
			}
			check[english[x][y]-'A']=false;
		}
		
		
	}
}