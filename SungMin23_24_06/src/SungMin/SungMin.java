package SungMin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a =Integer.parseInt(bf.readLine());

		for(int i=0; i<a; i++) {

			String a1 =bf.readLine();
			String a2 = a1.replaceAll(" ", "");
			int a3 = a1.indexOf(' ');	//공백 찾기
			int b1 = Integer.parseInt(a2.substring(0,a3));
			int b2 = Integer.parseInt(a2.substring(a3));
			String b3 = String.valueOf(b1+b2);
			bw.write(b3+"\n");
		}
		bw.flush();
		bw.close();
	}
}
