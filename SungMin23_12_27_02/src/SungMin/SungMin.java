package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		int d = Integer.parseInt(sc.next());
		int e = Integer.parseInt(sc.next());
		int f = Integer.parseInt(sc.next());
		
		System.out.print((1-a)+" "+(1-b)+" "+(2-c)+" "+(2-d)+" "+(2-e)+" "+(8-f)+" ");
	}
}
