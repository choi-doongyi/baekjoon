package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		int one[] = new int[26];
		
		for(int i=0; i<a.length(); i++) {
			String b =String.valueOf(a.charAt(i));
			b =b.toUpperCase();
			int c = b.charAt(0)-'A';
			one[c] += 1;
		}
		
		int max =0;
		int maxCount=0;
		int maxABC =0;
		
		for(int i=0; i<one.length; i++) {
			if(one[i]>max) {max =one[i]; maxABC =i;}
		}
		for(int i=0; i<one.length; i++) {
			if(one[i]==max) {maxCount +=1;}
		}
		if(maxCount>=2) {System.out.print("?");}
		else {
			System.out.println(String.valueOf((char)(maxABC+'A')));
		}
	
	}
	
}
