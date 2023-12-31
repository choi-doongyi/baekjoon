package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.next());
		long sum=0;
		
		for(long i=n-1; i>0; i--) {
			sum+=i;
		}

		System.out.println(sum);
		System.out.println(2);
		
	}
}