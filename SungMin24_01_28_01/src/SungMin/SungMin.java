package SungMin;

import java.io.BufferedReader;   
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//2004 조합 0의 개수
		StringTokenizer st = new StringTokenizer(bf.readLine());
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		
		long count1 = five(a)-five(a-b)-five(b);
		long count2 = two(a)-two(a-b)-two(b);
		
		System.out.println(Math.min(count1,count2));
    }
	
	static int five(long a) {
		int count =0;
		while (a >= 5) {
			count += a / 5;
			a /= 5;
		}
		return count;
	}
	
	static int two(long n) {
		int count =0;
		while (n >= 2) {
			count += n / 2;
			n /= 2;
		}
		return count;
	}
}
