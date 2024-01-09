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
		//2576 홀수
		int min =1000;
		int sum = 0;
		for(int i=0; i<7; i++) {
			int a = Integer.parseInt(bf.readLine());
			if(a%2==1) {
				if(a<min) {min = a;}
				sum+=a;
			}
			
		}
		if(sum==0) {System.out.println(-1);}
		else {System.out.println(sum);
		System.out.println(min);}
	}
}
