package SungMin;

import java.io.BufferedReader;  
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class SungMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//1406 에디터
		Stack<Character> lStack = new Stack<Character>();
        Stack<Character> rStack = new Stack<Character>();
		
		String a = bf.readLine();
		for(int i=0; i<a.length(); i++) {
			lStack.add(a.charAt(i));
		}
		int b = Integer.parseInt(bf.readLine());
		for(int i=0; i<b; i++) {
			String c = bf.readLine();
            // 명령어 입력 받음
 
            // 왼쪽이동
            if (c.startsWith("L")) {
                // 커서가 맨 왼쪽이 아니면
                if(!lStack.empty()) {
                    rStack.push(lStack.pop());
                }
            // 오른쪽 이동
            } else if (c.startsWith("D")) {
                // 커서가 맨 오른쪽이 아니면
                if(!rStack.empty()) {
                    lStack.push(rStack.pop());
                }
            // 커서 왼쪽 문자 삭제
            } else if (c.startsWith("B")) {
                
                // 커서가 맨 왼쪽이 아니면
                if(!lStack.empty()) {
                    lStack.pop();
                }
                
            // 커서 왼쪽 문자 추가
            } else if (c.startsWith("P")) {
                
                String[] pCommand = c.split(" ");
                
                lStack.push(pCommand[1].toCharArray()[0]);
 
            }
		}
		while(!lStack.empty()) {
            rStack.push(lStack.pop());
        }
 
        // rStack이 빌때까지
        while(!rStack.empty()) {
            //출력
            bw.write(rStack.pop());
        }
		
		
		bw.close();
	}
}
