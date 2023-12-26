package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		
		int[] one = new int[26];
		
		for(int i=0; i<one.length; i++) {
			one[i] = -1;
		}
		
		for(int i=0; i< a.length(); i++) {
			int b = (a.charAt(i))-'a';
			if(one[b]==-1) {
				one[b] =i;
			}
		}
		for(int i=0; i<one.length; i++) {
			System.out.print(one[i]+" ");
		}
		
	}
}
