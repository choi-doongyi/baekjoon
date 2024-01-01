package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int sungmin = a%10;
		if(a%5==0) {
			System.out.println(a/5);
		}
		else if(a%10==3 || a%10==6 || a%10==9 ){
			if(sungmin ==3) {
				System.out.println(a/5 + sungmin/3);
			}
			else {
				System.out.println((a-5)/5 + sungmin/3);
			}
		}
		else if((a%10==2&& a>=10) || a%10==8   ) {
			if(sungmin==2) {
				System.out.println((a-10)/5 + (sungmin+10)/3);
			}
			else {
				System.out.println(a/5 + (sungmin-5)/3);
			}
		}
		else if(a>=10&& (a%10==1 || a%10==4  || a%10==7)){//1 4 7
			if(sungmin==7) {
				System.out.println((a-10)/5 + (sungmin+5)/3);
			}
			else if(a%10==1 || (a%10 ==4 &&a>=10 )) {
				System.out.println((a-5)/5 + (sungmin+5)/3);
			}
			else {
				System.out.println(-1);
			}
		}
		else {
			System.out.println(-1);
		}
	}
}
