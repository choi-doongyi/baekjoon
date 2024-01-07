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
		int b[] = new int[a];
		int c[] = new int[a];
		for(int i=0; i<a; i++) {
			b[i] = Integer.parseInt(bf.readLine());;
		}
		//1874 스택수열
		List<String> list = new ArrayList<>();
		int count=0;
		int count2=0;
		boolean sungmin = false;
		for(int i=0; i<a; i++) {
			while(true) {
				if(count<b[i]) {
					list.add("+");
					count+=1;
					count2=count;
					
				}
				else if(count>=b[i]) {
					if(count2>=b[i]) {
						if(count2-2>=b[i]) {
							for(int x=b[i]; x<count2-1; x++) {//5 //7
								if(c[x]!=x+1) {
									sungmin=true;
								}
							}
							
						}
						list.add("-");
						count2=b[i];
						c[b[i]-1]=b[i];
						
						
						break;
					}
					else {
						sungmin=true;
						break;
					}
					
				}
			}
		}
		if(sungmin) {
			bw.write("NO");
		}
		else {
			for(int i=0; i<list.size(); i++) {
				bw.write(list.get(i)+"\n");
			}
		}
		
		//1874 스택 수열
	
		bw.close();
		
	}
}
