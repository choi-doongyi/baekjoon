package SungMin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		Queue<Integer> queue2 = new LinkedList<>();
		//1966 프린터 큐
		
		int a= Integer.parseInt(bf.readLine());
		for(int i=0; i<a; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int real =0;
			int cc = c+1;
			
			StringTokenizer st2 = new StringTokenizer(bf.readLine());
			for(int j=0; j<b; j++) {
				int d =Integer.parseInt(st2.nextToken());
				queue.offer(d);
				queue2.offer(d);
				if(c==j) {
					real = d;
				}
			}
			int count=1;
			while(!queue.isEmpty()) {
				//System.out.println(cc+ " "+queue.peek()+" "+queue2.peek()+" "+real);
				if(queue2.peek()==queue.peek()) {
					if(cc==1&&queue2.peek()==real) {
						System.out.println(count);
					}
					queue.poll();
					queue2.poll();
					cc-=1;
					count+=1;
				}
				else {
					queue2.offer(queue2.poll());
					if(cc>1) {
						cc-=1;
					}
					else {
						cc = queue2.size();
					}
					
				}
			}
			
		}
		
	}

}
