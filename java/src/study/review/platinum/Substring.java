package study.review.platinum;

/*
- 부분 문자열

문자열 S의 부분 문자열이란, 문자열의 연속된 일부를 의미

예를 들어, "aek", "joo", "ekj"는 "baekjoon"의 부분 문자열이고,
"bak", "p", "oone"는 부분 문자열이 아니다.

문장려 S와 P가 주어졌을 때, P가 S의 부분 문자열인지 아닌지 알아보자

P가 S의 부분 문자열이면 1, 아니면 0

[입력]
baekjoon
aek

baekjoon
bak

[출력]
1

0

*/

import java.io.*;

public class Substring {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		String P = br.readLine();
		
		int result = kmpSearch(S, P);
		
		System.out.println(result);
		br.close();
	}
	
	private static int kmpSearch(String S, String P) {
		int[] pi = getPi(P);
		int j = 0;
		
		for (int i = 0; i < S.length(); i++) {
			// [불일치 시 동작]
			while (j > 0 && S.charAt(i) != P.charAt(j)) {
				j = pi[j - 1];
			}
			
			// [일치 시 동작]
			if (S.charAt(i) == P.charAt(j)) {
				// P의 마지막 문자까지 일치
				if (j == P.length() - 1) {
					return 1;
				} else {
					// S의 문자와 P의 다음 문자 비교
					j++;
				}
			}
		}
		
		return 0;
	}
	
	// 가장 긴 접두사, 접미사 계산
	private static int[] getPi(String P) {
		int[] pi = new int[P.length()];
		int j = 0;
		
		for (int i = 1; i < P.length(); i++) {
			// j 초기화(앞으로 점프-작은 값으로) 및 다음 접미사로 점프
			while (j > 0 && P.charAt(i) != P.charAt(j)) {
				j = pi[j - 1];
			}
			
			if (P.charAt(i) == P.charAt(j)) {
				j++;
				pi[i] = j;
			}
		}
		
		return pi;
	}
	
}


/*

i, P[i], 접두사/접미사 일치 길이 (π[i])
0, A,0, "P[0...0] = ""A"". 일치 없음."
1, B,0, "P[0...1] = ""AB"". 일치 없음."
2, A,1, "P[0...2] = ""ABA"". 접두사(""A"") = 접미사(""A""). 길이 1."
3, A,1, "P[0...3] = ""ABAA"". 접두사(""A"") = 접미사(""A""). 길이 1."
4, B,2, "P[0...4] = ""ABAAB"". 접두사(""AB"") = 접미사(""AB""). 길이 2."
5, A,3, "P[0...5] = ""ABAABA"". 접두사(""ABA"") = 접미사(""ABA""). 길이 3."

패턴 P: A B A B C A B A
pi 배열: [0, 0, 1, 2, 0, 1, 2, 3] -> 길이 8 (j)
텍스트 S: A B A B C A B A X A B A B C A B A -> 길이 17 (i)



*/