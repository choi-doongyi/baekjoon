package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
 
public class SungMin {
	//11659 구간 합 구하기 4
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		StringTokenizer st2 = new StringTokenizer(bf.readLine());
		int one[] = new int[a+1];
		int sum[] = new int[a+1];
		for(int i=0; i<a; i++) {
			one[i]=Integer.parseInt(st2.nextToken());
		}
		sum[0] = one[0];
		for(int i=1; i<a; i++) {
			sum[i] = sum[i-1]+one[i];
		}
		for(int i=0; i<b; i++) {
			StringTokenizer st3 = new StringTokenizer(bf.readLine());
			int a1 =Integer.parseInt(st3.nextToken())-1;
			int a2 =Integer.parseInt(st3.nextToken())-1;
			if(a1>0&&a1!=a2) {
				System.out.println(sum[a2]-sum[a1-1]);
			}
			else if(a1==a2) {
				System.out.println(one[a1]);
			}
			else {
				System.out.println(sum[a2]);
				
			}
		}
	}
}

