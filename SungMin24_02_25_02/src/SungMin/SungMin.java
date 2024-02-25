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
	//2204 도비의 난독증 테스트
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			int T = Integer.parseInt(bf.readLine());
			if(T==0) {
				break;
			}
			ArrayList<String> al = new ArrayList<>();
			for(int i=0; i<T; i++) {
				al.add(bf.readLine());
			}
			 Collections.sort(al, String.CASE_INSENSITIVE_ORDER);
			System.out.println(al.get(0));
		}
		
		
	}
}

