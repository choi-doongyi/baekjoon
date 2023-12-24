package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		for(int i=0; i<a; i++) {
			for(int j=0;j<(i+1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
