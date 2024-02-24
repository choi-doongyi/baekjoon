package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class SungMin {
	//16928 뱀과 사다리 게임
	static HashMap<Integer,Integer> map;
	static int dp[] = new int[100+1];
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		map = new HashMap<>();
		for(int i=0; i<N+M; i++) {
			StringTokenizer st2 = new StringTokenizer(bf.readLine());
			map.put(Integer.parseInt(st2.nextToken()),Integer.parseInt(st2.nextToken()));
		}
		dfs();
		System.out.println(dp[100]);
	}
	static void dfs() {
		
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		dp[1]=0;
		while(!q.isEmpty()) {
			int value = q.poll();
			int one=1;
			int two=2;
			int three=3;
			int four=4;
			int five=5;
			int six=6;
			
			if(map.containsKey(value+one)) {
				one = map.get(value+one);
			}
			else {
				one+=value;
			}
			if(map.containsKey(value+two)) {
				two = map.get(value+two);
			}
			else {
				two+=value;
			}
			if(map.containsKey(value+three)) {
				three = map.get(value+three);
			}
			else {
				three+=value;
			}
			if(map.containsKey(value+four)) {
				four = map.get(value+four);
			}
			else {
				four+=value;
			}
			if(map.containsKey(value+five)) {
				five = map.get(value+five);
			}
			else {
				five+=value;
			}
			if(map.containsKey(value+six)) {
				six = map.get(value+six);
			}
			else {
				six+=value;
			}
			if(one<=100) {
				if(dp[one]==0) {
					dp[one]=dp[value]+1;
					q.add(one);
				}
				else {
					if(dp[one]>dp[value]+1) {
						dp[one]=dp[value]+1;
						q.add(one);
					}
				}
			}
			if(two<=100) {
				if(dp[two]==0) {
					dp[two]=dp[value]+1;
					q.add(two);
				}
				else {
					if(dp[two]>dp[value]+1) {
						dp[two]=dp[value]+1;
						q.add(two);
					}
				}
			}
			if(three<=100) {
				if(dp[three]==0) {
					dp[three]=dp[value]+1;
					q.add(three);
				}
				else {
					if(dp[three]>dp[value]+1) {
						dp[three]=dp[value]+1;
						q.add(three);
					}
				}
			}if(four<=100) {
				if(dp[four]==0) {
					dp[four]=dp[value]+1;
					q.add(four);
				}
				else {
					if(dp[four]>dp[value]+1) {
						dp[four]=dp[value]+1;
						q.add(four);
					}
				}
			}if(five<=100) {
				if(dp[five]==0) {
					dp[five]=dp[value]+1;
					q.add(five);
				}
				else {
					if(dp[five]>dp[value]+1) {
						dp[five]=dp[value]+1;
						q.add(five);
					}
				}
			}if(six<=100) {
				if(dp[six]==0) {
					dp[six]=dp[value]+1;
					q.add(six);
				}
				else {
					if(dp[six]>dp[value]+1) {
						dp[six]=dp[value]+1;
						q.add(six);
					}
				}
			}
		}
	}
}

