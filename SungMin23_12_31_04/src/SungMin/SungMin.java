package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a =Integer.parseInt(sc.next());
		int b =Integer.parseInt(sc.next());
		int c=Integer.parseInt(sc.next());
		
		int max=0;
		int sum=0;
		if(a>max) {max = a; sum=b+c;}
		if(b>max) {max = b; sum=a+c;}
		if(c>max) {max = c; sum=a+b;}
		if(sum>max) {
			System.out.println(sum+max);
		}
		else {
			System.out.println((sum*2)-1);
		}
		
		
	}
}
