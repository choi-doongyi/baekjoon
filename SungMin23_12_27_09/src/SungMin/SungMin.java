package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		
		if(a%5==0) {
			System.out.println(a/5);
		}
		else {
			System.out.println(a/5+1);
		}

		
	}
}
