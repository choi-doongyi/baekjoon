package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class SungMin {
	//9019 DSLR
	static String one[];
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(bf.readLine());
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			one = new String[10000+1];
			System.out.println(dfs(st.nextToken(),st.nextToken()));
			
		}
		
		
	}
	static String dfs(String a, String b) {
		Queue<String[]> q = new LinkedList<>();
		one[Integer.parseInt(a)]="";


		q.add(new String[] {a,""});

		while(!q.isEmpty()) {
			String[] poll = q.poll();

			String value = poll[0];//숫자 값
			String value2 =poll[1];//DSLR 값 저장
				
			int intValue = Integer.parseInt(value);
			int d1 =intValue*2;
			if(d1>=10000) {
				d1%=10000;
			}
			String D= String.valueOf(d1);
			
			int s1 = intValue-1;
			if(s1<0) {
				s1=9999;
			}
			
			
			String S = String.valueOf(s1);
			
			
			String lr = "";
			if(value.length()<4) {
				for(int i=0; i<4-value.length(); i++) {
					lr+="0";
				}
			}
			lr+=value;
			
			String L=lr.substring(1,lr.length())+String.valueOf(lr.charAt(0));
			String r1 =String.valueOf(lr.charAt(lr.length()-1));
			String R=r1+lr.substring(0,lr.length()-1);
			
			
			
			if(one[Integer.parseInt(D)]==null) {
				one[Integer.parseInt(D)]=value2+"D";
				q.add(new String[] {D,value2+"D"});
			}
			
			if(one[Integer.parseInt(S)]==null) {
				one[Integer.parseInt(S)]=value2+"S";
				q.add(new String[] {S,value2+"S"});
			}
			
			if(one[Integer.parseInt(L)]==null) {
				one[Integer.parseInt(L)]=value2+"L";
				q.add(new String[] {L,value2+"L"});
			}
			
			if(one[Integer.parseInt(R)]==null) {
				one[Integer.parseInt(R)]=value2+"R";
				q.add(new String[] {R,value2+"R"});
			}
			
			if(one[Integer.parseInt(b)]!=null) {
				break;
			}
		}
		return one[Integer.parseInt(b)];
	}
}

