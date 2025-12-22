package study.data_structure.stack;

/*

-도키도키 간식드리미

학생들이 번호 순서대로 간식을 받으려 한다.
줄에서 한 명씩 나올 수 있고, 보조 공간(스택) 에 잠시 대기할 수 있다.

규칙:
현재 줄 맨 앞 학생이 원하는 번호면 바로 간식 지급
아니면 스택에 넣음
스택 맨 위가 원하는 번호면 스택에서 꺼내 지급

이 과정을 반복해 1번부터 N번까지 모두 순서대로 간식을 줄 수 있으면 “Nice”,
중간에 불가능해지면 “Sad”

-> 스택을 이용해 순서를 맞출 수 있는지 확인하는 문제

[입력]
5
5 4 1 3 2

[출력]
Nice

*/

import java.io.*;
import java.util.*;

public class StackSnack {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] man = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			man[i] = Integer.parseInt(st.nextToken());
		}
		
		bw.write(isValid(man)+"\n");
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static String isValid(int[] num) {
		Stack<Integer> stack = new Stack<>();
		
		int order = 1;
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] == order) {
				order++;
			} else {
				stack.push(num[i]);
			} while(!stack.isEmpty() && stack.peek() == order) {
				stack.pop();
				order++;
			}
		}
		
		return stack.isEmpty() ? "Nice" : "Sad";
	}

}
