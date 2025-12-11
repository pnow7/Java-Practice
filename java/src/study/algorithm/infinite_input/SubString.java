package study.algorithm.infinite_input;

/*
- 부분 문자열

2개의 문자열 s와 t가 주어졌을 때 
s가 t의 부분 문자열인지 판단하는 프로그램을 작성하라. 

부분 문자열을 가지고 있는지 판단하는 방법은 
t에서 몇 개의 문자를 제거하고 이를 순서를 바꾸지 않고 
합쳤을 경우 s가 되는 경우를 이야기 한다.

입력은 여러 개의 테스트 케이스로 이루어져 있다. 
각 테스트 케이스는 한 줄로 이루어져 있으며, 
문자열 s 와 t가 빈칸을 사이에 두고 들어온다. 
s와 t의 길이는 10만을 넘지 않는다.

[입력]
sequence subsequence
person compression
VERDI vivaVittorioEmanueleReDiItalia
caseDoesMatter CaseDoesMatter

[출력]
Yes
No
Yes
No

*/

import java.io.*;
import java.util.*;

public class SubString {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line;
		
		while ((line = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line);
			if (!st.hasMoreTokens()) continue;
			String s = st.nextToken();
			String t = st.nextToken();
			
			int checkPoint = 0;
			int count = 0;
			
			for (int i = 0; i < s.length(); i++) {
				char charS = s.charAt(i);
				
				for (int j = checkPoint; j < t.length(); j++) {
					char charT = t.charAt(j);
					
					if (charS == charT) {
						checkPoint = j + 1;
						count++;
						break;
					}
				}
			}
			
			if (count == s.length()) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

		br.close();
	}

}