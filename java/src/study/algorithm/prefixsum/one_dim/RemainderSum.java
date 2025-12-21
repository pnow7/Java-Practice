package study.algorithm.prefixsum.one_dim;

/*
- 나머지 합

수 N개 A1, A2, ..., AN이 주어진다. 
이때, 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 구하는 프로그램을 작성하시오.

즉, Ai + ... + Aj (i ≤ j) 의 합이 M으로 나누어 떨어지는 (i, j) 쌍의 개수를 구해야 한다.

첫째 줄에 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 출력한다.

[입력]
5 3
1 2 3 1 2

[출력]
7

*/

import java.io.*;
import java.util.*;

public class RemainderSum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()) ;
		int M = Integer.parseInt(st.nextToken()) ;
		
		int[] A = new int[N];
		int[] S = new int[N + 1];
		int[] R = new int[M];
		
		R[0]++;		
		
		// M으로 나눈 나머지가 0인것도 포함시켜야함
		int remainder = 0;
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			A[i - 1] = Integer.parseInt(st1.nextToken());
			S[i] = S[i - 1] + A[i - 1];
			remainder = S[i] % M;
			R[remainder]++;
		}
		
		int count = 0;
		
		// 조합공식: r! / (n! * (r-n)!)
		for (int i = 0; i < M; i++) {
			count += R[i] * (R[i] - 1) / 2;		
		}
		
		System.out.println(count);
		br.close();
	}
	
}

/*

*비효율적인 코드
int sum = 0;
int count = 0;

for (int i = 1; i <= N; i++) {
	for (int j = i; j <= N; j++) {
		sum = S[j] - S[i - 1];
		if (sum % M == 0) {
			count++;
		}
	}
}

*/