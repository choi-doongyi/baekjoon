package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;
 
public class SungMin {
	//17219 비밀번호 찾기
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		Map<String, String> map = new HashMap<>();
		for(int i=0; i<a; i++) {
			StringTokenizer st2 = new StringTokenizer(bf.readLine());
			map.put(st2.nextToken(), st2.nextToken());
		}

		for(int i=0; i<b; i++) {
			bw.write(map.get(bf.readLine())+"\n");
		}
		bw.close();
	}
}

