package SungMin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a =Integer.parseInt(bf.readLine());
		//9012 괄호
		
		int one=0;
		
		for(int i=0; i<a; i++) {
			String b = bf.readLine();
			for(int j=0; j<b.length(); j++) {
				if(String.valueOf(b.charAt(j)).equals("(")) {
					one+=1;
				}
				else {
					if(one==0) {
						one= -1000;
					}
					else {
						one-=1;
					}
				}
			}
			if(one==0) {
				bw.write("YES\n");
			}
			else {
				bw.write("NO\n");
			}
			one=0;
		}
		
		bw.close();
		
	}
}