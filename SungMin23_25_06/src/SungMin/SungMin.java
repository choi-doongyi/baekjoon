package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count1 = Integer.parseInt(sc.next());
		int count2 = Integer.parseInt(sc.next());
		
		int one[] = new int[count1];
		
		for(int i=0; i<one.length; i++) {
			one[i]=i+1;
		}
		
		for(int i=0; i<count2; i++) {
			int b1 = Integer.parseInt(sc.next());
			int b2 = Integer.parseInt(sc.next());
			
			int change1= one[b1-1];
			int change2 =one[b2-1];	
			
			one[b1-1] = change2;
			one[b2-1] = change1;
			
		}

		for(int i=0; i<one.length; i++) {
			System.out.print(one[i]+" ");
		}
	}
}