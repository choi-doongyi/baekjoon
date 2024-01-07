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
import java.util.Stack;
import java.util.StringTokenizer;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a =Integer.parseInt(bf.readLine());
		//2775 부녀회장이 될테야
		for(int i=0; i<a; i++) {
			int k =Integer.parseInt(bf.readLine());	//층
			int n =Integer.parseInt(bf.readLine()); //호
			int one[][] = new int[k+1][n];
			for(int x=0; x<one.length; x++) {
				for(int y=0; y<one[0].length; y++) {
					if(x==0) {one[x][y]=y+1;}
					else if(y==0) {one[x][y]=1; }
					else {
						one[x][y] = one[x-1][y]+one[x][y-1];
					}
					
				}
				
			}
			System.out.println(one[k][n-1]);
			
		}
		
		//1874 스택 수열
	
		bw.close();
		
	}
}
