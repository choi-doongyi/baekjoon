package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		for(int i=0; i<b; i++) {
			int c1 = Integer.parseInt(sc.next());
			int c2 = Integer.parseInt(sc.next());
			a-=c1*c2;
		}
		if(a==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}
}
