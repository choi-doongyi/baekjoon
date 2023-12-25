package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count1 = Integer.parseInt(sc.next());
		int count2 = Integer.parseInt(sc.next());
		
		int one[] = new int[count1];
		
		for(int i=0; i<count2; i++) {
			int b1 = Integer.parseInt(sc.next());
			int b2 = Integer.parseInt(sc.next());
			int b3 = Integer.parseInt(sc.next());
			for(int j=(b1-1); j<b2; j++) {
				one[j]=b3;
			}
			
		}

		for(int i=0; i<one.length; i++) {
			System.out.print(one[i]+" ");
		}
	}
}