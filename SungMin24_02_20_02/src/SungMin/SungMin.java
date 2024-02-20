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
	//20529 가장 가까운 세 사람의 심리적 거리
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(bf.readLine());
			String one[] = new String[N];
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int min = 1000;
			if(N>=33) {
				min =0;
			}
			else {
				for(int j=0; j<N; j++) {
					one[j] = st.nextToken();
				}
				
				for(int j =0; j<N; j++) {
					for(int x=j+1; x<N; x++) {
						for(int y = x+1; y<N; y++) {
							min = Math.min(min, gamja(one[j],one[x],one[y]));
						}
					}
				}
			}
			System.out.println(min);
		}
	}
	static int gamja(String a, String b, String c) {
		int sum = 0;
		for(int i=0; i<4; i++) {
			if(a.charAt(i)!=b.charAt(i)) {
				sum+=1;
			}
			if(a.charAt(i)!=c.charAt(i)) {
				sum+=1;
			}
			if(b.charAt(i)!=c.charAt(i)) {
				sum+=1;
			}
			
		}
		return sum;
	}
}

