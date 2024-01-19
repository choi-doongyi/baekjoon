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
		//10872 팩토리얼
		int a =Integer.parseInt(bf.readLine()); 
		int b =1;
		for(int i=1; i<=a; i++) {
			b*=i;
		}
		if(a==0) {
			System.out.println(1);
		}
		else {
			System.out.println(b);
		}
	}
}
