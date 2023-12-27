package SungMin;

import java.util.Scanner;

public class SungMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b ="";
		int d = a.length();
		
		for(int i=0; i<a.length(); i++) {
			String c = String.valueOf(a.charAt(i));
			
				b+=c;
				if((b.equals("c"))||(b.equals("d")||(b.equals("l")||
						b.equals("n")||(b.equals("s")||(b.equals("z")))))) {	
					
					
				}
				else if(b.equals("c=")||b.equals("c-")||b.equals("d-")||b.equals("lj")
						||b.equals("nj")||b.equals("s=")||b.equals("z=")) {
					b="";
					d-=1;
					
				}
				else if(b.equals("dz")) {			
					
				}
				else if(b.equals("dz=")) {
					b="";
					d-=2;
				}
				else {
					if((c.equals("c"))||c.equals("d")||c.equals("l")||
							c.equals("n")||c.equals("s")||c.equals("z") ) {	
						b=c;
					}
					else {
						b="";
					}
					
				}
			
		}
		
		System.out.println(d);
		
	}
}
