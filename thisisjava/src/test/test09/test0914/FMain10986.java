package test.test09.test0914;

/*

[입력]
5 3
1 2 3 1 2

[출력]
7

*/

import java.io.*;
import java.util.*;

public class FMain10986 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()) ;
		int M = Integer.parseInt(st.nextToken()) ;
		
		int[] A = new int[N];
		long[] S = new long[N + 1];
		long[] R = new long[M];
		
		R[0]++;		
		int remainder = 0;
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			A[i - 1] = Integer.parseInt(st1.nextToken());
			S[i] = S[i - 1] + A[i - 1];
			remainder = (int)((S[i] % M + M) % M);
			R[remainder]++;
		}
		
		long count = 0;
		for (int i = 0; i < M; i++) {
			count += R[i] * (R[i] - 1) / 2;
		}
		
		System.out.println(count);
		br.close();
	}
}