package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int max=0;
			int sungmin =0;
			
			int a=Integer.parseInt(sc.next());
			int b=Integer.parseInt(sc.next());
			int c=Integer.parseInt(sc.next());
			
			if(a==0 && b==0 && c==0) {break;}
			
			if(max<a) {max = a; sungmin=b+c;}
			if(max<b) {max = b; sungmin=a+c;}
			if(max<c) {max = c; sungmin=a+b;}
			if(max-sungmin<0) {
				if(a==b && b==c) {
					System.out.println("Equilateral");
				}
				else if(a==b||b==c||a==c) {
					System.out.println("Isosceles");
				}
				else{
					System.out.println("Scalene");
				}
			}
			else {
				System.out.println("Invalid");
			}
			
		}
	}
}
