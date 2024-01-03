package SungMin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SungMin {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//1259 팰린드롬수
		while(true) {
			String a =bf.readLine();
			if(a.equals("0")) {break;}
			String b="";
			for(int i=a.length()-1; i>=0;i--) {
				b+=String.valueOf(a.charAt(i));
			}
			if(a.equals(b)) {bw.write("yes"+"\n");}
			else {bw.write("no"+"\n");}
			bw.flush();
		}
		
		bw.close();
	}
}