package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int count = 0;
		int sum = 0;
		int[] one = new int[a];
		for(int i=0; i<a; i++) {
			int b = Integer.parseInt(sc.next());
			
			if(b==1) {
				count =1;
			}
			
			for(int j=2; j<b; j++) {
				if(b%j==0) {
					count+=1;
				}
			}
			if(count ==0) {
				one[i] = b;
			}
			count = 0;
		}
		for(int i=0; i<one.length; i++) {
			if(one[i]!=0) {
				sum+=1;
			}
		}
		System.out.println(sum);
		
	}
}
