package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class SungMin {
	//5525 IOIOI
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(bf.readLine());
		int b = Integer.parseInt(bf.readLine());
		String c = bf.readLine();
		int d = 3+((a-1)*2);
		long sum =0;
		int count =0;
		boolean swich =false;
		for(int i=0; i<b; i++) {
			if(!swich && c.charAt(i)=='I') {
				swich=true;
				count+=1;
			}
			else if(swich && c.charAt(i)!=c.charAt(i-1)) {
				if(c.charAt(i)=='I') {
					count+=2;
				}
				if(count>=d) {
					sum+=1;
					count-=2;
				}
			}
			else if(swich && c.charAt(i)==c.charAt(i-1)) {
				if(c.charAt(i)=='I') {
					count=1;
				}
				else {
					swich=false;
					count=0;
				}
				
			}
			
		}
		System.out.println(sum);
	}
}

