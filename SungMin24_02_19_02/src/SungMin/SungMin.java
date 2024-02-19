package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class SungMin {
	//11279 최대 힙
	static int count = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0; i<N; i++) {
			int a = Integer.parseInt(bf.readLine());
			if(a>0) {
				maxHeap.add(a);
			}
			else {
				if(maxHeap.isEmpty()) {
					System.out.println(0);
				}
				else {
					System.out.println(maxHeap.poll());
				}
				
			}
		}
	}
}

