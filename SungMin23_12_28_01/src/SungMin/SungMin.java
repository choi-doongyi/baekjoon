package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int one[][] = new int[a][b];
		
		for(int i=0; i<one.length; i++) {
			for(int j=0; j<one[0].length; j++) {
				int d = Integer.parseInt(sc.next());
				one[i][j] = d;
			}
		}

		
		for(int i=0; i<one.length; i++) {
			for(int j=0; j<one[0].length; j++) {
				int d = Integer.parseInt(sc.next());
				System.out.print(String.valueOf(one[i][j]+=d)+" ");
			}
			System.out.println();
		}
		
		
	}
}
