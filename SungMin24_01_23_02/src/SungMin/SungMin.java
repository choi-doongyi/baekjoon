package SungMin;

import java.io.BufferedReader;   
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//15988 123 더하기
		int a = Integer.parseInt(bf.readLine());
		long one[] = new long[1000002];
		int two[] = new int[a];
		one[0] =1;
		one[1] =2;
		one[2] =4;
		one[3] =7;
		int max=0;
		for(int i=0; i<a; i++) {
			int b = Integer.parseInt(bf.readLine());
			two[i] = b;
			if(b>max) {max=b;}
		}
		for(int i=4; i<=max+1; i++) {
			one[i]=(one[i-1]+one[i-2]+one[i-3])%1000000009;
		}
		for(int i=0; i<two.length; i++) {
			System.out.println(one[two[i]-1]);
		}
		
	}
}
