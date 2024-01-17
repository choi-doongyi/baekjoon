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
		//11655 ROT13
		
		String a = bf.readLine();
		for(int i=0; i<a.length(); i++) {
			if(Character.isUpperCase(a.charAt(i))) {
				if(a.charAt(i)-'A'+13>=26) {
					
					int b = (a.charAt(i)-'A'+13)%26;
					System.out.print((char)('A'+b));
				}
				else {
					System.out.print((char)(a.charAt(i)+13));
				}
				
			}
			else if(Character.isLowerCase(a.charAt(i))) {
				if(a.charAt(i)-'a'+13>=26) {
					
					int b = (a.charAt(i)-'a'+13)%26;
					System.out.print((char)('a'+b));
				}
				else {
					System.out.print((char)(a.charAt(i)+13));
				}
			}
			else {
				System.out.print(a.charAt(i));
			}
		}
		
		
	}
}
