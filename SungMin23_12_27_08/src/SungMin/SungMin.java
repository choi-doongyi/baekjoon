package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double sum =0.0;	//학점 * 전공 평점
		Double sum2 =0.0;	//학점
		for(int i=0; i<20; i++) {
			String a = sc.next();
			Double b = Double.parseDouble(sc.next());
			String c = sc.next();
			if(!c.equals("P")) {sum2+=b;}
			
			
			switch(c) {
			case("A+"):
				sum+=b*4.5;
				break;
			case("A0"):
				sum+=(b*4.0);
				break;
			case("B+"):
				sum+=(b*3.5);
				break;
			case("B0"):
				sum+=(b*3.0);
				break;
			case("C+"):
				sum+=(b*2.5);
				break;
			case("C0"):
				sum+=(b*2.0);
				break;
			case("D+"):
				sum+=(b*1.5);
				break;
			case("D0"):
				sum+=(b*1.0);
				break;
			case("P"):
				break;
			}
			
		}
		System.out.println(sum/sum2);
		
	}
}
