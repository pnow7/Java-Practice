package study.algorithm.prefixsum.one_dim;

/*

[입력]
5 3
1 2 3 1 2

[출력]
7

*/

import java.io.*;
import java.util.*;

public class Sum_of_Remainder {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()) ;
		int M = Integer.parseInt(st.nextToken()) ;
		
		int[] A = new int[N];
		long[] S = new long[N + 1];
		long[] R = new long[M];
		
		R[0]++;														// M으로 나눈 나머지가 0인것도 포함시켜야함
		int remainder = 0;
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			A[i - 1] = Integer.parseInt(st1.nextToken());
			S[i] = S[i - 1] + A[i - 1];
			remainder = (int)((S[i] % M + M) % M);					// 나머지 음수 방지
			R[remainder]++;
		}
		
		long count = 0;
		for (int i = 0; i < M; i++) {
			count += R[i] * (R[i] - 1) / 2;							// 조합공식: r! / (n! * (r-n)!)
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