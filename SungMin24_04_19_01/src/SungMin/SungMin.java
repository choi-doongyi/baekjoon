package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class SungMin {
	//2961 도영이가 만든 맛있는 음식
	static int n,value = 2000000000;
    static boolean[] visited;
    static int[]list;
    static int[][]arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		
		
		
		arr = new int[n][2];
		list = new int [2];
		visited = new boolean[n];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<2; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		gamja(0,1,0);
		System.out.println(value);
	}
	static void gamja(int count,int s,int b) {
		if(count!=0) {
			value = Math.min(value, Math.abs(s-b));
		}
		
		if(count==n) {
			return;
		}
		
		for(int i=0; i<n; i++) {
			if(!visited[i]) {
				visited[i] = true;
				int ss = s*arr[i][0];
				int bb = b+arr[i][1];
				gamja(count+1,ss,bb);
				visited[i] = false;
			}
		}
	}
}