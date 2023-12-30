package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int i=1;
		while(true) {
			i+=1;
			if(a==1) {break;}
			
			if(a%i==0) {
				
				System.out.println(i);
				if(a/i==1) {
					break;
				}
				a/=i;
				i=1;	
			}
		}
		
		
	}
}