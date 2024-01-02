package SungMin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int s = Integer.parseInt(bf.readLine());
		int one[][] = new int [s][2];
		
		
		
		
		for(int i=0; i<s; i++) {
			StringTokenizer st2 = new StringTokenizer(bf.readLine());
			one[i][0] = Integer.parseInt(st2.nextToken());
			one[i][1] = Integer.parseInt(st2.nextToken());
		}

		Arrays.sort(one, new Comparator<int[]>() { 
		    @Override
		    public int compare(int[] o1, int[] o2) {
		        return o1[0]!=o2[0] ? o1[0]-o2[0] : o1[1]-o2[1]; // 첫번째 기준 오름차순 > 두번째 기준 오름차순  : {1,30}{2,10}{3,50}{4,20}{5,40}{6,10}{6,20}{6,30}{6,40}{6,50}
		        //return o1[0]!=o2[0] ? o1[0]-o2[0] : o2[1]-o1[1]; // 첫번째 기준 오름차순 > 두번째 기준 내림차순  : {1,30}{2,10}{3,50}{4,20}{5,40}{6,50}{6,40}{6,30}{6,20}{6,10}
		    }
		});
		
		for(int i=0; i<s; i++) {
			bw.write(one[i][0]+" "+one[i][1]+"\n");
		}
		
		bw.close();
		
		

	}
}
