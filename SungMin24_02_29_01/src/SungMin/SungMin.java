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
	//11403 경로찾기
	static int one[][];
	static boolean check[];
	static int T;
	static Queue<Integer> q = new LinkedList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		T = Integer.parseInt(bf.readLine());
		one= new int [T][T];
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int j=0; j<T; j++) {
				int a =Integer.parseInt(st.nextToken());
				if(a==1) {
					one[i][j]= 1; 
				}
			}
		}
		
		for (int k = 0; k < T; k++) {
            for (int i = 0; i < T; i++) {
                for (int j = 0; j < T; j++) {
                    // 단순히 갈 수 있는 경로가 있는지만 체크함.
                    if (one[i][k] == 1 && one[k][j] == 1) {
                    	one[i][j] = 1;
                    }
                }
            }
        }
		for(int i = 0; i < T; i++) {
            for(int j = 0; j < T; j++) {
                bw.write(one[i][j] + " ");
            }
            bw.write("\n");
        }
		bw.close();
	}
}

