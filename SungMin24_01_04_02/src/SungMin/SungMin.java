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
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		//2609 최대공약수와 최소공배수
		
		int a =Integer.parseInt(st.nextToken());
		int b =Integer.parseInt(st.nextToken());	
		int max=0;
		for(int i=1; i<=a; i++) {
			if(a%i==0 && b%i==0) {
				if(max<i) {max = i;}
			}
		}
		if(a==1) {
			bw.write(1+"\n");
			bw.write(b+"\n");
		}
		else if(b==1) {
			bw.write(1+"\n");
			bw.write(a+"\n");
		}
		else {
			bw.write(max+"\n");
			bw.write((a/max)*(b/max)*max+"\n");
		}
		
		bw.close();
	}
}
