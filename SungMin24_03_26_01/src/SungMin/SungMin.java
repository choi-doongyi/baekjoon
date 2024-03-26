package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;


public class SungMin {
	//1967 트리의 지름
	static int n;
    static int max =0;
    static int max_idx = 0;
    static boolean visited[];
    static ArrayList<Node>[] list;
    
	static class Node{ // BFS 탐색용
        int idx;
        int cnt;

        public Node(int idx, int cnt) {
            this.idx = idx;
            this.cnt = cnt;
        }
    }
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(bf.readLine());

		list = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
        	list[i] = new ArrayList<>();
        }

        for (int i = 0; i < n-1; i++) {
            String[] inputs = bf.readLine().split(" ");
            int parent = Integer.parseInt(inputs[0]);
            int child = Integer.parseInt(inputs[1]);
            int weight = Integer.parseInt(inputs[2]);
            list[parent].add(new Node(child,weight));
            list[child].add(new Node(parent,weight));
        }
        
        visited = new boolean[n+1];
        visited[1] = true;
        dfs(1,0);
        
        
        visited = new boolean[n+1];
        visited[max_idx] = true;
        dfs(max_idx,0);
        System.out.println(max);
	}
	
	public static void dfs(int idx, int cnt) {
        
        if(max < cnt) {
            max = cnt;
            max_idx = idx;
        }

        for(Node a : list[idx]) {
            if(!visited[a.idx]) {
                visited[a.idx] = true;
                dfs(a.idx, cnt+a.cnt);
            }
        }
    }
}