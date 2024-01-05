package SungMin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack<Integer> stackInt = new Stack<>();
		//10828 스택
		
		int a =Integer.parseInt(bf.readLine());
		
		for(int i=0; i<a; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			String b = st.nextToken();
			if(b.equals("push")) {
				int c =Integer.parseInt(st.nextToken());
				stackInt.push(c);
			}
			else if(b.equals("pop")) {
				if(stackInt.size()>0) {
					int dd =stackInt.pop();
					bw.write(dd+"\n");
					bw.flush();
				}
				else {
					bw.write(-1+"\n");
					bw.flush();
					
				}
				
			}
			else if(b.equals("size")) {
				int dd =stackInt.size();
				bw.write(dd+"\n");
				bw.flush();
			}
			else if(b.equals("empty")) {
				if(!stackInt.isEmpty()) {
					bw.write(0+"\n");
					bw.flush();
				}
				else {
					bw.write(1+"\n");
					bw.flush();
				}
			}
			else if(b.equals("top")) {
				if(!stackInt.isEmpty()) {
					int dd =stackInt.peek();
					bw.write(dd+"\n");
					bw.flush();
				}
				else {
					bw.write(-1+"\n");
					bw.flush();
				}
			}
		}
		bw.close();
	}
}
