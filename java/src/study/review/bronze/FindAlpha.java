package study.review.bronze;

/*
- 알파벳 찾기

알파벳 소문자로만 이루어진 단어 S가 주어진다. 
각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

[입력]
baekjoon

[출력]
1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1

*/

import java.io.*;
import java.util.*;

public class FindAlpha {
	
	private static int[] alpha = new int[26];
	private static boolean[] visited = new boolean[26];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String word = br.readLine();
		Arrays.fill(alpha, -1);
		
		for (int i = 0; i < word.length(); i++) {
			int charIndex =  word.charAt(i) - 'a';

			if (visited[charIndex]) {
				continue;
			} else {
				alpha[charIndex] = i;
				visited[charIndex] = true;
			}
		}
		
		for (int i = 0; i < alpha.length; i++) {
			sb.append(alpha[i]).append(" ");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
}