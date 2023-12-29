package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			if(a==0 || b==0) {break;}
			
			if(a%b ==0) {
				System.out.println("multiple");
			}
			else if(b%a ==0) {
				System.out.println("factor");
			}
			else if(a%b!=0 && b%a!=0) {
				System.out.println("neither");
			}
		}
		

	}
}
