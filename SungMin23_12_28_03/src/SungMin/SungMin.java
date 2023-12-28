package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a =sc.next() ;
		String one[][] = new String[5][15];
		
		for(int i=0; i<one.length; i++) {
			
			for(int j=0; j<one[0].length; j++) {
				
				one[i][j]="";
			}
		}
		for(int i=0; i<one.length; i++) {
			if(i!=0) {
				a =sc.next();
			}
			for(int j=0; j<a.length(); j++) {
				one[i][j]=String.valueOf(a.charAt(j));
				
			}
			
		}
		
		for(int i=0; i<one[0].length; i++) {
			
			for(int j=0; j<one.length; j++) {
				
				System.out.print(one[j][i]);
			}
		}
	}
}