package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;
 
public class SungMin {
	//1075 나누기
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(bf.readLine());
		int F= Integer.parseInt(bf.readLine());
		
		N-=(N%100);
		int count =0;
		while(true) {
			if(N%F==0) {
				if(count<=9) {
					System.out.print(0);
					System.out.println(count);
				}
				else {
					System.out.println(count);
				}
				break;
			}
			else {
				N+=1;
				count+=1;
			}
		}
			
		
		
	}
}
