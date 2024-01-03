package SungMin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class SungMin {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//1920 수 찾기
		int a = Integer.parseInt(bf.readLine());
		
		List<Integer> one = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0; i<a; i++) {
			
			one.add(Integer.parseInt(st.nextToken()));
		}
		int b =Integer.parseInt(bf.readLine());
		List<Integer> two = new ArrayList<>();
		StringTokenizer st2 = new StringTokenizer(bf.readLine());
		for(int i=0; i<b; i++) {		
			two.add(Integer.parseInt(st2.nextToken()));
		}

		HashSet<Integer> hash = new HashSet<>();
		
		for( int i=0; i<a; i++) {
			hash.add(one.get(i));
		}
		Integer[] one2 = new Integer[hash.size()];
		one2 = hash.toArray(new Integer[0]);
		/*List<Integer> one3 = Arrays.asList(one2);
		Collections.sort(one3);*/
		
		Arrays.sort(one2);
		

		

		for(int i=0; i<two.size(); i++) {
			if(binarySearch2(two.get(i),one2,one2.length-1)==-1) {
				bw.write(0+"\n");
			}
			else {
				bw.write(1+"\n");
			}
		}
		
		
		bw.close();
	}
	
	static int binarySearch2(Integer key,Integer[] arr, int high) {
		int mid = 0;
		int low=0;
		while(low <= high) {//0 0 이니까 돌아가!
			mid = (low + high) / 2;		//0+0/2 = 0
						
			
			if(key.equals(arr[mid])) { //150 == arr[0]
				return mid;
			} else if(key < arr[mid]) { // 왜 여기로 넘어오는가?
				high = mid - 1;	
			} else {
				low = mid + 1;//처음의 mid는 0이었기에 +1당함! 그리고 탐색 실패
			}
		}
		
		return -1; // 탐색 실패 
	}
}
