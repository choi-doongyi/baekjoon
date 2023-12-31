package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a1 = Integer.parseInt(sc.next());
		int a0 = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		int n0 = Integer.parseInt(sc.next());
		int sum=0;
		
		
		for(int i=n0; i<=100; i++) {
			int fn =a1*i+a0;
			int gn =c*i;
			
			if(fn>gn) {
				sum+=1;
			}
			
		}
		if(sum==0) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
	}
}
