package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class SungMin {
	//10971 외판원 순회 2
	static int n;
    static boolean[] visited;
    static int[][] map;
    static long result_min = Integer.MAX_VALUE;
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		
		map = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<n; i++) {
            visited = new boolean[n];
            visited[i] = true;
            dfs(i, i, 0);
        }
        System.out.println(result_min);
    }

    public static void dfs(int start, int now, long cost){
        if (allVisited()) {
            if(map[now][start]!=0){
                result_min = Math.min(result_min, cost+map[now][0]);
            }
            return;
        }

        for(int i=1; i<n; i++){
            if (!visited[i] && map[now][i] != 0) {
                visited[i] = true;
                dfs(start, i, cost + map[now][i]);
                visited[i] = false;
            }
        }
    }

    public static boolean allVisited() {
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                return false;
            }
        }
        return true;
    }
}