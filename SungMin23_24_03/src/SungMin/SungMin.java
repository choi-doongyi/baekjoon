package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b=0;
		for(int i=1; i<=a; i++) {
			b+=i;
		}
		System.out.println(b);
	}
}
