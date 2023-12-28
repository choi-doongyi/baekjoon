package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int one[][] = new int[9][9];
		
		for(int i=0; i<one.length; i++) {
			for(int j=0; j<one[0].length; j++) {
				int d = Integer.parseInt(sc.next());
				one[i][j] = d;
			}
		}
		
		int sum =0;
		int a1 = 0, a2=0;
		
		for(int i=0; i<one.length; i++) {
			for(int j=0; j<one[0].length; j++) {
				if(sum<one[i][j]) {
					sum = one[i][j];
					a1 =i; a2=j;
				}
			}
		}
		
		System.out.println(sum);
		System.out.println(a1+1+" "+(a2+1));
		
		
	}
}
