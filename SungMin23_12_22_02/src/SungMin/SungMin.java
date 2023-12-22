package SungMin;

import java.util.Scanner;

public class SungMin{
    public static void main(String[] args){
    	int a,b,c;
        int sung,sung2;
        String sungMin;

        Scanner sc = new Scanner(System.in);
        sungMin = sc.nextLine();
        sung = sungMin.indexOf(' ');
        sung2 = sungMin.indexOf(' ',sung+1);
        sungMin = sungMin.replaceAll(" ","");
        a =  Integer.parseInt(sungMin.substring(0,sung)); 
        b =  Integer.parseInt(sungMin.substring(sung,sung2-1)); 
        c =  Integer.parseInt(sungMin.substring(sung2-1)); 
        System.out.println((a+b)%c);
        System.out.println(((a%c) + (b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c) * (b%c))%c);
        
    }
}
