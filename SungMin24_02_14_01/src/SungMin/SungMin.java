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
	//14940 쉬운 최단거리
	static int[][] one;
	static Integer[][] check;
	static int n,m;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		n =Integer.parseInt(st.nextToken());//세로
		m =Integer.parseInt(st.nextToken());//가로
		one = new int[n][m];
		check = new Integer[n][m];
		int start = 0;
		int start2 =0;
		for(int i=0; i<n; i++) {
			StringTokenizer st2 = new StringTokenizer(bf.readLine());
			for(int j=0; j<m; j++) {
				int a =Integer.parseInt(st2.nextToken());
				one[i][j]=a;
				if(a==0) {
					check[i][j]=a;
				}
				else if(a==2) {
					start =i;
					start2 = j;
				}
			}
		}
		bfs(start,start2);
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(check[i][j]==null) {
					check[i][j]=-1;
				}
				System.out.print(check[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	static void bfs(int start,int start2) {

		// BFS에 사용할 큐를 생성해줍니다.
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {start, start2});
		// 시작노드 방문처리
		check[start][start2] = 0;
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
                if(x < 0 || x >= n || y < 0 || y >= m){
                    continue;
                }

                //상하좌우 움직인 좌표에 배추가 있고, 체크하지 않은 좌표이면
                if(check[x][y] == null){
                    q.offer(new int[] {x, y});
                    //좌표를 저장한다.
                    check[x][y] = check[poll[0]][poll[1]]+1;
                    //체크한다
                }
			}
		}
	}
}

