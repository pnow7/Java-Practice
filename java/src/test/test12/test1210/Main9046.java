package test.test12.test1210;

/*
- 복호화

암호문 알파벳의 빈도수를 체크하고, 
가장 빈번하게 나타나는 문자를 출력하는 프로그램을 작성하면 된다.

만약 주어진 암호문에서 가장 빈번하게 나타나는 문자가 여러 개일 경우,  
"모르겠음"을 의미하는 '?'를 출력하면 된다.

[입력]
3
asvdge ef ofmdofn
xvssc kxvbv
hull full suua pmlu

[출력]
f
v
?

*/

import java.io.*;

public class Main9046 {

	private static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			String s = br.readLine();
			sol(s);
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
	private static void sol(String s) {
		int[] alpha = new int[26];
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if ('a' <= ch && ch <= 'z') {
				int alphaIndex = s.charAt(i) - 'a';
				alpha[alphaIndex]++;
			}
		}
		
		int max = 0;
		int maxCountAlpha = 0;
		int maxCount = 0;
		
		for (int i = 0; i < alpha.length; i++) {
			if (alpha[i] > max) {
				max = alpha[i];
				maxCountAlpha = i;
				maxCount = 1;
			} else if (alpha[i] == max && max > 0) {
				maxCount++;
			}
		}
		
		char result = (char)(maxCountAlpha + 'a');
		
		if (maxCount > 1) {
			sb.append("?").append("\n");
		} else {
			sb.append(result).append("\n");
		}
	}

}
