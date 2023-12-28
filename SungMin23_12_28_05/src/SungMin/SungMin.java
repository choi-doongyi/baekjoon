package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int quarter =0;
		int dime =0;
		int nickel = 0;
		int penny = 0;
		
		for(int i=0; i<a; i++) {
			int b = Integer.parseInt(sc.next());
			quarter = b/25;
			b= b%25;
			dime = b/10;
			b= b%10;
			nickel = b/5;
			penny = b%5;
			
			System.out.println(quarter+" "+dime+" "+nickel+" "+penny);
			 
		}
		
	}
}
