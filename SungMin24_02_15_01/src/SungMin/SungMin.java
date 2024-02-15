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
	//1697 숨바꼭질
	static int one[] = new int[100000+1];
	static int N,K;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N =Integer.parseInt(st.nextToken());//세로
		K =Integer.parseInt(st.nextToken());//세로
		System.out.println(bfs(N));
	}
	static int bfs(int n) {

		// BFS에 사용할 큐를 생성해줍니다.
		Queue<Integer> q = new LinkedList<>();
		q.offer(n);
		one[n]=1;
		// 큐가 빌 때까지 반복
		while(!q.isEmpty()) {
			int poll = q.poll();
			//큐에서 꺼낸 노드와 연결된 노드들 체크
			if(poll ==K) {
				return one[poll]-1;
			}
			if(poll-1>=0 && one[poll-1]==0) {
				one[poll-1]=one[poll]+1;
				q.add(poll-1);
			}
			if(poll+1<=100000 && one[poll+1]==0) {
				one[poll+1]=one[poll]+1;
				q.add(poll+1);
			}
			if(poll*2<=100000 && one[poll*2]==0) {
				one[poll*2]=one[poll]+1;
				q.add(poll*2);
			}
		}
		return -1;
	}
}

