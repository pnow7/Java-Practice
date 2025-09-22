package study.algorithm.section_sum;

/*

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

public class Main2559 {

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
		
		// check는 개수
		int check = N - K;
		for (int i = 0; i <= check; i++) {
			// K번째 까지의 합
			int sum =  prefixsum[i + K] - prefixsum[i];
			list.add(sum);
		}
		int result = Collections.max(list);
		
		System.out.println(result);
		br.close();

	}

}
