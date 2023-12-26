package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int b = Integer.parseInt(sc.next());
		for(int i=0; i<b; i++) {
			String c = sc.next();
			String one = c.substring(0,1);
			String two = c.substring(c.length()-1,c.length());
			System.out.println(one+two);
		}

		
	}
}
