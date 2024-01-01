package SungMin;

import java.util.Arrays;
import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int one[] = new int[5];
		for(int i=0; i<5; i++) {
			one[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(one);
		for(int i=0; i<5; i++) {
			sum+=one[i];
		}
		System.out.println(sum/5);
		System.out.println(one[2]);
	}
}
