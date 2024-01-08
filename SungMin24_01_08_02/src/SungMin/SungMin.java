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
		StringTokenizer st = new StringTokenizer(bf.readLine());
		//10817 세 수
		int one[] = new int[3];
		one[0] =Integer.parseInt(st.nextToken());
		one[1] = Integer.parseInt(st.nextToken());
		one[2] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(one);
		System.out.println(one[1]);
		
	}

}
