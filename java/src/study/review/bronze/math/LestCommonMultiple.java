package study.review.bronze.math;

/*
- 최소공배수

두 자연수 A와 B에 대해서, A의 배수이면서 B의 배수인 자연수를 A와 B의 공배수라고 한다. 

이런 공배수 중에서 가장 작은 수를 최소공배수라고 한다. 
예를 들어, 6과 15의 공배수는 30, 60, 90등이 있으며, 최소 공배수는 30이다.

두 자연수 A와 B가 주어졌을 때, A와 B의 최소공배수를 구하는 프로그램을 작성하시오.

[입력]
3
1 45000
6 10
13 17

[출력]
45000
30
221

*/

import java.io.*;
import java.util.*;

public class LestCommonMultiple {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb.append(lcm(a, b)).append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
	// 유클리드 호제법
	private static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		
		return gcd(b, a % b);
	}
	
	// 최소공배수 (LCM)
	private static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}
	
}


/*
 * [유클리드 호제 - 밥]
 * GCD(A, B) = GCD(B, A (mod B))
 * 
 * [최소공배수]
 * LCM(A, B) = A x B / GCD(A, B)
 */
