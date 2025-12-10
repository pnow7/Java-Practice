package study.algorithm.prefixsum;

/*
- 구간 합 구하기

문제는 말그대로 주어진 구간에 해당하는 값들을 누적합 하는 문제이다.
첫번째 줄에는 수의 개수(N)와 합을 구해야하는 횟수(M)가 주어진다.
두번째 줄에는 수의 개수(N)만큼 숫자를 입력 받고, 
세번째 줄부터는 수가 아닌 구간을 입력받아 해당되는 구간의 수를 누적합하면 되는 문제이다.

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

public class SectionSum {

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