package SungMin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//11723 집합
		
		HashSet<Integer> hash = new HashSet<Integer>();
		int a = Integer.parseInt(bf.readLine());
		List<Integer> one = new ArrayList<>();
		for(int i=1; i<=20; i++) {
			one.add(i);
		}
		for(int i=0; i<a; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());	
			String b = st.nextToken();
			
			if(b.equals("add")) {
				int c = Integer.parseInt(st.nextToken());
				hash.add(c);
			}
			else if(b.equals("remove")) {
				int c = Integer.parseInt(st.nextToken());
				if(hash.contains(c)) {
					hash.remove(c);
				}
			}
			else if(b.equals("check")) {
				int c = Integer.parseInt(st.nextToken());
				if(hash.contains(c)) {
					bw.write(1+"\n");
				}
				else {
					bw.write(0+"\n");
				}
			}
			else if(b.equals("toggle")) {
				int c = Integer.parseInt(st.nextToken());
				if(hash.contains(c)) {
					hash.remove(c);
				}
				else {
					hash.add(c);
				}
			}
			else if(b.equals("all")) {
				hash = new HashSet<>(one);
			}
			else if(b.equals("empty")) {
				if(!hash.isEmpty()) {
					hash.clear();
				}
			}
		}
		bw.close();
	}
}
