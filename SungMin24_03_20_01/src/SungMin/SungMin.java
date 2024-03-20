package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class SungMin {
	//9663 N-Queen
	static int n,count=0;
	static int[] cols;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(bf.readLine());
		cols = new int[n];
		backTracking(0);
		System.out.println(count);
    }
	static void backTracking(int b) {
		
		if(b==n) {
			count++;
			return;
		}
		
		for(int i=0; i<n; i++) {
			cols[b] =i;
			if(isPossible(b)) {
				backTracking(b+1);
			}
		}
	}
	static boolean isPossible(int c) {
		for(int i=0; i<c; i++){
			if(cols[i] == cols[c]|| Math.abs(c-i)==Math.abs(cols[c]-cols[i]))return false;
			
		}
		return true;
	}
}