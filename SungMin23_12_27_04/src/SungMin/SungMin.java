package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int b =0;
		if(a.length()==1) {System.out.print(1); return;}
		for(int i=0; i<a.length()/2; i++) {
			if(a.length()>100 || a.length()<1) {System.out.print(0); return;}
			
			if(!String.valueOf(a.charAt(i)).equals(String.valueOf(a.charAt(a.length()-1-i)))) {break;}
			else if(i==(a.length()/2-1)){
				b=1;
			}
		}

		System.out.println(b);
	}
}
