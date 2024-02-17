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
	//1453 피시방 알바
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a =Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		boolean one[] = new boolean[100+1];
		int sum=0;
		for(int i=0; i<a; i++) {
			int b = Integer.parseInt(st.nextToken());
			if(one[b]==false) {
				one[b]=true;
			}
			else {
				sum+=1;
			}
		}
		System.out.println(sum);
		
	}
}

