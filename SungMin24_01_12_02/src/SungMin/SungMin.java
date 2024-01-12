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
import java.util.Comparator;
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
		//11047 동전 0
		StringTokenizer st = new StringTokenizer(bf.readLine());	
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		Stack<Integer> stack = new Stack<>();

		for(int i=0; i<a; i++) {
			stack.add(Integer.parseInt(bf.readLine()));
		}
		int count = 0;
		while(b!=0) {
			if(b/stack.peek()!=0) {
				int c =stack.pop();
				count+=b/c;
				b=b%c;
			}
			else {
				stack.pop();
			}
		}
		System.out.println(count);
	}
}
