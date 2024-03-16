package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class SungMin {
	//1753 최단경로
	static class Node {
		int end;
		int weight;
		Node(int end, int weight){
			this.end = end;
			this.weight = weight;
		}
	}
	static Integer Node2[];
	static int one[][];
	static Queue<Node> q = new LinkedList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(bf.readLine());
		int V = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(bf.readLine());
		boolean[] visit = new boolean[V+1];     // 방문 처리 배열
        int[] result = new int[V+1];            // 최단 경로 값 저장 배열
        List<Node>[] list = new List[V+1];      // 연결 정보 저장 배열
		
        // 연결 정보 저장할 배열, 최단 경로 값 저장 배열 초기화
        for(int i = 1; i<=V; i++) {
            list[i] = new ArrayList<>();
            result[i] = Integer.MAX_VALUE;
        }

        for(int i = 0; i<E; i++) {
            st = new StringTokenizer(bf.readLine());
            int u = Integer.parseInt(st.nextToken());       // 출발
            int v = Integer.parseInt(st.nextToken());       // 도착
            int w = Integer.parseInt(st.nextToken());       // 가중치

            list[u].add(new Node(v, w));
        }

        // 다익스트라
        PriorityQueue<Node> queue = new PriorityQueue<>((o1, o2) -> o1.weight - o2.weight);
        result[K] = 0;
        queue.add(new Node(K, 0));

        while(!queue.isEmpty()) {
            Node now = queue.poll();		// 현재 방문 정점
            if(!visit[now.end]) visit[now.end] = true;		// 방문처리
            // 현재 정정과 연결된 간선들에 대해 판단
            for(int i = 0; i<list[now.end].size(); i++) {
            	// 현재 정점에서 이어질 다음 정점
                Node next = list[now.end].get(i);
                // 다음 정점이 방문하지 않았고, 
                // 현재 가중치 + 해당 정점으로 향하는 가중치 값 < 해당 정점으로의 최단 경로 값이라면
                if(!visit[next.end] && now.weight + next.weight < result[next.end]) {
                    // 해당 정점으로의 최단 경로 값 Update
                    result[next.end] = now.weight + next.weight;
                    // 다음 방문할 예정이므로 queue에 넣어주기
                    queue.add(new Node(next.end, result[next.end]));
                }
            }
        }
		
        // 출력
        for(int i = 1; i<=V; i++) {
            if(result[i] == Integer.MAX_VALUE) System.out.println("INF");
            else System.out.println(result[i]);
        }
    }
}