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
		//17413 단어 뒤집기 2
		String a = bf.readLine();
		Stack<Character> stack = new Stack<>();
		int i =0;
		boolean sungMin = false;
		while(i<a.length()) {
			if(a.charAt(i)=='<') {
				if(!stack.isEmpty()) {

					int c = stack.size();
					for(int j=0; j<c; j++) {
						bw.write(stack.pop()+"");
					}
				}
				sungMin = true;
			}
			if(a.charAt(i)=='>') {
				sungMin = false;
				bw.write(a.charAt(i));
			}
			
			if(sungMin == true) {
				bw.write(a.charAt(i)+"");
			}
			
			else if(a.charAt(i)==' ') {
				if(!stack.isEmpty()) {

					int c = stack.size();
					for(int j=0; j<c; j++) {
						bw.write(stack.pop()+"");
					}
				}
				bw.write(" ");
			}
			else if(a.charAt(i)!='>') {
				stack.add(a.charAt(i));
			}
			
			i++;
		}
		int c = stack.size();
		if(!stack.isEmpty()) {
			for(int j=0; j<c; j++) {
				bw.write(stack.pop());
			}
		}
		bw.close();
		
	}
}
