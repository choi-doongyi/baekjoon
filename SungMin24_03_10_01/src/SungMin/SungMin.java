package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class SungMin {
	//15657 N과 M(8)
	static int[] nums;
    static int[] arr;
    static boolean[] isVisited;
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();
    static ArrayList<Integer> al = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		StringTokenizer st2 = new StringTokenizer(bf.readLine());
		nums = new int[N];
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(nums);
        dfs(0,0);
 
	}
 
	static void dfs(int startIdx, int depth) {
		if(depth == M) {
			for(int i=0; i<M; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i=startIdx; i<N; i++) {
			arr[depth] = nums[i];
			dfs(i, depth + 1); // 자기 자신도 포함해야 하기 때문에 i를 넣어준다.
		}
	}
}