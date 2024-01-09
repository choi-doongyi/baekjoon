package SungMin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a =Integer.parseInt(bf.readLine());
		
		int[][] one = new int[a][2];
		//7568 덩치
		for(int i=0; i<a; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			one[i][0] = b;
			one[i][1] = c;
		}
		for(int i=0; i<a; i++) {
			int count =1;
			for(int j=0; j<a; j++) {
				if(one[i][0]<one[j][0]&&one[i][1]<one[j][1]) {
					count+=1;
				}
			}
			System.out.print(count+" ");
		}
		
	}

}
