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
	//9375 패션왕 신해빈
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(bf.readLine());
		
		
		for(int i=0; i<a; i++) {
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			Stack<String> gamja = new Stack<>();
			int b = Integer.parseInt(bf.readLine());
			for(int j=0; j<b; j++) {
				StringTokenizer st = new StringTokenizer(bf.readLine());
				String sung1 = st.nextToken();//덜어내기용
				String sung2 = st.nextToken();
				if(map.containsKey(sung2)) {
					map.put(sung2,map.get(sung2)+1);
				}
				else {
					map.put(sung2, 1);
					gamja.add(sung2);
				}
				
			}
			int sum=1;

			for (int val : map.values()) {
				sum *= (val + 1);
			}
			System.out.println(sum-1);
		}
		if(a==0) {
			System.out.println(0);
		}
	}
}

