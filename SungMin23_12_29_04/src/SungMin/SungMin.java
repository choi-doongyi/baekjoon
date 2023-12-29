package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.next());
		int count =0;
		int a =1;
		
		while(count<x) {
			
			if(x>=a) {
				count+=1;
				a+=count;
			}
			else {
				break;
			}
			
		}
		String[] one = new String[count];
		for(int i=0; i<one.length; i++) {
			if(count%2 !=0) {
				one[i] = (one.length-i)+"/"+(i+1);
	
			}
			else{
				one[i] = i+1+"/"+(one.length-i);

			}
			
		}
		System.out.println(one[x-a+count]);
	}
}
