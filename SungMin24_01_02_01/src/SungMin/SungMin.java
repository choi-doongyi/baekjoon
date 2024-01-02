package SungMin;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		Integer c[] = new Integer[a];
		for(int i=0; i<a; i++) {
			c[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(c, Collections.reverseOrder());
		System.out.println(c[b-1]);
	}
}
