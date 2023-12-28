package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int[][] max = new int[100][100];
		int one[][] = new int[a][2];
		
		
		for(int i=0; i<one.length; i++) {
			for(int j=0; j<one[0].length; j++) {
				int b = Integer.parseInt(sc.next());
				one[i][j] = b;
			}
		}
		
		for(int i=0; i<one.length; i++) {
			for(int j=one[i][0]; j<one[i][0]+10; j++) {
				for(int k=one[i][1]; k<one[i][1]+10; k++) {
					max[j][k]=1;
				}
			}
		}
		
		int sum =0;
		
		for(int i=0; i<max.length; i++) {
			for(int j=0; j<max[0].length; j++) {
				if(max[i][j]==1) {
					sum+=1;
				}
			}
		}
		System.out.println(sum);
		
	}
}
