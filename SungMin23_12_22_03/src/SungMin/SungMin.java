package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,b2,b3,b4;
		
		a = Integer.parseInt(sc.next());
		b = Integer.parseInt(sc.next());
		
		b2 = b%10;
		b3 = ((b%100)-b2)/10;
		b4 = (b/100);
		
		
		System.out.println(a*b2);
		System.out.println(a*b3);
		System.out.println(a*b4);
		System.out.println(a*b);
	}
}
