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
		//1212 8진수 2진수
		String a = bf.readLine();
		String b ="";

		Stack<String> one = new Stack<>();
		for(int i=a.length()-1; i>-1; i--) {	
			int c = Integer.parseInt(String.valueOf(a.charAt(i)));
			while(true) {
				if(c>=4) {
					c-=4;
					b+=1;
					if(c>=2) {
						c-=2;
						b+=1;
						b+=c;
						break;
					}
					else {
						b+=0;
						b+=c;
						break;
					}
				}
				else if(c>=2) {
					c-=2;
					b+=0;
					b+=1;
					b+=c;
					break;
				}
				else {
					b+=0;
					b+=0;
					b+=c;
					break;
				}
			}
			if(i==0) {
				if(b.charAt(0)=='0') {
					if(b.charAt(1)=='0') {
						b=String.valueOf(String.valueOf(b.charAt(2)));
					}
					else {
						b=String.valueOf(b.charAt(1)) +String.valueOf(b.charAt(2));
					}
					
				}
			}
			one.push(b);
			b="";
		}
		int count = one.size();
		if(a.equals("0")) {
			bw.write(0+"");
		}
		else {
			for(int i=0; i<count; i++) {
				bw.write(one.pop()+"");
			}
		}
		bw.close();
	}
}
