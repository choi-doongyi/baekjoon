package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String one = sc.next();
		String two = sc.next();
		
		String a1="";
		String a2="";
		
		for(int i=2; i>=0; i--) {
			a1+=String.valueOf(one.charAt(i));
		}
		for(int i=2; i>=0; i--) {
			a2+=String.valueOf(two.charAt(i));
		}
		
		if(Integer.parseInt(a1)>Integer.parseInt(a2)) {
			System.out.print(a1);
		}
		else {
			System.out.print(a2);
		}
	}
}