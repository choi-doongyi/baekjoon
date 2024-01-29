package SungMin;

import java.io.BufferedReader;   
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class SungMin {
	static boolean isPrime[];
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//17103 골드바흐 파티션

		int a = Integer.parseInt(bf.readLine());
		int one[];
		for(int i=0; i<a; i++) {
			int b = Integer.parseInt(bf.readLine());
			one = isPrime_fun(b);
			int count =0;
			int count2 =0;
			for(int j=0; j<one.length; j++) {
				int c = b-one[j];
				if(twojin(one,c)!=-1) {
					count+=1;
					one[j] =0;
				}
			}
			System.out.println(count);
		}
		

		
    }
	static int[] isPrime_fun(int n){ 
        isPrime = new boolean[n+1]; // N번째의 수 까지 받기위해 N+1까지 동적할당
        
        for(int i = 0; i < isPrime.length; i++){
            isPrime[i] = true; // boolean배열의 default값은 false이므로 true로 바꿔주기
        }
        
        isPrime[0] = isPrime[1] = false; // 0과 1은 소수가 아니니깐 false
        
        for(int i = 2; i <= Math.sqrt(n); i++){ // 2부터 n의 제곱근까지의 모든 수를 확인
            if(isPrime[i]){ // 해당수가 소수라면, 해당수를 제외한 배수들을 모두 false 처리하기
                for(int j = i*i; j<= n; j += i){//그 이하의 수는 모두 검사했으므로 i*i부터 시작
                    isPrime[j] = false;
                }
            }
        }
        List<Integer> one = new ArrayList<>();
        for(int i=0; i<isPrime.length; i++) {
        	if(isPrime[i]==true) {one.add(i);}
        }
        int[] two = new int[one.size()];
        for(int i=0; i<one.size(); i++) {
        	two[i] = one.get(i);
        }
        
        return two;
    } // isPrime_fun 함수 종료
	
	static int twojin(int a[],int key) {
		int high = a.length-1;
		int low = 0;
		int mid;
		while(low<=high) {
			mid = (high+low)/2;
			
			if(a[mid]==key) {
				return mid;
			}
			else if(a[mid]>key) {
				high = mid-1;
				
			}
			else {
				low = mid+1;
			}
		}
		
		return -1;
	}
}
