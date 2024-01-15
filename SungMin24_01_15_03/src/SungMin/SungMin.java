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
		//17298 오큰수
		int a = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		List<Integer> one = new ArrayList<>();
		int[] queue = new int[a];
		for(int i=0; i<a; i++) {
			int b =Integer.parseInt(st.nextToken());
			stack.add(b);
			queue[i]=b;
		}
		int max =stack.peek();
		stack2.push(-1);
		while(stack.size() > 1) {
            int num = stack.pop();
            if(stack.peek() < num) {
            	stack2.push(num);
            	
                if(max < num) max = num;
            }
            else {
                if(stack.peek() < stack2.peek()) {
                	stack2.push(stack2.peek());
                }
                else {
                    if(max > stack.peek()) {
                    	for(int i=one.size()-1; i>=0; i--) {
                    		if(stack.peek()<one.get(i)) {
                    			stack2.push(one.get(i));
                    			break;
                    		}
                    	}
                    }
                    else stack2.push(-1);
                }
            }
            one.add(num);
        }
		for(int i=0; i<a; i++) {
			bw.write(stack2.pop()+" ");
		}
		bw.close();
	}
}
