package SungMin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
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
		//18110 solved.ac
		int a = Integer.parseInt(bf.readLine());
		int one[] = new int[a];
		Deque<Integer> deque = new ArrayDeque<>();
		for(int i=0; i<a; i++) {
			one[i] = Integer.parseInt(bf.readLine());
		}
		Arrays.sort(one);
		for(int i=0; i<a; i++) {
			deque.addLast(one[i]);
		}
		double gamja = deque.size()*0.3;
		for(int i=0; i<Math.round(gamja/2); i++) {
			deque.pollFirst();
			deque.pollLast();
		}
		int size = deque.size();
		double sum =0.0; 
		for(int i=0; i<size; i++) {
			sum+=deque.pollFirst();
		}
		if(a==1) {System.out.println(one[0]);}
		else {
			System.out.println(Math.round(sum/size));
		}
		
	}
}
