package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int i=665;
		int count =0;
		boolean gamja = true;
		String sungmin[] = new String[10];
		while(true) {
			if(a<=count) {System.out.println(i); break;}
			i+=1;
			if(String.valueOf(i).indexOf("666")!=-1) {
				for(int x=0; x<String.valueOf(i).length(); x++) {
					sungmin[x] = String.valueOf(String.valueOf(i).charAt(x)); 
					if(0<=x-2 && gamja == true) {
						if(sungmin[x].equals(sungmin[x-1])&&sungmin[x-1].equals(sungmin[x-2])&&sungmin[x].equals("6")) {
							count+=1;
							gamja =false;
						}
					}
				
				}
				gamja = true;
			}
			
		}
		
	}
}
