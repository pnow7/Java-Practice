package study.algorithm.prefixsum;

/*
- 수열

매일 아침 9시에 학교에서 측정한 온도가 어떤 정수의 수열로 주어졌을 때, 연속적인 며칠 동안의 온도의 합이 가장 큰 값을 알아보고자 한다.
매일 측정한 온도가 정수의 수열로 주어졌을 때, 연속적인 며칠 동안의 온도의 합이 가장 큰 값을 계산하는 프로그램을 작성하시오.

첫째 줄에는 두 개의 정수 N과 K가 한 개의 공백을 사이에 두고 순서대로 주어진다. 
첫 번째 정수 N은 온도를 측정한 전체 날짜의 수이다. N은 2 이상 100,000 이하이다. 
두 번째 정수 K는 합을 구하기 위한 연속적인 날짜의 수이다. K는 1과 N 사이의 정수이다. 

둘째 줄에는 매일 측정한 온도를 나타내는 N개의 정수가 빈칸을 사이에 두고 주어진다. 
이 수들은 모두 -100 이상 100 이하이다.

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
