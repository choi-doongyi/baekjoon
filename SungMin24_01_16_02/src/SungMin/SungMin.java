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
		//10808 알파벳 개수
		String a = bf.readLine();
		int one[] = new int[26];
		for(int i=0; i<a.length(); i++) {
			one[a.charAt(i)-'a']+=1;
		}
		for(int i=0; i<26; i++) {
			System.out.print(one[i]+" ");
		}
		
	}
}
