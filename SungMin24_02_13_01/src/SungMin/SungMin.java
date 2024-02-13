package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
 
public class SungMin {
	//1012 유기농 배추
	static int b,c;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(bf.readLine());
		
		for(int i=0; i<a; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			b =Integer.parseInt(st.nextToken());
			c =Integer.parseInt(st.nextToken());
			int d =Integer.parseInt(st.nextToken());
			int one[][] = new int[b][c];
			boolean visited[][] = new boolean[b][c];
			for(int j=0; j<d; j++) {
				StringTokenizer st2 = new StringTokenizer(bf.readLine());
				int a1 = Integer.parseInt(st2.nextToken());
				int a2 = Integer.parseInt(st2.nextToken());
				one[a1][a2] =1;
			}
			int count =0;
			 for (int j = 0; j < b; j++) {
	                for (int k = 0; k < c; k++) {
	                    
	                    //좌표에 배추가 있는지 확인, 내가 체크안한 곳인지 확인한다
	                     if(one[j][k] == 1 && !visited[j][k]){
	                         //배추가 있고 체크안된 좌표에서부터 bfs로 연결된 곳을 파악한다
	                         bfs(j, k,one,visited);
	                         
	                         //지렁이의 개수는 인접한 곳마다 1개씩이다.
	                         //인접한 곳을 모두 파악했으면 지렁이를 한마리 놓는다.
	                         count++;
	                     }
	                }
	            }
			 System.out.println(count);
		}

	}
	static void bfs(int start,int start2, int[][] graph, boolean[][] visited) {

		// BFS에 사용할 큐를 생성해줍니다.
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {start, start2});
		// 시작노드 방문처리
		visited[start][start2] = true;
		int[] X = {-1,+1,0,0};
		int[] Y = {0,0,-1,+1};

		// 큐가 빌 때까지 반복
		while(!q.isEmpty()) {
			int poll[] = q.poll();
			//큐에서 꺼낸 노드와 연결된 노드들 체크
				
			for(int i=0; i<4; i++) {
			
				int x = poll[0] + X[i];
                int y = poll[1] + Y[i];
                //상하좌우 좌표 조정

                //좌표가 배추밭을 벗어나게되면 다음 좌표를 체크해야한다
                if(x < 0 || x >= b || y < 0 || y >= c){
                    continue;
                }

                //상하좌우 움직인 좌표에 배추가 있고, 체크하지 않은 좌표이면
                if(graph[x][y] == 1 & !visited[x][y]){
                    q.offer(new int[] {x, y});
                    //좌표를 저장한다.
                    visited[x][y] = true;
                    //체크한다
                }
			}
		}
	}
}

