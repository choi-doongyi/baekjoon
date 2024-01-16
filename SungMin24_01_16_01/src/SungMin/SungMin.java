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
		//17299 오등큰수
		int a = Integer.parseInt(bf.readLine());
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		Stack<Integer> result = new Stack<>();
		
		String[] list = bf.readLine().split(" ");
		int one[] = new int[1000001];
		List<Integer> two = new ArrayList<>();
		
		for(int i=0; i<a; i++) {	//200만번
			int b = Integer.parseInt(list[i]);
			stack.push(b);
			one[stack.peek()]+=1;
		}
		int max=stack.peek();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<a; i++) {
			int sung = stack.pop();
			int t = one[sung];
			while(!stack2.empty() && one[stack2.peek()] <=t) {
				stack2.pop();
			}
			if(stack2.empty()) {
				result.push(-1);
				stack2.push(sung);
			}
			else {
				result.add(stack2.peek());
				stack2.push(sung);
			}
		}
		/*
		while(stack.size()>1) {	//100만번
			int sung = stack.pop();
			if(one[stack.peek()]<one[sung]) {//만약 현재값이 다음값보다 크다면
				stack2.push(sung);	//현재값을 결과값에 넣어라
				if(one[sung]>one[max]) {max = sung;}
			}
			else {
				if(one[stack.peek()]==one[sung]) {	//현재 값과 이 다음값이 같다면
					stack2.push(stack2.peek());	//전의 값의 결과를 또 결과에 넣어라~
				}
				else if(one[stack.peek()]>=one[max]) {// 같이 않고 다음값이 최대값보다 크거나 같다면
					stack2.push(-1);
				}
				else {
					int i=two.size()-1;
					while(i>=0) {
						if(one[stack2.peek()]<one[two.get(i)]) {
							stack2.push(two.get(i));
							break;
						}
						i--;
					}
				}
			}
			two.add(sung);
		}
		*/
		while(!result.isEmpty()) {
			sb.append(result.pop()+" ");
		}
		System.out.println(sb);
	}
}
