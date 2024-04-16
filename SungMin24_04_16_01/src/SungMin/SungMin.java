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
	//16922 로마 숫자 만들기
	static int n,value;
    public static int[] arr;	
    public static int[] gamja;
    public static boolean check[];
    public static StringBuilder sb;
    static Set<Integer> set = new HashSet<Integer>();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		sb = new StringBuilder();
		
		n = Integer.parseInt(bf.readLine());
		gamja = new int[n];
		check = new boolean[n];
		
		arr = new int[4];
		arr[0] = 1;
		arr[1] = 5;
		arr[2] = 10;
		arr[3] = 50;
		gam(0,0);
		
		System.out.println(set.size());
	}
	static void gam(int one,int count) {
		if(count==n) {
			int a  = 0;
			for(int i=0; i<n; i++) {
				a+=gamja[i];
			}
			set.add(a);
			return;
		}
		for(int i=one; i<4; i++) {
			gamja[count] = arr[i];
			gam(i, count+1);
		}
	}
}