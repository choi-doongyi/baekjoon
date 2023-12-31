package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int[] c = new int[a];
		for(int i=0; i<a; i++) {
			c[i] = Integer.parseInt(sc.next());
		}
		
		int bingo = 0;
		int sungmin =0;
		for(int i=0; i<a; i++) {
			for(int j=0; j<a; j++) {
				for(int k=0; k<a; k++) {
					if(i!=j&&j!=k&&i!=k) {
						sungmin =c[i]+c[j]+c[k];
						if((sungmin-b)<=0) {
							if(sungmin > bingo) {bingo =sungmin; }
						}
						
					}
				}
			}
		}
		if(a==3) {System.out.println(c[0]+c[1]+c[2]);}
		else {System.out.println(bingo);}
		
		
		
	}
}
