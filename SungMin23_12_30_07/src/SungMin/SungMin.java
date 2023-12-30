package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1 = Integer.parseInt(sc.next());
		int a2 = Integer.parseInt(sc.next());
		
		int b1 = Integer.parseInt(sc.next());
		int b2 = Integer.parseInt(sc.next());
		
		int c1 = Integer.parseInt(sc.next());
		int c2 = Integer.parseInt(sc.next());
		
		int one,two;
		
		if(a1==b1) {
			one = c1;
		}
		else if(a1==c1) {
			one = b1;
		}
		else {
			one = a1;
		}
		
		
		if(a2==b2) {
			two = c2;
		}
		else if(a2==c2) {
			two = b2;
		}
		else {
			two = a2;
		}
		
		System.out.println(one+" "+two);
		
		
		
	}
}
