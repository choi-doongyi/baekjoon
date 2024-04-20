package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class SungMin {
	//2992 크면서 작은 수
	static int n,min=1000000000;
	static String a;
    static int[]arr;
    static int[]one;
    static boolean[]check;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		a = br.readLine();
		n = a.length();

		arr = new int[n];
		one = new int[n];
		check = new boolean[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = (int)a.charAt(i)-'0';
		}
		
		gamja(0);
		if(min==1000000000) {
			System.out.println(0);
		}
		else {
			System.out.println(min);
		}
		
	}
	static void gamja(int count) {
		if(count>=n) {
			String b = "";
			for(int i=0; i<n; i++) {
				b+=String.valueOf(one[i]) ;
			}
			if(Integer.parseInt(b)>Integer.parseInt(a))
			min = Math.min(min, Integer.parseInt(b));
			return;
		}
		
		for(int i=0; i<n; i++) {
			if(!check[i]) {
				check[i] = true;
				one[count] = arr[i];
				gamja(count+1);
				check[i] = false;
			}
		}
	}
}