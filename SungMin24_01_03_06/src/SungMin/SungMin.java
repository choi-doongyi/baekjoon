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
		//2741 N 찍기
		int a =Integer.parseInt(bf.readLine());
		
		for(int i=1; i<=a; i++) {
			bw.write(i+"\n");
		}
		bw.close();
	}
}
