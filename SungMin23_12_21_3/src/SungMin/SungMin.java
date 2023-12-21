package SungMin;

import java.util.Scanner;

public class SungMin{
    public static void main(String[] args){
        Double a,b;
        String sungMin;

        Scanner sc = new Scanner(System.in);
        sungMin = sc.nextLine();
        sungMin = sungMin.replaceAll(" ","");
        
        a =  Double.parseDouble(sungMin.substring(0,1));
        b =  Double.parseDouble(sungMin.substring(1)); 
        
        System.out.print(a/b);
    }
}
