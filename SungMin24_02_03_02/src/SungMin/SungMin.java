package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;
 
public class SungMin {
	//1100 하얀 칸
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Character one[][] = new Character[8][8];
		for(int i=0;i<8;i++) {
			String a = bf.readLine();
			for(int j=0; j<8; j++) {
				one[i][j] = a.charAt(j);
			}
		}
		int count =0;
		for(int i=0;i<8;i++) {
			for(int j=i%2; j<8; j+=2) {
				if(one[i][j]=='F') {
					count+=1;
				}
			}
		}
		System.out.println(count);
		
	}
}
