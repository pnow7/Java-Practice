package study.review.bronze;

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

public class WordStudy {

	private static int[] check = new int[26];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine().toUpperCase();
		
		for (int i = 0; i < word.length(); i++) {
			int index = word.charAt(i) - 'A';
			check[index]++;
		}
		
		int max = -1;
		int maxIndex = 0;
		boolean isDuplicate = false;
		
		for (int i = 0; i < 26; i++) {
			if (check[i] > max) {
				max = check[i];
				maxIndex = i;
				isDuplicate = false;
			} else if (check[i] == max && max != 0) {
				isDuplicate = true;
			}
		}
		
		if (isDuplicate) {
			System.out.println("?");
		} else {
			char result = (char)(maxIndex + 'A');
			System.out.println(result);
		}
		br.close();
	}

}