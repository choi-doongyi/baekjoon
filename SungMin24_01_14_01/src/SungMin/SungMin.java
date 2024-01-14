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
		//9093 단어 뒤집기
		
		int a = Integer.parseInt(bf.readLine());
		for(int i=0; i<a; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			while(st.hasMoreTokens()) {
				String b = st.nextToken();
				for(int j=b.length()-1; j>=0; j--) {
					bw.write(b.charAt(j));
				}
				bw.write(" ");
			}
			bw.write("\n");
		}
		bw.close();
	}
}
