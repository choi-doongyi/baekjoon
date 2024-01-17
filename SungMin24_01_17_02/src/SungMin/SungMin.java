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
		//10824 네 수
		StringTokenizer st = new StringTokenizer(bf.readLine());
		String one[] = new String[4];
		for(int i=0; i<4; i++) {
			one[i] = st.nextToken();
		}
		long a = Long.parseLong(one[0]+one[1]);
		long b = Long.parseLong(one[2]+one[3]);
		System.out.println(a+b);
	}
}
