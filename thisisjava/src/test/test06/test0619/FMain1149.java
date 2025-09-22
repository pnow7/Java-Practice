package test.test06.test0619;

/*
- RGB거리
RGB거리에는 집이 N개 있다. 거리는 선분으로 나타낼 수 있고, 1번 집부터 N번 집이 순서대로 있다.

집은 빨강, 초록, 파랑 중 하나의 색으로 칠해야 한다. 각각의 집을 빨강, 초록, 파랑으로 칠하는 비용이 주어졌을 때, 
아래 규칙을 만족하면서 모든 집을 칠하는 비용의 최솟값을 구해보자.

1번 집의 색은 2번 집의 색과 같지 않아야 한다.
N번 집의 색은 N-1번 집의 색과 같지 않아야 한다.
i(2 ≤ i ≤ N-1)번 집의 색은 i-1번, i+1번 집의 색과 같지 않아야 한다.

첫째 줄에 집의 수 N(2 ≤ N ≤ 1,000)이 주어진다. 
둘째 줄부터 N개의 줄에는 각 집을 빨강, 초록, 파랑으로 칠하는 비용이 1번 집부터 한 줄에 하나씩 주어진다. 
집을 칠하는 비용은 1,000보다 작거나 같은 자연수이다.

[입력]
3
26 40 83
49 60 57
13 89 99

[출력]
96

[입력]
3
1 100 100
100 1 100
100 100 1

[출력]
3


[입력]
6
30 19 5
64 77 64
15 19 97
4 71 57
90 86 84
93 32 91

[출력]
208

*/

import java.io.*;
import java.util.*;

public class FMain1149 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] cost = new int[N][3];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			cost[i][0] = Integer.parseInt(st.nextToken());
			cost[i][1] = Integer.parseInt(st.nextToken());
			cost[i][2] = Integer.parseInt(st.nextToken());
		}
		
		int[][] dp = new int[N][3];
		dp[0][0] = cost[0][0];
		dp[0][1] = cost[0][1];
		dp[0][2] = cost[0][2];
		
		for(int i = 1; i < N; i++) {
			dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + cost[i][0];
			dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + cost[i][1];
			dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + cost[i][2];
		}
		
		int result = Math.min(dp[N-1][0], Math.min(dp[N-1][1], dp[N-1][2]));
		
		System.out.println(result);
		
		br.close();
	}
	
}

/*
각 집을 빨강(R), 초록(G), 파랑(B) 중 하나로 칠할 수 있음

조건: 서로 인접한 집은 같은 색으로 칠할 수 없음

각 집을 각각의 색으로 칠하는 비용이 주어짐

모든 집을 칠하는 최소 비용을 구하는 문제

cost[i][0]: R
cost[i][1]: G
cost[i][2]: B

cost[0] = [26, 40, 83]
cost[1] = [49, 60, 57]
cost[2] = [13, 89, 99]

초기
dp[0] = [26, 40, 83]

1번째 집
dp[1][0] = min(40, 83) + 49 = 89
dp[1][1] = min(26, 83) + 60 = 86
dp[1][2] = min(26, 40) + 57 = 83

2번째 집
dp[2][0] = min(86, 83) + 13 = 96
dp[2][1] = min(89, 83) + 89 = 172
dp[2][2] = min(89, 86) + 99 = 185

최소값: min(96, 172, 185) = **96**

*/