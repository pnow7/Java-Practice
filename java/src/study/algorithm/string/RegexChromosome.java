package study.algorithm.string;

/*
- 염색체

상근이는 생명과학 연구소에서 염색체가 특정한 패턴인지를 확인하는 일을 하고 있다. 염색체는 알파벳 대문자 (A, B, C, ..., Z)로만 이루어진 문자열이다. 상근이는 각 염색체가 다음과 같은 규칙을 만족하는지 검사해야 한다.

문자열은 {A, B, C, D, E, F} 중 0개 또는 1개로 시작해야 한다.
그 다음에는 A가 하나 또는 그 이상 있어야 한다.
그 다음에는 F가 하나 또는 그 이상 있어야 한다.
그 다음에는 C가 하나 또는 그 이상 있어야 한다.
그 다음에는 {A, B, C, D, E, F} 중 0개 또는 1개가 있으며, 더 이상의 문자는 없어야 한다.
문자열이 주어졌을 때, 위의 규칙을 만족하는지 구하는 프로그램을 작성하시오.

각 테스트 케이스에 대해서, 문제의 규칙을 지키는 문자열인 경우에는  "Infected!"를, 아닌 경우에는 "Good"을 출력한다.

[입력]
15
AFC
AAFC
AAAFFCC
AAFCC
BAFC
QWEDFGHJMNB
DFAFCB
ABCDEFC
DADC
SDFGHJKLQWERTYU
AAAAAAAAAAAAABBBBBBBBBBBBBBCCCCCCCCCCCCCCCCCCDDDDDDDDDDDEEEEEEEEEEEEEEEFFFFFFFFC
AAAFFFFFBBBBCCCAAAFFFF
ABCDEFAAAFFFCCCABCDEF
AFCP
AAFFCPP

[출력]
Infected!
Infected!
Infected!
Infected!
Infected!
Good
Good
Good
Good
Good
Good
Good
Good
Good
Good
*/

import java.io.*;

public class RegexChromosome {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int testCase = Integer.parseInt(br.readLine());
		String regex = "^[A-F]?A+F+C+[A-F]?$";
		
		while (testCase-- > 0) {
			String chromosome = br.readLine();
			
			if (chromosome.matches(regex)) {
				sb.append("Infected!").append("\n");
			} else {
				sb.append("Good").append("\n");
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}

}

/*
시작: [A-F]?
A 하나 이상: A+
F 하나 이상: F+
C 하나 이상: C+
끝: [A-F]?
전체 시작과 끝 고정: ^ ... $

기호		의미						예시
^		시작 or 대괄호 안에서 부정	^a : a로 시작
[]		안의 문자 중 하나			"[abc] → a,b,c"
[A-F]	A부터 F까지				"A,B,C,D,E,F"
?		0개 또는 1개				"a? → """", a"
+		1개 이상					"a+ → a, aa"

.		아무 문자 하나				"a.c → abc, a1c"
*		0개 이상					"a* → """", a, aa"
$		끝						a$ : a로 끝
*/
