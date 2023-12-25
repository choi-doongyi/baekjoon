package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int one[] = new int[10];
		int two[] = new int[10];
		boolean sungmin = false;
		int three = 0;
		
		for(int i=0; i<one.length; i++) {
			int a = Integer.parseInt(sc.next());
			one[i]=a%42;
		}
		for(int i=0; i<two.length; i++) {
			two[i]=-1;
		}
		
		for(int i=0; i<one.length; i++) {
			for(int j=0; j<one.length; j++) {
				if(one[i]==two[j]) {sungmin = true;}
			}
			if(sungmin == false) {
				two[i] = one[i];
			}
			sungmin = false;
		}
		for(int i=0; i<two.length; i++) {
			if(two[i]!=-1) {three+=1;}
		}
		System.out.print(three);

		
	}
}