package SungMin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());	
		int a =Integer.parseInt(st.nextToken());
		int b =Integer.parseInt(st.nextToken());
		Queue<Integer> one = new LinkedList<>();
		Queue<Integer> two = new LinkedList<>();
		//11866 요세푸스 문제 0
		for(int i=1; i<=a; i++) {
			one.offer(i);
		}
		int count=1;
		boolean gamja = true;
		bw.write("<"+"");
		while(true) {
			if(one.isEmpty() && two.isEmpty() ) {break;}
			if (gamja==true) {
				if(one.size()!=0) {
					if(count!=b) {
						two.offer(one.poll());
						
					}
					else {
						if(two.isEmpty() && one.size()==1) {
							bw.write(one.poll()+"");
						}
						else {
							bw.write(one.poll()+", ");
						}
						count = 0;
					}
					count+=1;
				}
				else {
					gamja = false;
				}
			}
			else {
				if(two.size()!=0) {
					
					if(count!=b) {
						one.offer(two.poll());
						
					}
					else {
						if(one.isEmpty() && two.size()==1) {
							bw.write(two.poll()+"");
						}
						else {
							bw.write(two.poll()+", ");
						}
						
						count = 0;
					}
					count+=1;
				}
				else {
					gamja = true;
				}
			}
		}
		bw.write(">");
		bw.close();
		
	}
}
