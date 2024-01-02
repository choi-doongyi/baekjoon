package SungMin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = bf.readLine().split("");
		Integer one[] = new Integer [s.length];
		
		for(int i=0; i<s.length; i++) {
			one[i] = Integer.parseInt(s[i]);
		}
		
		Arrays.sort(one,Collections.reverseOrder());
		for(int i=0; i<s.length; i++) {
			System.out.print(one[i]);
		}
	}
}
