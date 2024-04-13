package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SungMin {
	//12101 1,2,3 더하기 2
	static int n,value;
	static int gamja[];
	static int goguma=0;
    public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		n = Integer.parseInt(st.nextToken());
		value = Integer.parseInt(st.nextToken());
		gamja = new int[n+1];
        bfs(0,0);
        
        if(goguma<value) {
        	System.out.println(-1);
        }
        else {
        	System.out.println(sb);
        }
        
        
	}
	public static void bfs(int a,int count) {
		if(a==n) {
			goguma+=1;
			if(goguma==value) {
				for(int i=0; i<count; i++) {
					sb.append(gamja[i]);
					if(i+1!=count) {
						sb.append("+");
					}
				}
				sb.append("\n");
			}
			return;
		}
		
		for(int i=1; i<=3; i++) {
			if(a+i<=n) {
				gamja[count] = i;
				bfs(a+i,count+1);
				gamja[count] = 0;
			}
		}
	}
}