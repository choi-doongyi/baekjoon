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
		//1935 후위 표기식2
		int a = Integer.parseInt(bf.readLine());
		String b = bf.readLine();
		Stack<Double> one = new Stack<>();
		int c[] = new int[26];
		for(int i=0; i<a; i++) {
			c[i] = Integer.parseInt(bf.readLine());
		}
		
		for(int i=0; i<b.length(); i++) {
			if(Character.isUpperCase(b.charAt(i))) {
				one.push((double) c[b.charAt(i)-'A']);
				
			}
			else {
				
				if(b.charAt(i)=='+') {
					one.push(one.pop()+one.pop());
				}
				else if(b.charAt(i)=='-') {
					Double a1 = one.pop();
					Double a2 = one.pop();
					one.push(a2-a1);
				}
				else if(b.charAt(i)=='/') {
					Double a1 = one.pop();
					Double a2 = one.pop();
					one.push(a2/a1);
				}
				else if(b.charAt(i)=='*') {
					one.push(one.pop()*one.pop());
				}
			}
		}
		
		System.out.println(String.format("%.2f",one.pop()));
		
	}
}
