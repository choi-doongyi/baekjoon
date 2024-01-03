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
		
		//2920 음계
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());
		int g = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		if(a==1&&b==2&&c==3&&d==4&&e==5&&f==6&&g==7&&h==8) {
			bw.write("ascending"+"\n");
		}
		else if(a==8&&b==7&&c==6&&d==5&&e==4&&f==3&&g==2&&h==1) {
			bw.write("descending"+"\n");
		}
		else {
			bw.write("mixed"+"\n");
		}
		
		
		bw.close();
	}
}