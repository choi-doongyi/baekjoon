package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		
		if(a==b &&b==c) {
			System.out.println(10000+(a*1000));
		}
		else if(a==b||b==c||a==c) {
			if(a==b ||a==c) {
				System.out.println(1000+(a*100));
			}
			else {
				System.out.println(1000+(b*100));
			}
		}
		else {
			if(a>b && a>c) {
				System.out.println(a*100);
			}
			else if(b> a && b>c) {
				System.out.println(b*100);
			}
			
			else if(c >a && c>b) {
				System.out.println(c*100);
			}
			
		}
	}
}

