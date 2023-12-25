package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = Integer.parseInt(sc.next());
		int a[] = new int[count];
		
		for(int i=0; i<count; i++) {
			int b = Integer.parseInt(sc.next());
			a[i] = b;
			
		}
		int max=-1000001;
		int min=1000001;
		for(int i=0; i<a.length; i++) {
			if(a[i]<min) {min = a[i];}
			if(a[i]>max) {max=a[i];}
			
		}
		System.out.println(min+" "+max);
	}
}