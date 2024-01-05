package SungMin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Deque<Integer> deque = new ArrayDeque<>();
		//10866 덱
		
		
		int a =Integer.parseInt(bf.readLine());
		for(int i=0; i<a; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			String b = st.nextToken();
			if(b.equals("push_front")) {
				int c = Integer.parseInt(st.nextToken());
				deque.addFirst(c);
			}
			else if(b.equals("push_back")) {
				int c = Integer.parseInt(st.nextToken());
				deque.addLast(c);
				
			}
			else if(b.equals("pop_front")) {
				if(deque.isEmpty()) {
					bw.write(-1+"\n");
					bw.flush();
				}
				else {
					bw.write(deque.pollFirst()+"\n");
					bw.flush();
				}
			}
			else if(b.equals("pop_back")) {
				if(deque.isEmpty()) {
					bw.write(-1+"\n");
					bw.flush();
				}
				else {
					bw.write(deque.pollLast()+"\n");
					bw.flush();
				}
			}
			else if(b.equals("size")) {
				bw.write(deque.size()+"\n");
				bw.flush();
			}
			else if(b.equals("empty")) {
				if(deque.isEmpty()) {
					bw.write(1+"\n");
					bw.flush();
				}
				else {
					bw.write(0+"\n");
					bw.flush();
				}
			}
			else if(b.equals("front")) {
				if(deque.isEmpty()) {
					bw.write(-1+"\n");
					bw.flush();
				}
				else {
					bw.write(deque.peekFirst()+"\n");
					bw.flush();
				}
			}
			else if(b.equals("back")) {
				if(deque.isEmpty()) {
					bw.write(-1+"\n");
					bw.flush();
				}
				else {
					bw.write(deque.peekLast()+"\n");
					bw.flush();
				}
			}
		}
		bw.close();
	}
}
