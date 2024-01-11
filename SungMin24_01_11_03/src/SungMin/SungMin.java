package SungMin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//18111 마인크래프트
		StringTokenizer st = new StringTokenizer(bf.readLine());	
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		List<Integer> one = new ArrayList<>();
		
		int max=-1;
		int min= 100000;
		
		for(int i=0; i<a; i++) {
			StringTokenizer st2 = new StringTokenizer(bf.readLine());
			for(int j=0; j<b; j++) {
				int su = Integer.parseInt(st2.nextToken());
				one.add(su);
				if(su>max) {max = su;}
				if(su<min) {min = su;}
			}
		}
		//Collections.sort(one);
		int sum =99999999;
		int height = 0;
		for(int i=min; i<=max; i++) {
			int sungMinSum = 0;
			int count = c;
				for(int j=0; j<one.size(); j++) {
					
					if(one.get(j)<i) {
						sungMinSum+=i-one.get(j);
						count-=(i-one.get(j));
					}
					else if(one.get(j)>i) {
						sungMinSum+=(one.get(j)-i)*2;
						count+=(one.get(j)-i);
					}
					
				}
				if(sum>sungMinSum && count>=0) {sum=sungMinSum; height=i;}
				if(sum==sungMinSum && count>=0) {
					if(i>height) {
						sum=sungMinSum; height=i;
					}
				}
		}
		bw.write(sum+" "+height);
		bw.close();
	}	
}
