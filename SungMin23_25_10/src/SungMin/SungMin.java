package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int start = Integer.parseInt(sc.next());
		Double one[] = new Double[start];
		for(int i=0; i<start; i++) {
			Double a = Double.parseDouble(sc.next());
			one[i] = a;
		}
		Double max=one[0];
		Double add=0.0;
		for(int i=0; i<one.length; i++) {
			if(one[i]>max) {max=one[i];}
		}
		for(int i=0; i<one.length; i++) {
			Double sung = (one[i]/max)*100;
			add+=sung;
		}
		System.out.println(add/one.length);

	}
}
