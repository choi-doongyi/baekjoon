package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int start = Integer.parseInt(sc.next());
		int start2 = Integer.parseInt(sc.next());
		
		int one[] = new int[start];
		int two[] = new int[start];
		
		for(int i=0; i<one.length; i++) {
			one[i] = i+1;
		}
		
		for(int i=0; i<start2; i++) {
			int a1 = Integer.parseInt(sc.next());
			int a2 = Integer.parseInt(sc.next());
			for(int j=(a1-1); j<a2; j++) {
				two[j] = one[j];
			}
			int sung=0;
			for(int j=(a1-1); j<a2; j++) {
				one[j] = two[a2-1-sung];
				sung++;
			}
		}
		for(int i=0; i<one.length;i++) {
			System.out.print(one[i]+" ");
		}
	}
}