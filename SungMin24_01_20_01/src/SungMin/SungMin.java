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
		//9613 GCD 합	
		int a =Integer.parseInt(bf.readLine()); 
		int b =1;

		for(int i=0; i<a; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int count = Integer.parseInt(st.nextToken());
			int one[] = new int[count];
			for(int j=0; j<count; j++) {
				one[j]=Integer.parseInt(st.nextToken());
			}
			long sum = 0;
			for(int x=0; x<one.length; x++) {
				for(int y=x+1; y<one.length; y++) {
					sum+=gcd(one[x],one[y]);
				}
			}
			System.out.println(sum);
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
