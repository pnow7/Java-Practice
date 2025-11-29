package F.bronze;

/*
- 단어 공부

알파벳 대소문자로 된 단어가 주어지면,
이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
단, 대문자와 소문자를 구분하지 않는다.

첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 
단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

[입력]
Mississipi

zZa

baaa

[출력]
?

Z

A

*/

import java.io.*;

public class WordStudy2 {
	
	private static int[] alp = new int[26]; 
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); 
		
		// A: 65, a: 97
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90) { 
				alp[s.charAt(i) - 65]++; 
			} else {
				alp[s.charAt(i) - 97]++; 
			}
		}
		
		int max = -1;
		char ch = '?';
		
		for (int i = 0; i < 26; i++) {
			if (alp[i] > max) {
				max = alp[i];
				
				// 65 더해서 대문자 변환
				ch = (char)(i + 65); 
			} else if (alp[i] == max) {
				ch = '?';
			}
		}
		
		System.out.println(ch);
		br.close();
	}
	
}
