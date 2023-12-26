package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String one = sc.nextLine();
		
		one = one.trim();
		String[] two = one.split(" "); 
		if(!one.isEmpty()) {
			System.out.print(two.length);
		}
		else {
			System.out.print(0);
		}
	}
}
