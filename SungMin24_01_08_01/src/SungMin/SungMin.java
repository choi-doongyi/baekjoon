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
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a =Integer.parseInt(st.nextToken());
		int b =Integer.parseInt(st.nextToken());	
		//1929 소수 구하기
		
		boolean[] gamja = new boolean[b+1];
	    
	    // 0과 1은 소수가 아니기 때문에 false를 저장한다.
		gamja[0] = false;				
		gamja[1] = false;
	    
	    // n의 제곱근까지 나눈다.
	    for(int i = 2; i <= Math.sqrt(b); i++) {
	        
	        	// 소수라면 뒤에 오는 코드를 스킵한다.
			if(gamja[i] == true) {
				continue;
			}
	        
			// 2부터 배수에 해당하는 수를 true로 변환한다.
			for(int j = i * i; j < gamja.length; j = j+i) {
				gamja[j] = true;
	        	}
		}
		
		for(int i=a; i<=b; i++) {
			if(gamja[i]==false && i!=1) {
				System.out.println(i);
			}
			
		}
		
		
	
		bw.close();
		
	}

}
