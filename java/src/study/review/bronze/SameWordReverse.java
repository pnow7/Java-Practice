package study.review.bronze;

/*
- 펠린드롬인지 확인하기

팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다. 
level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.

[입력]
level

baekjoon

[출력]
1

0


*/

import java.io.*;

public class SameWordReverse {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String A = br.readLine();
		String B = new StringBuilder(A).reverse().toString();
		
		if (A.equals(B)) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}
	
}
