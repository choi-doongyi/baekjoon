package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class SungMin {
	//1541 잃어버린 괄호

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(bf.readLine(),"-");
		int sum =0;
		boolean first = false;
		while(st.hasMoreTokens()) {
			String a = st.nextToken();
			String[] addition = a.split("\\+");
			
			int temp =0;
			for(int j = 0; j < addition.length; j++) {
				temp += Integer.parseInt(addition[j]);
			}
			if(!first) {
				sum-=temp;
				first =true;
			}
			else {
				sum+=temp;
			}
			
		}
		System.out.println(-sum);
	}
}

