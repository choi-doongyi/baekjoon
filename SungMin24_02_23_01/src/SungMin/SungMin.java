package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class SungMin {
	//11286 절대값 힙
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		PriorityQueue<Integer> pQL = new PriorityQueue<>();
		PriorityQueue<Integer> pQH = new PriorityQueue<>(Collections.reverseOrder());
		int a = Integer.parseInt(bf.readLine());
		for(int i=0; i<a; i++) {
			int b = Integer.parseInt(bf.readLine());
			if(b<0) {
				pQH.add(b);
			}else if(b>0) {
				pQL.add(b);
			}else {
				if(!pQL.isEmpty()&&!pQH.isEmpty()) {
					if(Math.abs(pQL.peek())<Math.abs(pQH.peek())) {
						System.out.println( pQL.poll());
					}
					else{
						System.out.println( pQH.poll());
					}
				}
				else {
					if(!pQL.isEmpty()) {
						System.out.println(pQL.poll());
					}
					else if(!pQH.isEmpty()) {
						System.out.println(pQH.poll());
					}
					else {
						System.out.println(0);
					}
				}
			}
		}
	}
}

