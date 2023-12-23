package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		
		if(b<45) {
			if(a!=0) {
				System.out.println((a-1)+" "+(b-45+60));
			}
			else {
				System.out.println(23+" "+(b-45+60));
			}
			
		}
		else {
			System.out.println(a+" "+(b-45));
		}
	}
}