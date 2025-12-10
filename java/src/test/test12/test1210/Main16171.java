package test.test12.test1210;

/*
- 나는 친구가 적다 (Small)

첫 번째 줄에는 알파벳 
소문자, 대문자, 숫자로 이루어진 문자열 S가 주어진다.

두 번째 줄에는 성민이가 찾고자 하는 알파벳 
소문자, 대문자로만 이루어진 키워드 문자열 K가 주어진다.

첫 번째 줄에 성민이가 찾고자 하는 키워드가 문자열 내에 존재하면 1,
존재하지 않으면 0을 출력

[입력]
1q2w3e4r5t6y
qwerty

1ovey0uS2
veS

[출력]
1

0

*/

import java.io.*;

public class Main16171 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		String K = br.readLine();
		
		String newS = S.replaceAll("[0-9]", "");
		
		boolean isContained = newS.contains(K);
		
		System.out.println(isContained ? "1" : "0");
		br.close();
	}

}
