package study.review.bronze.typeconversion;

/*
- 진법 변환2

10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.

10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.

A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35

[입력]
60466175 36

[출력]
ZZZZZ

*/

import java.io.*;
import java.util.*;

public class BaseConversion {
	
	private static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		sol(n, b);
		
		System.out.println(sb.toString());
		br.close();
	}
	
	private static void sol(int n, int b) {
		while (n > 0) {
			int remain = n % b;
			char ch;
			
			if (remain >= 10) {
				ch = (char)(remain - 10 + 'A');
			} else {
				ch = (char)(remain + '0');
			}
			
			sb.append(ch);
			n = n / b;
		}
		
		sb.reverse();
	}
	
}