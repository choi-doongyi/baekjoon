package SungMin;

import java.util.Scanner;

public class SungMin{
    public static void main(String[] args){
        int a,b;
        String sungMin;

        Scanner sc = new Scanner(System.in);
        sungMin = sc.nextLine();
        sungMin = sungMin.replaceAll(" ","");
        a =  Integer.parseInt(sungMin.substring(0,1)); 
        b =  Integer.parseInt(sungMin.substring(1)); 
        
        System.out.print(a*b);
        
    }
}

