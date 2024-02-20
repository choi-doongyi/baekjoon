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
	//2805 나무 자르기
	static long one[];
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		long M = Integer.parseInt(st.nextToken()); //목표 값
		one = new long [N];
		StringTokenizer st2 = new StringTokenizer(bf.readLine());
		long max =0;
		for(int i=0; i<N; i++) {
			one[i]=Integer.parseInt(st2.nextToken());
			max = Math.max(one[i], max);
		}
		System.out.println(gamja2(N,M,max));
	}
	static long gamja2(int n, long m, long max2) {
		long value = 2000000000;
		long value2 =0;
		long max =max2;
		long min =0;
		long mid;
		while(min<=max) {
			
			mid = (max+min)/2;
			long sum = 0;
			for(int i=0; i<n; i++) {
				if(one[i]>mid) {
					sum+=one[i]-mid;
				}
			}
			if(sum-m>=0 &&sum-m== Math.min(sum-m, value)) {
				value = sum-m;
				value2 = mid;
			}
			
			if(sum==m) {
				return mid;
				
			}
			else if(sum<m) {
				max=mid-1;
			}
			else {
				min = mid+1;
			}
		}
		return value2;
	}
}

