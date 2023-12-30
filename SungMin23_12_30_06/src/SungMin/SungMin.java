package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		int d = Integer.parseInt(sc.next());
		int min= 1999999999;
		
		int a1 = Math.abs(0-b);
		int a2 = Math.abs(0-a);
		int a3 = c-a;
		int a4 = d-b;
		
		if(min>a1) {min = a1;}
		if(min>a2) {min = a2;}
		if(min>a3) {min = a3;}
		if(min>a4) {min = a4;}
		
		
		
		
		System.out.println(min);
		
		
	}
}
