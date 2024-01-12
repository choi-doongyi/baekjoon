package SungMin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//1620 나는야 포켓몬 마스터 이다솜
		StringTokenizer st = new StringTokenizer(bf.readLine());	
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		String one[] = new String[a];
		String two[][] = new String[a][2];
		
		for(int i=0; i<a; i++) {
			String c =bf.readLine();
			one[i]=c;
			two[i][0] = c;
			two[i][1] = String.valueOf(i);
		}
		
		 Arrays.sort(two, new Comparator<String[]>() {
	            @Override
	            public int compare(String[] o1, String[] o2) {
	                if(o1[0].toString().contentEquals(o2[0].toString()))
	                    return o1[1].toString().compareTo(o2[1].toString());
	                else
	                    return o1[0].toString().compareTo(o2[0].toString());
	            }			
	        });

		
		for(int i=0; i<b; i++) {
			String sung = bf.readLine();
			if(isInteger(sung)) {
				bw.write(one[Integer.parseInt(sung)-1]+"\n"); 
			}
			else {
				bw.write(SungMin(two,sung)+1+"\n");
			}
		}
		bw.close();
		
	}
	public static boolean isInteger(String strValue) {
	    try {
	      Integer.parseInt(strValue);
	      return true;
	    } catch (NumberFormatException ex) {
	      return false;
	    }
	  }
	public static int SungMin(String[][] a,String key) {
		int small =0;
		int big = a.length-1;
		int mid;
		while(small<=big) {
			
			mid = (small+big)/2;
			
			if(a[mid][0].equals(key)) {
				return Integer.parseInt(a[mid][1]);
			}
			else if(a[mid][0].compareTo(key)>0){	//key 가 0보다 작다면 음수
				big = mid-1;
			}
			else {
				small = mid+1;
			}
		}
		
		return -1;
	}
}
