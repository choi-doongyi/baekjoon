package SungMin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//2577 숫자의 개수

public class SungMin {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int one[] = new int[10];
		
		int a = Integer.parseInt(bf.readLine());
		int b = Integer.parseInt(bf.readLine());
		int c = Integer.parseInt(bf.readLine());

		String d =String.valueOf(a*b*c);
		for(int i=0; i<10; i++) {
			int j =0;
			while(true) {
				
				if(d.indexOf(String.valueOf(i),j)!=-1) {one[i]+=1;j=d.indexOf(String.valueOf(i),j)+1;}
				else {break;}
			}
		}
		
		for(int i=0; i<10; i++) {
			bw.write(one[i]+"\n");
		}
		
		
		bw.close();
	}
}