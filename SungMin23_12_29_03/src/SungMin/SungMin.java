package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =1;
		int count = 0;
		int input = Integer.parseInt(sc.next());
		
		while(count<input) {
			
			if(input>a) {
				count+=1;
				a+=6*count;
			}
			else {
				break;
			}
			
		}
		System.out.println(count+1);
		
	}
}
