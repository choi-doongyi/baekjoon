package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next()); 
		int b = Integer.parseInt(sc.next());
		
		int test = a;
		int i=0;
		int sum=0;
		while(test!=0) {
			
			test = test/b;
			i+=1;
			
		}
		int c[] = new int[i];
		i=0;
		
		while(a!=0) {
			c[i] = a%b; 
			a= a/b;
			i+=1;
		}
		
		if(c.length==0) {
			System.out.print(0);
		}
		
		for(int j=0; j<c.length; j++) {
			if(c[c.length-j-1]>=10) {
				System.out.print((char)(c[c.length-j-1]+55));
			}
			else {
				System.out.print(c[c.length-j-1]);
			}
		}
	}
}
