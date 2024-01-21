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
		//1373 2진수 8진수
		String a = bf.readLine();
		int b =0;
		int count =1;
		Stack<Integer> one = new Stack<>();
		for(int i=a.length()-1; i>-1; i--) {	
			if(count==8) {
				count=1;
				one.push(b);
				b=0;
				
			}
			b+=Integer.parseInt(String.valueOf(a.charAt(i)))*count;
			count*=2;
		}
		if(b!=0) {
			one.push(b);
			b=0;
		}
		if(one.size()==0) {
			bw.write(0+"");
		}
		int count2 = one.size();
		for(int i=0; i<count2; i++) {
			bw.write(one.pop()+"");
		}
		bw.close();
	}
}
