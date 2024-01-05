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
		
		
		Queue<Integer> queue = new LinkedList<>();
		int a =Integer.parseInt(bf.readLine());
		int sung=0;
		for(int i=0; i<a; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			String b = st.nextToken();
			
			//10845 큐
			if(b.equals("push")) {
				sung = Integer.parseInt(st.nextToken());
				queue.offer(sung);
			}
			else if(b.equals("pop")) {
				
				if(!queue.isEmpty()) {
					
					bw.write(queue.poll()+"\n"); 
					bw.flush();
				}
				else {
					bw.write(-1+"\n"); 
					bw.flush();
				}
				
			}
			else if(b.equals("size")) {
				
				bw.write(queue.size()+"\n"); 
				bw.flush();
			}
			else if(b.equals("empty")) {
				if(!queue.isEmpty()) {
					
					bw.write(0+"\n"); 
					bw.flush();
				}
				else {
					bw.write(1+"\n"); 
					bw.flush();
				}
			}
			else if(b.equals("front")) {
				if(!queue.isEmpty()) {
					
					bw.write(queue.peek()+"\n"); 
					bw.flush();
				}
				else {
					bw.write(-1+"\n"); 
					bw.flush();
				}
			}
			else if(b.equals("back")) {
				if(!queue.isEmpty()) {
					
					bw.write(sung+"\n"); 
					bw.flush();
				}
				else {
					bw.write(-1+"\n"); 
					bw.flush();
				}
			}
			
		}
		
	}
}
