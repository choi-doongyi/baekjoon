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
		

		//4153 직각삼각형
		while(true) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int max=0;
			int min=0;
			
			if(a==0 &&b==0 &&c==0) {break;}
			
			if(a>b && a>c) {
				max= a*a;
				min= (b*b)+(c*c);
			}
			else if(b>a && b>c) {
				max= b*b;
				min= (a*a)+(c*c);
			}
			else if(c>a && c>b) {
				max= c*c;
				min= (b*b)+(a*a);
			}
			if(max==min) {bw.write("right\n");}
			else {bw.write("wrong\n");}
		}
		bw.close();
	}
}
