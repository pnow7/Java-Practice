package study.algorithm.prefixsum.one_dim;

/*
- 수열

매일 측정한 온도가 정수의 수열로 주어졌을 때, 
연속적인 며칠 동안의 온도의 합이 가장 큰 값을 계산하는 프로그램을 작성하시오.

[입력]
10 2
3 -2 -4 -9 0 3 7 13 8 -3

10 5
3 -2 -4 -9 0 3 7 13 8 -3

[출력]
21

31

*/

import java.io.*;
import java.util.*;

public class Sequence {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> list = new ArrayList<>();
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int prefixsum[] = new int[N + 1];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			int num = Integer.parseInt(st.nextToken());
			prefixsum[i] = prefixsum[i - 1] + num;
		}
		
		int section = N - K;
		for (int i = 0; i <= section; i++) {
			int sum =  prefixsum[i + K] - prefixsum[i];
			list.add(sum);
		}
		int result = Collections.max(list);
		
		System.out.println(result);
		br.close();

	}

}
