package study.algorithm.section_sum;

/*

[입력]
5 3
5 4 3 2 1
1 3
2 4
5 5

[출력]
12
9
1

*/

import java.io.*;
import java.util.*;

public class Main11659 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] prefixsum = new int[N + 1];
		st = new StringTokenizer(br.readLine());
		
		for (int i = 1; i <= N; i++) {
			int num = Integer.parseInt(st.nextToken());
			prefixsum[i] = prefixsum[i - 1] + num;
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			
			int sum = prefixsum[second] - prefixsum[first - 1];
			sb.append(sum).append("\n");
		}
		
		br.close();
		System.out.print(sb);
		
	}

}