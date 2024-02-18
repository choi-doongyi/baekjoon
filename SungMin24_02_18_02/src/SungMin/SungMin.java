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
	//1267 핸드폰 요금
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int sum1 = 0;//Y
		int sum2 =0;
		int a = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0; i<a; i++) {
			int b = Integer.parseInt(st.nextToken());
			sum1+= ((b/30)+1)*10;
			sum2+= ((b/60)+1)*15;
		}
		if(sum1<sum2) {
			System.out.println("Y "+sum1);
		}
		else if(sum1 == sum2){
			System.out.println("Y M "+sum1);
		}
		else {
			System.out.println("M "+sum2);
		}
	}
}

