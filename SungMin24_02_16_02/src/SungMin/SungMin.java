package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class SungMin {
	//1225 이상한 곱셈

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		String a = st.nextToken();
		String b = st.nextToken();
		int a1 = a.length();
		int b1 = b.length();
		long sum=0;
		for(int i=0; i<a1; i++) {
			for(int j=0; j<b1; j++) {
				sum+=Integer.parseInt(String.valueOf(a.charAt(i)))*Integer.parseInt(String.valueOf(b.charAt(j)));
			}
		}
		System.out.println(sum);
	}
}

