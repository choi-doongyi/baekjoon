package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum =0;
		
		int a = Integer.parseInt(sc.next());
		String b=sc.next();
		
		for(int i=0; i<a; i++) {
			sum += (b.charAt(i))-'0';
		}
		System.out.print(sum);
		
		
	}
}
