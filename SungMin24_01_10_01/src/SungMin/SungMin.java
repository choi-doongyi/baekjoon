package SungMin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//2108 통계학
		int a = Integer.parseInt(bf.readLine());
		int max =-4001;
		int min = 4001;
		Double sum=0.0;
		int[] one = new int[a];
		for(int i=0; i<a; i++) {
			one[i]=Integer.parseInt(bf.readLine());
			if(one[i]>max) {max = one[i];}
			if(one[i]<min) {min = one[i];}
			sum+=one[i];
		}
		Arrays.sort(one);
		
		int count2[][] = new int[a][2];
		int count=0;
		int j =0;
		for(int i=0; i<a; i++) {
			count+=1;
			if(i<a-1 &&one[i]!=one[i+1]) {
				count2[j][0]=count;
				count2[j][1]=one[i];
				count=0;
				j+=1;
			}
			
			if(i==a-1) {
				count2[j][0]=count;
				count2[j][1]=one[i];
			}
		}
		
		Arrays.sort(count2, (o1, o2) -> {
		    return o1[0]!=o2[0] ? o1[0]-o2[0] : o2[1]-o1[1];
		});
		
		if(a!=1&&  count2[a-1][0]==count2[a-2][0]) {
			System.out.println(Math.round(sum/a));
			System.out.println(one[a/2]);
			System.out.println(count2[a-2][1]);
			System.out.println(max-min);
		}
		else {
			System.out.println(Math.round(sum/a));
			System.out.println(one[a/2]);
			System.out.println(count2[a-1][1]);
			System.out.println(max-min);
		}
		
	}
}
