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
import java.util.Stack;
import java.util.StringTokenizer;

class City implements Comparable<City> {
    int to;
    int weight;
 
    City(int to, int weight) {
        this.to = to;
        this.weight = weight;
    }
 

    public int compareTo(City arg0) {
        return weight - arg0.weight;
    }
}

public class SungMin {
	//11779 최소비용 구하기 2
	static int N, M;
	static int d[], preCity[];
	static int start, end;
	static List<ArrayList<City>> graph;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());

		d = new int[N + 1]; // 해당 도시까지 가는데의 최소 비용
		preCity = new int[N + 1]; // 이전도시
		Arrays.fill(d, Integer.MAX_VALUE);

		graph = new ArrayList<>();
		for (int i = 0; i < N + 1; i++)
			graph.add(new ArrayList<City>());

		for (int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			graph.get(from).add(new City(to, weight));

		}
		StringTokenizer st = new StringTokenizer(br.readLine());
		start = Integer.parseInt(st.nextToken());
		end = Integer.parseInt(st.nextToken());

		dijkstra(start);
		System.out.println(d[end]); // 최단 거리
		// 경로 역추적
		int cnt = 0;
		Stack<Integer> stack = new Stack<>();
		stack.push(end);
		while (preCity[end] != 0) {
			cnt += 1;
			stack.push(preCity[end]);
			end = preCity[end];
		}
		System.out.println(cnt + 1);
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}

	}
	private static void dijkstra(int start) {
		PriorityQueue<City> pq = new PriorityQueue<City>();
		pq.add(new City(start, 0));
		d[start] = 0;

		while (!pq.isEmpty()) {
			City curCity = pq.poll();
			int cur = curCity.to;
			if (d[cur] < curCity.weight)
				continue;
			for (City next : graph.get(cur)) {
				if (d[next.to] > d[cur] + next.weight) { // 최단거리 cost 업데이트
					d[next.to] = d[cur] + next.weight;
					preCity[next.to] = cur; // 이전마을 기록
					pq.offer(new City(next.to, d[next.to]));
				}
			}
		}

	}
}