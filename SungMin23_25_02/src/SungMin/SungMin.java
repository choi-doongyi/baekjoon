package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = Integer.parseInt(sc.next());
		int count2 = Integer.parseInt(sc.next());
		int a[] = new int[count];
		
		for(int i=0; i<count; i++) {
			int b = Integer.parseInt(sc.next());
			a[i] = b;
			
		}
		for(int i=0; i<a.length; i++) {
			if(a[i]<count2) {System.out.print(a[i]+" ");}
			
		}
	}
}