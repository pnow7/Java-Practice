package test.test12.test1211;

/*
- 세로읽기

글자들은 영어 대문자 ‘A’부터 ‘Z’, 
영어 소문자 ‘a’부터 ‘z’, 숫자 ‘0’부터 ‘9’이다. 
영석이는 칠판에 글자들을 수평으로 일렬로 붙여서 단어를 만든다. 
다시 그 아래쪽에 글자들을 붙여서 또 다른 단어를 만든다. 
이런 식으로 다섯 개의 단어를 만든다. 
 
A A B C D D
a f z z 
0 9 1 2 1
a 8 E W g 6
P 5 h 3 k x

다섯 개의 단어를 세로로 읽으려 한다. 
세로로 읽을 때, 각 단어의 첫 번째 글자들을 위에서 아래로 세로로 읽는다. 다음에 두 번째 글자들을 세로로 읽는다. 
이런 식으로 왼쪽에서 오른쪽으로 한 자리씩 이동 하면서 
동일한 자리의 글자들을 세로로 읽어 나간다.

세로로 읽을 때 해당 자리의 글자가 없으면, 
읽지 않고 그 다음 글자를 계속 읽는다. 
그림 1의 다섯 번째 자리를 세로로 읽으면 D1gk로 읽는다.

영석이가 세로로 읽은 순서대로 글자들을 공백 없이 출력하면 다음과 같다:
Aa0aPAf985Bz1EhCz2W3D1gkD6x

[입력]
ABCDE
abcde
01234
FGHIJ
fghij

AABCDD
afzz
09121
a8EWg6
P5h3kx

[출력]
Aa0FfBb1GgCc2HhDd3IiEe4Jj

Aa0aPAf985Bz1EhCz2W3D1gkD6x

*/

import java.io.*;

public class Main10798 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		char[][] ch = new char[5][15];
		
		for (int i = 0; i < 5; i++) {
			String word = br.readLine();
			for (int j = 0; j < word.length(); j++) {
				ch[i][j] = word.charAt(j);
			}
		}
		
		// 0은 ASCII로 변환하면 NULL임
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if (ch[j][i] != 0) { 
					sb.append(ch[j][i]);
				}
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
}