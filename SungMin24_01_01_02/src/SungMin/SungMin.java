package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a =Integer.parseInt(sc.next());
		int b =Integer.parseInt(sc.next());
		int c =Integer.parseInt(sc.next());
		int d =Integer.parseInt(sc.next());
		int e =Integer.parseInt(sc.next());
		int f =Integer.parseInt(sc.next());
		
		for(int i=-999; i<1000; i++) {
			for(int j=-999; j<1000; j++) {
				if(((a*i)+(b*j)==c) && ((d*i)+(e*j)==f)) {
					System.out.println(i+" "+j);
					break;
				}
			}
		}	
	}
}
