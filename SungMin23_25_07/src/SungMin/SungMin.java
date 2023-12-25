package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int one[] = new int[30];
		
		for(int i=0; i<one.length; i++) {
			one[i]=i+1;
		}
		
		for(int i=0; i<28; i++) {
			int a = Integer.parseInt(sc.next());

			one[a-1] =0;
		}
		
		int min=10000;
		int max =0;
		
		for(int i=0; i<one.length; i++) {
			if(one[i]!=0) {
				if(one[i]<min) {
					min = one[i];
				}
				else {
					max = one[i];
				}
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
}