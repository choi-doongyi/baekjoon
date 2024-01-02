package SungMin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class SungMin {
	public static void sort(Integer[] a) {
		l_pivot_sort(a, 0, a.length - 1);
	}

	private static void l_pivot_sort(Integer[] a, int lo, int hi) {
		
		if(lo >= hi) {
			return;
		}
		int pivot = partition(a, lo, hi);	
		
		l_pivot_sort(a, lo, pivot - 1);
		l_pivot_sort(a, pivot + 1, hi);
	}
	
	private static int partition(Integer[] a, int left, int right) {
		
		int lo = left;
		int hi = right;
		int pivot = a[left];

		while(lo < hi) {
			
			while(a[hi] > pivot && lo < hi) {
				hi--;
			}
			while(a[lo] <= pivot && lo < hi) {
				lo++;
			}
			
			swap(a, lo, hi);
		}
		swap(a, left, lo);
		
		return lo;
	}
 
	private static void swap(Integer[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int s = Integer.parseInt(bf.readLine());
		int[]one = new int [s];
		Integer[]two = new Integer [s];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		for(int i=0; i<s; i++) {
			one[i]= Integer.parseInt(st.nextToken());
		}
			
		
		HashSet<Integer> hash = new HashSet<>();
		
		for( int i=0; i<s; i++) {
			hash.add(one[i]);
		}
		two = hash.toArray(new Integer[0]);
		sort(two);


        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i1=0; i1<two.length; i1++) {
            map.put(two[i1], i1);
        }
		

		StringBuilder stringBuilder = new StringBuilder();
		for(Integer i : one){ 
			stringBuilder.append(map.get(i)+" ");
		}

		bw.write(stringBuilder+"");
		bw.close();
	
	}
}