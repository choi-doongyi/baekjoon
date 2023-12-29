package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c[] = new int[a];
		int d =0;
		for(int i=0; i<a; i++) {
			if(a%(i+1)==0) {
				c[d] = i+1;
				d+=1;
			}
		}
		
		System.out.println(c[b-1]);
		
	}
}
