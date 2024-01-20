package SungMin;

import java.io.BufferedReader;   
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//17087 숨바꼭질 6
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken()); //수빈 위치
		StringTokenizer st2 = new StringTokenizer(bf.readLine());
		int one[] = new int[n];
		for(int i=0; i<n; i++) {
			one[i] = Math.abs(Integer.parseInt(st2.nextToken())-s);	
		}
		int b =0;
		for(int i=0; i<n-1; i++) {
			if(i==0) {
				b = gcd(one[i],one[i+1]);
			}
			else {
				b= gcd(b,one[i+1]);
			}

		}
		if(n==1) {
			System.out.println(one[0]);
		}
		else {
			System.out.println(b);
		}
		

	}
	public static int gcd(int a, int b) {
	    while (b != 0) {
	        int temp = b;
	        b = a % b;
	        a = temp;
	    }
	    return a;
	}
}
