package SungMin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;
 
public class SungMin {
	//15663 N과 M(9)
	static int N, M;
    static int[] nums, perm;
    static boolean[] visit;
    static LinkedHashSet<String> ans;
    
    static StringBuilder sb = new StringBuilder();
    static ArrayList<Integer> al = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		nums = new int[N];
        perm = new int[M];
        visit = new boolean[N];
        ans = new LinkedHashSet<>();
        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++)
            nums[i] = Integer.parseInt(st2.nextToken());

        Arrays.sort(nums);
        permutation(0);
        ans.forEach(System.out::println);
    }

    static void permutation(int cnt) {
        if (cnt == M) {
            StringBuilder sb = new StringBuilder();
            for (int p : perm)
                sb.append(p).append(' ');
            ans.add(sb.toString());
            return;
        }

        for (int i = 0; i < N; i++) {
            if (visit[i])
                continue;
            visit[i] = true;
            perm[cnt] = nums[i];
            permutation(cnt + 1);
            visit[i] = false;
        }
    }
}