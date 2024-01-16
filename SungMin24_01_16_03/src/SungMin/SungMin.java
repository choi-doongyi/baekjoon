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
		//10820 문자열 분석
		
		while(true) {
			String a = bf.readLine();
			if(a==null) {break;}
			int so =0;
			int da =0;
			int in =0;
			int dud =0;
			
			
			for(int i=0; i<a.length(); i++) {
				char b =a.charAt(i);
				if(b==' ') {
					dud+=1;
				}
				else if(isInteger(String.valueOf(b))) {
					in+=1;
				}
				else if(Character.isUpperCase(b)) {
					da+=1;
				}
				else if(Character.isLowerCase(b)) {
					so+=1;
				}
			}
			System.out.println(so+" "+da+" "+in+" "+dud);
		}
		
	}
	public static boolean isInteger(String strValue) {
	    try {
	      Integer.parseInt(strValue);
	      return true;
	    } catch (NumberFormatException ex) {
	      return false;
	    }
	  }
}
