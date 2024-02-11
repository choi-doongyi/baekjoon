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
	//1076 저항
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("black",0);
		map.put("brown",1);
		map.put("red",2);
		map.put("orange",3);
		map.put("yellow",4);
		map.put("green",5);
		map.put("blue",6);
		map.put("violet",7);
		map.put("grey",8);
		map.put("white",9);
		

		String a = bf.readLine();
		String b = bf.readLine();
		String c = bf.readLine();
		long d = Long.parseLong(String.valueOf(map.get(a)) + String.valueOf(map.get(b)));
		d*=Math.pow(10, map.get(c));
		System.out.println(d);

		
		
	}
}

