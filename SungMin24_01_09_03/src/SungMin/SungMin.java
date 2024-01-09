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
		//15829 Hashing
		int a = Integer.parseInt(bf.readLine());
		String b = bf.readLine();
		long sum=0;
		
		for(int i=0; i<a; i++) {
			long sungmin=1;
			for(int j=0; j<i; j++) {
				sungmin=(sungmin*31)%1234567891;
			}
			sum += sungmin*(b.charAt(i)-'a'+1);
			sum %= 1234567891;
		}
		System.out.println(sum);
	}
}
