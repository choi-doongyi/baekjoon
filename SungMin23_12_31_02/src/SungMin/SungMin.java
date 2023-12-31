package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		
		if(a==60&&b==60&&c==60) {
			System.out.println("Equilateral");
		}
		else if((a+b+c==180) &&(a==b||a==c||b==c)) {
			System.out.println("Isosceles");
		}
		else if((a+b+c==180) &&a!=b&&a!=c&&b!=c) {
			System.out.println("Scalene");
		}
		else if(a+b+c!=180) {
			System.out.println("Error");
		}

	}
}