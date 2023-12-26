package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		String a = sc.next();
		
		for(int i=0; i<a.length(); i++) {
			String b = String.valueOf(a.charAt(i));
			if(b.equals("A")||b.equals("B")||b.equals("C")) {
				sum+=3;
			}
			else if(b.equals("D")||b.equals("E")||b.equals("F")) {
				sum+=4;
			}
			else if(b.equals("G")||b.equals("H")||b.equals("I")) {
				sum+=5;
			}
			else if(b.equals("J")||b.equals("K")||b.equals("L")) {
				sum+=6;
			}
			else if(b.equals("M")||b.equals("N")||b.equals("O")) {
				sum+=7;
			}
			else if(b.equals("P")||b.equals("Q")||b.equals("R") ||b.equals("S")) {
				sum+=8;	
			}
			else if(b.equals("T")||b.equals("U")||b.equals("V")) {
				sum+=9;
			}
			else if(b.equals("W")||b.equals("X")||b.equals("Y")||b.equals("Z")) {
				sum+=10;
			}
		}
		System.out.println(sum);
	}
}
