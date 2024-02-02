package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;
 
public class SungMin {
	//2089 -2진수
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(bf.readLine());
		Stack<Integer> one = new Stack<>();
		
		if(N==0) {System.out.println(0);}
		
		while(N!=0) {		
			one.add(Math.abs(N%-2));
			N = (int) Math.ceil((double) N / -2) ;
		}
		int b = one.size();
		for(int i=0; i<b; i++) {
			System.out.print(one.pop());
		}
		
	}
}
