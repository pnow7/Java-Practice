package study.review.bronze.math;

/*
- 공약수

자연수 n개가 주어진다. 이 자연수의 공약수를 모두 구하는 프로그램 작성

[입력]
2
75 125

3
110 22 88

[출력]
1
5
25

1
2
11
22

*/

import java.io.*;
import java.util.*;

public class CommonDivisor {

	private static int n;
	private static int[] num;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		n = Integer.parseInt(br.readLine());
		num = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0 ; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = num[0];
		for (int i = 1; i < n; i++) {
			result = gcd(result, num[i]);
		}
		
		for (int i = 1; i <= result; i++) {
			if (result % i == 0) {
				sb.append(i).append("\n");
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
	private static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		
		return gcd(b, a % b);
	}

}
