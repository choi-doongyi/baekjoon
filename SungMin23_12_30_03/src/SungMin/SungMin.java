package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int min=0;
		int count = 0;
		int sum=0;
		
		for(int i=a; i<=b; i++) {//1이랑 2도따로 만들어주기
			for(int j =2; j<i; j++) {
				if(i%j==0) {
					count+=1;
				}
			}
			if(i==1) {
				count=1;
			}
			
			
			if(count==0) {
				if(min==0) {
					min = i;
				}
				sum+=i;
			}
			count =0;
		}
		if(sum != 0) {
			System.out.println(sum);
			System.out.println(min);
		}
		else {
			System.out.println(-1);
		}
		
		
	}
}
