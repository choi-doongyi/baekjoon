package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		for(int i=0; i<a; i++) {
			int b1 = Integer.parseInt(sc.next());
			int b2 = Integer.parseInt(sc.next());
			System.out.println(b1+b2);
		}
	}
}

