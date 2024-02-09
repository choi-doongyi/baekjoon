package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
 
public class SungMin {
	//10870 파보나치 수 5
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(bf.readLine());
		int one[] = new int[21];
		one[0] =0;
		one[1] =1;
		for(int i=2; i<=20; i++) {
			one[i]=one[i-2]+one[i-1];
		}
		System.out.println(one[a]);
	}
}

