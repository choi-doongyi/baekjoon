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
		//1158 요세푸스 문제
		Queue<Integer> one = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		for(int i=1; i<=a; i++) {
			one.offer(i);
		}
		int count =0;
		bw.write("<");
		while(!one.isEmpty()) {
			count+=1;
			if(count==b) {
				bw.write(one.poll()+"");
				if(!one.isEmpty()) {
					bw.write(", ");
				}
				else {
					bw.write(">");
				}
				count=0;
			}
			else {
				one.offer(one.poll());
			}
		}
		bw.close();
	}
}
