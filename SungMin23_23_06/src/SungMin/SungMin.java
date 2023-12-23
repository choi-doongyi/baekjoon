package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		
		if(b+c>=60) {
			if((a+((b+c)/60))<=23) {
				System.out.println((a+((b+c)/60))+" "+((b+c)%60));
			}
			else {
				System.out.println((a-24+((b+c)/60)) +" "+((b+c)%60));
			}
			
		}
		else {
			System.out.println(a+" "+(b+c));
		}
	}
}
