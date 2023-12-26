package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int one =Integer.parseInt(sc.next());
		
		String a="";
		for(int k = 0; k<one; k++) {
			int three =Integer.parseInt(sc.next());
			String two = sc.next();
			for(int i=0; i<two.length(); i++) {
				for(int j=0; j<three; j++) {
					a +=String.valueOf(two.charAt(i));
				}

			}
			System.out.println(a);
			a="";
		}
	}
}

