package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		for(int i=0; i<a/4; i++) {
			System.out.print("long ");
		}
		System.out.print("int");
	}
}
