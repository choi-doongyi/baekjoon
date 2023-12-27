package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int b=a;
		int c=0;
		
		
		for(int i=0; i<a; i++) {
			b-=1;
			for(int j=b; j>0; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=i+(i); k++) {
				System.out.print("*");
				c = k;
			}
			System.out.println(" ");
		}
		
		for(int i=a-1; i>0; i--) {
			b+=1;
			c-=2;
			for(int j=b; j>0; j--) {
				System.out.print(" ");
			}
			for(int k=c; k>=0; k--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}
}