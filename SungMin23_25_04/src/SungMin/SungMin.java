package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[9];
		
		for(int i=0; i<9; i++) {
			int b = Integer.parseInt(sc.next());
			a[i] = b;
			
		}
		int max=a[0];
		int c=1;
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {max=a[i]; c=(i+1);}
			
		}
		System.out.println(max);
		System.out.println(c);
	}
}