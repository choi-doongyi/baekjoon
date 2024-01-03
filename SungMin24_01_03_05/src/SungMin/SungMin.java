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
		//10250 ACM 호텔
		int a =Integer.parseInt(bf.readLine());
		
		for(int i=0; i<a; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int b =Integer.parseInt(st.nextToken());
			int c =Integer.parseInt(st.nextToken());
			int d =Integer.parseInt(st.nextToken());
			int count=1;
			
			for(int j =1; j<=c; j++) {
				for(int k=1; k<=b; k++) {
					if(count==d) {bw.write(k*100+j+"\n"); count+=1;}
					else {count+=1;}
				}
			}
			
		}
		bw.close();
	}
}
