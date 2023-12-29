package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int b = Integer.parseInt(sc.next());
		long sum=0;
		
		for(int i=0; i<a.length(); i++) {
			if((int)a.charAt(i) >= 48 && (int)a.charAt(i) <= 57) {
				int one = Integer.parseInt(String.valueOf(a.charAt(i)));
				if(i==a.length()-1) {
					sum+=one;
				}
				else {
					sum+=one*Math.pow(b, a.length()-1-i);
				}
			}
			else {
				int one = Integer.parseInt(String.valueOf(a.charAt(i)-'A'+10));
				if(i==a.length()-1) {
					sum+=one;
				}
				else {
					sum+=one*Math.pow(b, a.length()-1-i);		
				}
				
			}
			
		}
		System.out.println(sum);
	}
}
