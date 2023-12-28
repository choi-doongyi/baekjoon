package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		
		int b = (int)Math.sqrt(Math.pow(4, a)); 
		System.out.print((b+1)*(b+1));
	}
}
