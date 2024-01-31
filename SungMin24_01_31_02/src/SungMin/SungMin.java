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
import java.util.Stack;
import java.util.StringTokenizer;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//1009 분산처리
		int a = Integer.parseInt(bf.readLine());
		for(int i=0; i<a; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			
			int a1 =Integer.parseInt(st.nextToken());
			int a2 =Integer.parseInt(st.nextToken())%4;
			if(a2==0) {a2=4;}
			int b = (int)Math.pow(a1, a2)%10;
			if(b==0) {b=10;}
			System.out.println(b);
		}
		
    }
}
