package SungMin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a =Integer.parseInt(bf.readLine());
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1; i<=a; i++) {
			queue.add(i);
			
		}
		//2164 카드2
		while(queue.size()>1) {
			queue.remove();
			queue.add(queue.poll());
		}
		bw.write(queue.poll()+"\n");
		bw.close();
	}
}
