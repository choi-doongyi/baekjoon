package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
 
public class SungMin {
	//1927 최소 힙
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int a =Integer.parseInt(bf.readLine());
		for(int i=0; i<a; i++) {
			int b =Integer.parseInt(bf.readLine());
			if(b==0) {
				if(pq.isEmpty()) {
					System.out.println(0);
				}
				else {
					System.out.println(pq.poll());
				}
			}
			else {
				pq.add(b);
			}
		}
	}
}

