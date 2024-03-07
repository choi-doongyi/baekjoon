package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class SungMin {
	//12851 숨바꼭질 2
	static int n,k,count=1;
	static Integer[] one = new Integer[100000+1];
    static Queue<Integer> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(bf.readLine());
		
    	n = Integer.parseInt(st.nextToken());
    	k = Integer.parseInt(st.nextToken());
		
    	one[n] = 0;
    	bfs(n);
    	System.out.println(one[k]);
    	System.out.println(count);
	}
    static void bfs(int n) {
    	q.add(n);
    	while(!q.isEmpty()) {
    		
    		int poll = q.poll();
    		if(poll+1<=100000) {
    			if(one[poll+1]==null) {
    				one[poll+1] = one[poll]+1;
    				if(poll+1==k&& count ==0) {
    					count=1;
    				}
    				if(one[k]==null) {
    					q.add(poll+1);
    				}
    			}
    			else if(poll+1==k&&one[poll+1]==one[poll]+1) {
					count+=1;
    			}
    			else if(one[poll+1]==one[poll]+1) {
    				q.add(poll+1);
    			}
    		}
    		if(poll-1>=0) {
    			if(one[poll-1]==null) {
    				one[poll-1] = one[poll]+1;
    				if(poll-1==k && count ==0) {
    					count=1;
    				}
    				if(one[k]==null) {
    					q.add(poll-1);
    				}
    			}
    			else if(poll-1==k&&one[poll-1]==one[poll]+1) {
					count+=1;
    			}
    			else if(one[poll-1]==one[poll]+1) {
    				q.add(poll-1);
    			}
    		}
    		if(poll*2<=100000) {
    			if(one[poll*2]==null) {
    				one[poll*2] = one[poll]+1;
    				if(poll*2==k && count ==0) {
    					count=1;
    				}
    				if(one[k]==null) {
    					q.add(poll*2);
    				}
    			}
    			else if(poll*2==k&&one[poll*2]==one[poll]+1) {
					count+=1;
    			}
    			else if(one[poll*2]==one[poll]+1) {
    				q.add(poll*2);
    			}
    		}
    	}
    }
}

