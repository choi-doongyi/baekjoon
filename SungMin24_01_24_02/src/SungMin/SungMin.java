package SungMin;

import java.io.BufferedReader;   
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//6588 골드바흐의 추측
		boolean[] one = eratos(1000000);
		while(true) {
			int a = Integer.parseInt(bf.readLine());
			if(a==0) {break;}
			boolean sung=false;
			
			for(int i=2; i<=a/2; i++) {
				if(one[i]&&one[a-i]){
					bw.write(a+" = "+i+" + "+(a-i)+"\n");
					sung = true;
					break;
				}
			}
			
			if(!sung) {
				bw.write("Goldbach's conjecture is wrong."+"\n");
			}
		}
		bw.close();
	
	}
	private static boolean[] eratos(int number) {
        //해당 숫자가 소수면 true, 아니면 false로 채워줄 자료구조를 생성합니다.
        boolean[] primeList = new boolean[number+1];
        primeList[0]=false;
        primeList[1]=false;

        //0,1은 제외하고 2부터 true를 채워줍니다.
        for (int i = 2; i < number + 1; i++) {
        	primeList[i]=true;
        }

        /*
        * 원하는 숫자의 제곱근까지만 계산하면 되므로, 해당 수 제곱근까지만 순회해줍니다.
        * primeList.get(i)가 true라면, 그 배수들은 전부 그 숫자를 약수로 가지게 되므로 false 처리해줍니다.
        * primeList.get(i)가 false라면, 그 수가 이미 소수가 아니므로 그 수의 배수에 대해서도 검사할 필요가 없습니다.
        * 또한 i * k (k < i) 까지는 이전 반복에서 검사되므로 i * 2부터 검사할 필요가 없습니다. i * i 부터 검사합니다.
        * */
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (primeList[i]) {
                for (int j = i * i; j <= number; j+=i) {
                    primeList[j]= false;
                }
            }
        }

        return primeList;

        //혹은 Java8 스트림을 사용하면 다음과 같이 코드 한 줄로 primeList.get(i)가 true인 값들을 int 배열로 반환할 수 있습니다!
        //return IntStream.rangeClosed(0, number).filter(primeList::get).toArray();
    }
}
