package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SungMin {
	//1405 미친로봇
	static int n;
	static double north, south, east, west;
	static double simple,notSimple;
	static double percent[] = new double[4];
    public static int[][] map;	
    public static boolean check[][];
    static int[] dx = {0, 0, 1, -1}; //동 서 남 북 순서
    static int[] dy = {1, -1, 0, 0};
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		st = new StringTokenizer(bf.readLine());
		n = Integer.parseInt(st.nextToken());
		for(int i=0; i<4; i++) {
			percent[i]= Integer.parseInt(st.nextToken())*0.01;
		}

		map = new int[n*2+1][n*2+1];
		check = new boolean[n*2+1][n*2+1];
		check[n][n]=true;
        robot(n,n,0,1);

		System.out.println(simple);
	}
	
	public static void robot(int x,int y,int count, double value) {
		if(count==n) {
			simple+=value;
			return;
		}

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(nx >= 0 && ny >= 0 && nx < 30 && ny < 30) {
                if(check[nx][ny] == false) {
                	check[nx][ny] = true;
                    robot(nx, ny, count + 1, value * percent[i]);
                    check[nx][ny] = false;
                }
            }
        }
	}
	
}