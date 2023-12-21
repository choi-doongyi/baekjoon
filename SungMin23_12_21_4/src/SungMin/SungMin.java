package SungMin;

import java.util.Scanner;

public class SungMin{
    public static void main(String[] args){
    	int a,b;
        int sung;
        String sungMin;

        Scanner sc = new Scanner(System.in);
        sungMin = sc.nextLine();
        sung = sungMin.indexOf(' ');
        sungMin = sungMin.replaceAll(" ","");
        
        a = Integer.parseInt(sungMin.substring(0,sung));
        b = Integer.parseInt(sungMin.substring(sung));
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
