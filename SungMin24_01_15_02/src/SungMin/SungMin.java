package SungMin;

import java.io.BufferedReader;   
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//10799 쇠막대기
		String a = bf.readLine();
		Stack<Character> stack = new Stack<>();
		int i=0;
		int count =0;
		int point = 0;
		while(i<a.length()) {
			if(!stack.isEmpty()) {
				if(stack.peek()=='('&&a.charAt(i)==')') {//레이저
					point+=count;
				}
				else if(stack.peek()==')'&&a.charAt(i)==')'){//문닫음
					count-=1;
				}
				else if(stack.peek()=='('&&a.charAt(i)=='('){//문닫음
					count+=1;
					point+=1;
				}
			}
			stack.add(a.charAt(i));
			i+=1;
		}
		System.out.println(point);
	}
}
