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
		//11656 접미사 배열
		String a =bf.readLine();
		String one[] = new String[a.length()];
		String b="";
		for(int i=a.length()-1; i>=0; i--) {
			b=a.charAt(i)+b;
			one[i] = b;
		}
		Arrays.sort(one);
		for(int i=0; i<a.length(); i++) {
			System.out.println(one[i]);
		}
	}
}
