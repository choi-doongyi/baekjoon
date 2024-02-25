package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class SungMin {
	//7662 이중 우선순위 큐
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(bf.readLine());
		for(int i=0; i<T; i++) {
			int T2 = Integer.parseInt(bf.readLine());
			TreeMap<Integer, Integer> que = new TreeMap<>();
			for(int j=0; j<T2; j++) {
				StringTokenizer st = new StringTokenizer(bf.readLine());
				String a = st.nextToken();
				int b = Integer.parseInt(st.nextToken());
				if(a.equals("I")) {
					que.put(b, que.getOrDefault(b, 0) + 1);
				}
				else {
					if(que.isEmpty()) continue;

					if(b==1) {
						int c =que.lastKey();
						if (que.put(c, que.get(c) - 1) == 1)
	                        que.remove(c);
					}
					else {
						int c =que.firstKey();
						if (que.put(c, que.get(c) - 1) == 1)
	                        que.remove(c);
					}
				}
			}
			if(!que.isEmpty()) {
				bw.write(que.lastKey()+" "+que.firstKey()+"\n");
			}
			else {
				bw.write("EMPTY\n");
			}
			
		}
		bw.close();
	}
}

