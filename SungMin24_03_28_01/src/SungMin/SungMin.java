package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class SungMin {
	//15666 N과 M (12)
	static int n,m;
	static int[] Num,printArr;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(bf.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		Num = new int[n];
		printArr = new int[m];
		st = new StringTokenizer(bf.readLine());
		for(int i=0; i<n; i++) {
			Num[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(Num);
		gamja(0,0);
		System.out.println(sb);
	}
	static void gamja(int a, int b) {
		if(b==m) {
			for(int i=0; i<m; i++) {
				sb.append(printArr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		int before = -1;	
		for(int i=a; i<n; i++) {
			int now = Num[i];
			if(before != now) {
				before = now;
				printArr[b] = Num[i];
				gamja(i, b + 1);
			}
		}
	}
    
}