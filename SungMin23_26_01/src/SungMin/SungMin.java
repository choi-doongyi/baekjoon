package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		int b = Integer.parseInt(sc.next());
		
		System.out.print(a.substring(b-1,b));
	}
}
