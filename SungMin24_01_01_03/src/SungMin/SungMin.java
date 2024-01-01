package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b= Integer.parseInt(sc.next());
		String one[][] = new String[a][b];
		String two[][] = new String[8][8];//W부터
		boolean swich = false;
		
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				if((i+j)%2==0) {two[i][j] = "W";}
				else {two[i][j] = "B";}
				
			}
		}
		
		for(int i=0; i<a; i++) {
			String c = sc.next();
			for(int j=0; j<b; j++) {
				one[i][j] =String.valueOf(c.charAt(j));
			}
		}
		int min = 1000;
		for(int i=0; i<one.length; i++) {
			for(int j=0; j<one[0].length; j++) {
				int count =0;
				int count2 =0;//이게 three랑 비교
				for(int x=0; x<8; x++) {
					for(int y=0; y<8; y++) {
						if(i+7<one.length && j+7<one[0].length) {
							if(!one[i+x][j+y].equals(two[x][y])) {
								
								count+=1;
							}
							else {count2+=1;}
							swich=true;
						}
						else {
							count = 10000;
							count2 = 10000;
						}
					}
				}
				if(swich == true) {
					if(count<count2) {
						if(count<min) {min = count; swich=false;}
					}
					else {
						if(count2<min) {min = count2; swich=false;}
					}
				}
			}
		}
		System.out.println(min);
	}
}
