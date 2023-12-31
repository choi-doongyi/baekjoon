package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int one[] = new int[a];
		int two[] = new int[a];
		
		int min1= 99999999;
		int min2 = 99999999;
		
		int max1 = -100000;
		int max2 = -100000;
		
		for(int i=0; i<a; i++) {
			one[i] = Integer.parseInt(sc.next());
			two[i] = Integer.parseInt(sc.next());
		}
		
		for(int i=0; i<a; i++) {
			if(one[i]<min1) {min1 = one[i];}
			if(one[i]>max1) {max1 = one[i];}
			if(two[i]<min2) {min2 = two[i];}
			if(two[i]>max2) {max2 = two[i];}
			
		}
		
		System.out.println((max1-min1)*(max2-min2));
	}
}
