package SungMin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());	
		int k =Integer.parseInt(st.nextToken());
		int n =Integer.parseInt(st.nextToken());
		//1654 랜선 자르기
		int one[] = new int[k];
		long max=0;
		
		for(int i=0; i<k; i++) {
			one[i] = Integer.parseInt(bf.readLine());	
			max = Math.max(max, one[i]);
		}
		bw.write(binarySearch(k,n,max,one)+"");

		bw.close();
		
	}

		

	public static long binarySearch(int k,int n,long max,int[] one) {
        long start = 1;
        long end = max;

        while (start <= end) {	//1이 end 작거나 같을때(max)
            long mid = (start + end) / 2;	//mid = 중간값
            long count = 0;
            for (int i = 0; i < k; i++) {
                count += one[i] / mid;	//중간값을 로 나눔
            }
            
            if (count < n) {	//중간값이 목표보다 작다면 최대값을 중간값-1로 만듬
                end = mid-1;
            } else if (count >= n) {
                start = mid + 1; //목표값보다 크거나 같다면 시작값을 중간값 +1로 만듬
            } 
            
        }
        return end;
    }
	
}
