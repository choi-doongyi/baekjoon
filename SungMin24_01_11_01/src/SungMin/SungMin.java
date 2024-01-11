package SungMin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//10773 제로
		int a = Integer.parseInt(bf.readLine());
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i<a; i++) {
			int b = Integer.parseInt(bf.readLine());
			if(b==0) {
				stack.pop();
			}
			else {
				stack.add(b);
			}
		}
		int c = stack.size();
		int sum = 0;
		for(int i=0; i<c; i++) {
			sum+=stack.pop();
		}
		System.out.println(sum);
	}
}
