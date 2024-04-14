package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SungMin {
	//6603 로또
	static int n;
    public static int[] arr;	
    public static int[] one;
    public static boolean check[];
    public static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		while(true) {
			sb = new StringBuilder();
			st = new StringTokenizer(bf.readLine());
			n = Integer.parseInt(st.nextToken());
			arr = new int[n];
			check = new boolean[n];
			one = new int[6];
			
			if(n==0) {
				break;
			}
	        for(int i=0; i<n; i++) {
	        	arr[i] = Integer.parseInt(st.nextToken());
	        }
	        Arrays.sort(arr);
	        lotto(0,0);
			System.out.println(sb);
		}
		
	}
	public static void lotto(int a,int count) {
		if(count==6) {
			for(int i=0; i<6; i++) {
				sb.append(one[i]+" ");
			}
			sb.append("\n");
			return;
		}
		
		int value = -1;
		for(int i=a; i<n; i++) {
			int now = arr[i];
			if(check[i]||now==value) {
				continue;
			}
			else{
				value = now;
				one[count] = arr[i];
				check[i] = true;
				lotto(i,count+1);
				check[i] = false;
			}
		}
	}
}