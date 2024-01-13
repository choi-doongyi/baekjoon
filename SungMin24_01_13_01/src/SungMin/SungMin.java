package SungMin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//1764 듣보잡
		StringTokenizer st = new StringTokenizer(bf.readLine());	
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		String one[] = new String[a];
		List<String> two = new ArrayList<>();
		for(int i=0; i<a; i++) {
			one[i] = bf.readLine();
		}
		int count =0;
		Arrays.sort(one);
		for(int i=0; i<b; i++) {
			String c = bf.readLine();
			if(SungMin(one,c)!=-1) {
				two.add(c);
				count+=1;
			}
		}
		bw.write(count+"\n");
		Collections.sort(two);
		for(int i=0; i<two.size(); i++) {
			bw.write(two.get(i)+"\n");
		}
		bw.close();
		
	}
	public static int SungMin(String[]a,String key) {
		int small =0;
		int big = a.length-1;
		int mid;
		while(small<=big) {
			
			mid = (small+big)/2;
			
			if(a[mid].equals(key)) {
				return 0;
			}
			else if(a[mid].compareTo(key)>0){	//key 가 0보다 작다면 음수
				big = mid-1;
			}
			else {
				small = mid+1;
			}
		}
		
		return -1;
	}
}
