package study.algorithm.string;

/*
- 그룹 단어 체커

그룹 단어란 단어에 존재하는 모든 문자에 대해서,
각 문자가 연속해서 나타나는 경우만을 말함.

예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, 
kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

첫째 줄에 단어의 개수 N이 들어온다. 
N은 100보다 작거나 같은 자연수이다. 

둘째 줄부터 N개의 줄에 단어가 들어온다. 
단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 
길이는 최대 100이다.

[입력]
3
happy
new
year

4
aba
abab
abcabc
a

[출력]
3

1

*/

import java.io.*;

public class GroupWordChecker {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		
		for (int i = 0; i < N; i++) {
			String word = br.readLine();
			
			if (isGroupWord(word)) {
				count++;
			}
		}

		System.out.println(count);
		br.close();
	}
	
	private static boolean isGroupWord(String word) {
		boolean[] alpha = new boolean[26];
		
		char prevCh = '0';
		
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			int index = ch - 'a';
			
			if (ch != prevCh) {
				if (alpha[index] == true) {
					return false;
				}
				
				alpha[index] = true;
				prevCh = ch;
			}
		}
		
		return true;
	}

}