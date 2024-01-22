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
import java.util.Stack;
import java.util.StringTokenizer;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//11576 Base Conversion
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int count = Integer.parseInt(bf.readLine());
		StringTokenizer st2 = new StringTokenizer(bf.readLine());
		
		Stack<Integer> stack = new Stack<>();
		
		long sum=0;
		for(int i=count-1; i>=0; i--) {
			sum+=Integer.parseInt(st2.nextToken())*Math.pow(a, i);
		}
		
		while(true) {
			if(sum/b!=0) {
				stack.push((int) (sum%b));
				sum/=b;
				
			}
			else {
				stack.push((int) sum);
				break;
			}
		}
		int size = stack.size();
		for(int i=0; i<size; i++) {
			System.out.print(stack.pop()+" ");
		}
		
	}
}
