package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int b =0;
		
		for(int i=0; i<=a; i++) {
			int c =i;
			int d =i;
			while(true) {
				if(c/10!=0) {d+=c%10; c=c/10;}
				else {d+=c%10; break;}
				
				
				
			}
			if((d==a)&&(b==0)) {
				b = i;
			}
		}
		
		System.out.println(b);
	}
}
