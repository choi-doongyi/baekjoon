package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class SungMin {
	//1629 곱셈
		static long c;
		public static void main(String[] args) throws IOException {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			StringTokenizer st = new StringTokenizer(bf.readLine());
			long a = Integer.parseInt(st.nextToken());
			long b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());


			System.out.println(pow(a,b));
		}
		static long pow(long a, long b) {
			if(b==1) {
				return (a%c);
			}
			
			long temp = pow(a,b/2);
			
			if(b%2==1) {
				return(temp * temp%c)*a%c;
			}
			
			return temp*temp%c;
		}
}

