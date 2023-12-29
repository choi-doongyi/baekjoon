package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int v = Integer.parseInt(sc.next());
		int sung1=0;
		
		
		if((v-a)%(a-b)==0) {
			sung1 =((v-a)/(a-b))+1;
		}
		else {
			sung1 =((v-a)/(a-b))+2;
		}
		
		
		System.out.println(sung1);
	
	}
}
