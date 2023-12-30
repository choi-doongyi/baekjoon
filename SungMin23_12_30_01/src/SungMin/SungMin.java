package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] one;
		while(true) {
			int a = Integer.parseInt(sc.next());
			int sum = 0;
			if(a==-1) {
				break;
			}
			one = new int[a];
			
			
			for(int i=1; i<a; i++) {
				if(a%i==0) {
					one[i]=i;
					sum +=i;
				}
			}
			
			if(sum==a) {
				System.out.print(a+" = ");
				for(int i=0; i<one.length; i++) {
					if(one[i] == 1) {
						System.out.print(one[i]);
					}
					else if(one[i]!=0) {
						System.out.print(" + "+one[i]);
					}
				}
			}
			else {
				System.out.print(a+" is NOT perfect.");
			}
			
			System.out.println();
			
		}
	}
}
