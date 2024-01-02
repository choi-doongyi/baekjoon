package SungMin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SungMin {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		int a = Integer.parseInt(st.nextToken());
		int[]b = new int[a]; 
		
		for(int i=0; i<a; i++) {
			StringTokenizer st2 = new StringTokenizer(bf.readLine());
			b[i] = Integer.parseInt(st2.nextToken());
		}
		
		Arrays.sort(b);
		
		for(int i=0; i<a; i++) {
			bw.write(b[i]+"\n");
		}
		bw.close();
	}
}