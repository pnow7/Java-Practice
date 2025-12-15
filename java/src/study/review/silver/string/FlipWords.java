package study.review.silver.string;

/*
- 단어 뒤집기 2

문자열 S가 주어졌을 때, 이 문자열에서 단어만 뒤집으려고 한다.
문자열 S는 아래와 같은 규칙을 지킴.

알파벳 소문자('a'-'z'), 숫자('0'-'9'), 공백(' '), 특수 문자('<', '>')로만 이루어져 있다.
문자열의 시작과 끝은 공백이 아니다.
'<'와 '>'가 문자열에 있는 경우 번갈아가면서 등장하며, 
'<'이 먼저 등장한다. 또, 두 문자의 개수는 같다.

첫째 줄에 문자열 S의 단어를 뒤집어서 출력한다.

[입력]
baekjoon online judge

<open>tag<close>

<ab cd>ef gh<ij kl>

<   space   >space space space<    spa   c e>

[출력]
noojkeab enilno egduj

<open>gat<close>

<ab cd>fe hg<ij kl>

<   space   >ecaps ecaps ecaps<    spa   c e>

*/

import java.io.*;
import java.util.*;

public class FlipWords {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		
		String S = br.readLine();
		boolean isTag = false;
		
		for (char ch : S.toCharArray()) {
			if (ch == '<') {
				while (!stack.isEmpty()) {
					sb.append(stack.pop());
				}
				isTag = true;
				sb.append(ch);
			} 
			else if (ch == '>') {
				isTag = false;
				sb.append(ch);
			} 
			// 태그 내부
			else if (isTag) {
				sb.append(ch);
			// 태그 외부
			} else {
				if (ch == ' ') {
					while (!stack.isEmpty()) {
						sb.append(stack.pop());
					}
					sb.append(ch);
				} else {
					stack.push(ch);
				}
			}
		}
		
		// 공백이나 태그로 끝나지 않는 경우 stack 잔여문자 처리
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		System.out.println(sb.toString());
		br.close();
	}

}