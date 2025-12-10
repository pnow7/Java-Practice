package study.algorithm.math;

/*
- 최대공약수와 최대공배수

두 개의 자연수를 입력받아 최대공약수와 최대공배수를 구하라

[입력]
24 18

[출력]
6
72
*/

import java.io.*;
import java.util.*;

public class GcdLcm {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		System.out.println(gcd(A, B));
		System.out.println(lcm(A, B));
		br.close();
	}
	
	// 최대공약수 (유클리드 호제법)
	private static int gcd(int A, int B) {
		if (B == 0) {
			return A;
		}
		
		return gcd(B, A % B);
	}
	
	// 최소공배수 (LCM)
	private static int lcm(int A, int B) {
		return (A * B) / gcd(A, B);
	}

}
