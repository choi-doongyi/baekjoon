package SungMin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//4949 균형잡힌 세상
		while(true) {
			
			String a =bf.readLine();

			if(a.equals(".")) {break;}
			Queue<String> queue = new LinkedList<>();
			Stack<String> stack = new Stack<>();

			for(int i=0; i<a.length(); i++) {
				
				String b =String.valueOf(a.charAt(i));
				if(b.equals("(")||b.equals(")")||b.equals("[")||b.equals("]")){
					queue.offer(b);
				}
			}
			boolean sungmin = true;
			int queueSize = queue.size();
			for(int i=0; i<queueSize; i++) {
				if(queue.peek().equals("(")||queue.peek().equals("[")) {
					stack.add(queue.poll());
				}
				else if(queue.peek().equals(")")||queue.peek().equals("]")){
					if(stack.isEmpty()) {
						sungmin = false;
					}
					else if(queue.peek().equals(")")&&!stack.peek().equals("(")) {
						sungmin = false;
					}
					else if(queue.peek().equals("]")&&!stack.peek().equals("[")) {
						sungmin = false;
					}
					else {
						stack.pop();
						queue.poll();
					}
				}
				
			}
			if(sungmin && stack.size()==0) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
	
	}
}
