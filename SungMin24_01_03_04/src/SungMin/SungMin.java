package SungMin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SungMin {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		//8958 OX퀴즈
		
		int a = Integer.parseInt(st.nextToken());
		int c = 1;
		int sum=0;
		for(int i=0; i<a; i++) {
			String b = bf.readLine();
			for(int j=0; j<b.length(); j++) {
				if(String.valueOf(b.charAt(j)).equals("O")) {
					sum+=c;
					c+=1;
				}
				else {
					c=1;
				}
			}
			bw.write(sum+"\n");
			sum=0;
			c=1;
		}
		
		bw.close();
		
		
		
		bw.close();
	}
}