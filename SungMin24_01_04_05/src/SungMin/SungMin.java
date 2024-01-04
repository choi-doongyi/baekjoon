package SungMin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a =Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		//10816 숫자 카드 2
		
		
		List<Integer> one = new ArrayList<>();
		
		for(int i=0; i<a; i++) {
			one.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(one);
		Integer one2[] = one.toArray(new Integer[one.size()]);

		int b =Integer.parseInt(bf.readLine());
		StringTokenizer st2 = new StringTokenizer(bf.readLine());
		//10816 숫자 카드 2
		Integer two[] = new Integer[b];
		
		for(int i=0; i<b; i++) {
			two[i] = Integer.parseInt(st2.nextToken());
		}
		
		for(int i=0; i<two.length; i++) {
			int count =0;	

			if(Start(two[i],one2.length-1,one2) != -1){
				count = upperBound(one,two[i])-lowerBound(one,two[i]);
			}
			bw.write(count+" ");
		}
		
		bw.close();
		
		
	}
	
	static int Start(Integer key,int high, Integer a[] ) {
		int mid = 0;
		int low = 0;
		
		
		while(low<=high) {
			mid = (high+low)/2;
			
			if(key.equals(a[mid])) {
				
				return mid;
			}
			else if(key < a[mid]) { // 왜 여기로 넘어오는가?
				high = mid - 1;	
			} else {
				low = mid + 1;//처음의 mid는 0이었기에 +1당함! 그리고 탐색 실패
			}
		}
		return -1;
	}
	private static int lowerBound(List<Integer> data, int target) {
	    int begin = 0;
	    int end = data.size();
	    
	    while(begin < end) {
	    	int mid = (begin + end) / 2;
	        
	        if(data.get(mid) >= target) {
	        	end = mid;
	        }
	        else {
	        	begin = mid + 1;
	        }
	    }
	    return end;
	}
	
	private static int upperBound(List<Integer> data, int target) {
	    int begin = 0;
	    int end = data.size();
	    
	    while(begin < end) {
	    	int mid = (begin + end) / 2;
	        
	        if(data.get(mid) <= target) {
	        	begin = mid + 1;
	        }
	        else {
	        	end = mid;
	        }
	    }
	    return end;
	}
}
