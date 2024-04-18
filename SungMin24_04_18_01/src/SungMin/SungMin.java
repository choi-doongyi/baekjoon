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
	//18429 근손실
	static int n,k,count;
    static boolean[] visited;
    static int[]arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		
		arr = new int[n];
		visited = new boolean[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		gamja(0,500);
		System.out.println(count);
	}
	static void gamja(int step, int weight) {
		int weight2 = weight-k;
		if(step==n) {
			count+=1;
			return;
		}
		for(int i=0; i<n; i++) {
			if(weight2+arr[i]>=500 && !visited[i]) {
				visited[i]=true;
				gamja(step+1,weight2+arr[i]);
				visited[i]=false;
			}
		}
	}
}