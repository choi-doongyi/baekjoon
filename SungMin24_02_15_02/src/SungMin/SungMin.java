package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class SungMin {
	//11724 연결 요소의 개수
	static Integer one[][];
	static boolean check[];
	static int N,M;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N =Integer.parseInt(st.nextToken());//세로
		M =Integer.parseInt(st.nextToken());//세로
		one = new Integer[N+1][N+1];
		check = new boolean[N+1];
		for(int i=0; i<M; i++) {
			StringTokenizer st2 = new StringTokenizer(bf.readLine());
			int a1 = Integer.parseInt(st2.nextToken());
			int a2 = Integer.parseInt(st2.nextToken());
			one[a1][a2] = 1;
			one[a2][a1] =1;
		}
		int count=0;
		for(int i=1; i<=N; i++) {	
			if(check[i]==false) {
				bfs(i);
				count+=1;
			}
		}
		System.out.println(count);
		
	}
	static void bfs(int n) {

		// BFS에 사용할 큐를 생성해줍니다.
		int sung = n;
		Queue<Integer> q = new LinkedList<>();
		q.offer(sung);
		// 큐가 빌 때까지 반복
		while(!q.isEmpty()) {
			int poll = q.poll();
			//큐에서 꺼낸 노드와 연결된 노드들 체크
			for(int i=1; i<=N; i++) {
				if(one[poll][i]!=null && check[poll]==false) {
					q.offer(i);
				}
			}
			check[poll] = true;
		}
	}
}

