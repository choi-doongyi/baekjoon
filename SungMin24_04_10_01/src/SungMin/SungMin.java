package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;
import java.util.StringTokenizer;

public class SungMin {
	//5568 카드 놓기
	static int N,k;
    public static int[] arr;
    public static int[] ans;
    public static boolean[] visit;
    public static HashSet<Integer> set = new HashSet<Integer>();//HashSet생성
    public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		N = Integer.parseInt(bf.readLine());
		k = Integer.parseInt(bf.readLine());
		arr = new int[N];
		ans = new int[N];
        visit = new boolean[N];
		
        for(int i=0; i<N; i++) {
        	arr[i] =  Integer.parseInt(bf.readLine());
        }
		dfs(0,0);
		System.out.println(set.size());
	}
	public static void dfs(int cnt,int count){
        if(count == k) {
        	String a = "";
            for(int i = 0; i < k; i++) {
                a+=ans[i];
            }
            set.add(Integer.parseInt(a));
            return;
        }
        for(int i = 0; i < N; i++) {
        	if(visit[i]) {
        		continue;
        	}
    		visit[i] = true;
    		ans[count] = arr[i];
            dfs(i,count+1);
            visit[i] = false;
        }
    }
}