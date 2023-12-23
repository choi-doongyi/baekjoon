package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		a = Integer.parseInt(sc.next());
		b = Integer.parseInt(sc.next());
		
		if(a>b) {
			System.out.println(">");
		}
		else if(a<b) {
			System.out.println("<");
		}
		else {
			System.out.println("==");
		}
		
	}
}
