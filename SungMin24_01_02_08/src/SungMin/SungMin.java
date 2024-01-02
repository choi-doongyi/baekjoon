package SungMin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int s = Integer.parseInt(bf.readLine());
		String one[][] = new String [s][2];
		int two[] = new int [s];
		
		for(int i=0; i<s; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			one[i][0]= st.nextToken();
			one[i][1]= st.nextToken();
		}
		
		
		
		Arrays.sort(one, new Comparator<String[]>() { 
		    @Override
		    public int compare(String[] o1, String[] o2) {
		        return Integer.parseInt(o1[0])!=Integer.parseInt(o2[0]) ? Integer.parseInt(o1[0])-Integer.parseInt(o2[0]) : Integer.parseInt(o1[0])-Integer.parseInt(o2[0]); // 첫번째 기준 오름차순 > 두번째 기준 오름차순  : {1,30}{2,10}{3,50}{4,20}{5,40}{6,10}{6,20}{6,30}{6,40}{6,50}
		        //return o1[0]!=o2[0] ? o1[0]-o2[0] : o2[1]-o1[1]; // 첫번째 기준 오름차순 > 두번째 기준 내림차순  : {1,30}{2,10}{3,50}{4,20}{5,40}{6,50}{6,40}{6,30}{6,20}{6,10}
		    }
		});
		
		for(int i=0; i<s; i++) {
			bw.write(one[i][0] +" "+ one[i][1]+"\n");
		}
		
		bw.close();
	}
}