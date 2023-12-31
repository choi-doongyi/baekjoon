package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.next());
		long sum = 0;
		for(long i =1; i<=n-2; i++) {
			sum+=(n-i)*(n-i-1)/2;
		}

		System.out.println(sum);
		System.out.println(3);
		
	}
}