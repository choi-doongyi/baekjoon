package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class SungMin {
	//5430 AC
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(bf.readLine());
		for(int i=0; i<T; i++) {
			Deque<Integer> deque = new ArrayDeque<>();
			String p = bf.readLine();
			
			int n = Integer.parseInt(bf.readLine());
			String x = bf.readLine();
			String x1=x.substring(1,x.length()-1);
			
			String x2[]= x1.split(",");

			for(int j=0; j<n; j++) {
				deque.add(Integer.parseInt(x2[j]));
			}
			
			boolean rSwich = false;
			boolean error = false;
			for(int j=0; j<p.length(); j++) {
				if(p.charAt(j)=='R') {
					if(rSwich) {
						rSwich=false;
					}
					else {
						rSwich=true;
					}
				}
				else {
					if(deque.isEmpty()) {
						error = true; // error 이 트루이면 오류가 났다는 뜻
					}
					else {
						if(rSwich) {//true 면 스택으로 뒤에서 뽑아야함
							deque.removeLast();
						}
						else {
							deque.remove();
						}
					}
				}
			}
			if(error) {
				System.out.println("error");
			}
			else {
				int su = deque.size();
				bw.write("[");
				if(rSwich==false) {
					for(int j=0; j<su; j++) {
						bw.write(deque.poll()+"");
						if(j!=su-1) {
							bw.write(",");
						}
					}
				}
				else {
					for(int j=0; j<su; j++) {
						bw.write(deque.pollLast()+"");
						if(j!=su-1) {
							bw.write(",");
						}
					}
				}
				
				bw.write("]\n");
			}
		
			bw.flush();
		}
			
		
	}
}

