package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		String one="";
		int two =0;
		boolean end = false;
		
		for(int i=0; i<a; i++) {
			String b = sc.next();
			if(b.length()==1) {two+=1;}
			else {
				for(int j=0; j<b.length(); j++) {
					String c = String.valueOf(b.charAt(j));
					if(one.equals("")) {
						one = c;
					}
					else if(end==false && !one.equals(c)) {
						//새로 들어온 값이 전 값과 다르면
						
						if(b.indexOf(one,j)==-1) {
							if(j==b.length()-1){
								two+=1;
							}
							else {
								one = c;
							}
						}
						else {//뒤에 같은게 있다면

							end=true;
						}
					}
					else {
						if(j==b.length()-1&&end==false) {
							two+=1;
						}
					}
					
				}
				one="";
				end=false;
			}
				
		}
		System.out.println(two);
	}
}
