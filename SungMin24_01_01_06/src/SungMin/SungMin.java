package SungMin;

import java.util.Arrays;
import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int one[] = new int[a];
		for(int i=0; i<a; i++) {
			one[i] = Integer.parseInt(sc.next());
			
		}
		Arrays.sort(one);
		for(int i=0; i<a; i++) {
			System.out.println(one[i]);
			
		}
	}
}