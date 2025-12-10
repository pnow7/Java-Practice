package study.algorithm.implementation;

/*
- 소수찾기

주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

[입력]
4
1 3 5 7

[출력]
3

*/

import java.io.*;
import java.util.*;

public class FindPrimeNum {

	private static int count = 0;
	private static int check;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			sol(num);
		}
		
		System.out.println(count);
		br.close();
	}
	
	private static void sol(int n) {
		if (n == 1) return;
		
		check = 0;
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 ) {
				check++;
			}
		}
		
		if (check == 2) {
			count++;
		}
		
	}

	/**
	 * N이 소수인지 판별하는 O(sqrt(N)) 메서드
	 */
	private static void sol2(int n) {
		if (n < 2) return; 
		
		if (n == 2) {
			count++;
			return;
		}

		if (n % 2 == 0) return; 
		
		// 3부터 N의 제곱근까지 홀수만 검사하여 약수가 있는지 확인 ( i * i <= n; i += 2 )
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0) {
				return;
			}
		}
		
		count++;
	}
	
}

