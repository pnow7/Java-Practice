package test.test08.test0821;

/*

n: 물건의 개수
k: 최대 무게

w: 무게
v: 가치 

물건 무게에 맞춰 가방에 들어갈 수 있는 물건의 최대 가치 구하기

*/

import java.io.*;
import java.util.*;

public class FMain12865 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] w = new int[n + 1];
		int[] v = new int[n + 1];
		
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			w[i] = Integer.parseInt(st.nextToken());
			v[i] = Integer.parseInt(st.nextToken());
		}
		
		int[][] dp = new int[n + 1][k + 1];
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= k; j++) {
				if(w[i] > j) {
					dp[i][j] = dp[i - 1][j];
				}
				else {
					dp[i][j] = Math.max(dp[i - 1][j], (dp[i - 1][j - w[i]]) + v[i]);
				}
			}
		}
		
		System.out.println(dp[n][k]);
	}
}

/*

w[i] = {6, 4, 3, 5} // 무게
v[i] = {13, 8, 6, 12} // 가치

=> Case 1: 현재 물건(i)을 배낭에 담을 수 없을 때

if(w[i] > j) {
	dp[i][j] = dp[i - 1][j];
}

현재 물건의 무게가 현재 배낭의 최대 무게(j)보다 크다면 이 물건은 담을 수 없음
이전 물건(i-1)까지 고려한 최대 가치와 똑같음.

dp[i][j] = dp[i-1][j]


=> Case 2: 현재 물건(i)을 배낭에 담을 수 있을 때

else {
	dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i]);
}

현재 물건의 무게가 현재 배낭의 최대 무게(j)보다 작거나 같을 때 두 가지 선택지가 생김.

1. 현재 물건을 담지 않는 경우: 이전 물건(i-1)까지 고려한 최대 가치와 똑같음.
dp[i-1][j]

현재 물건을 담는 경우: 현재 물건의 가치(V)를 더하고, 남은 무게(j - 현재 물건의 무게)에 대한 최대 가치를 더해야함.
dp[i-1][j - 현재 물건의 무게] + 현재 물건의 가치

이 두 가지 경우 중 더 큰 값을 선택하면 됨.
dp[i][j] = max(dp[i-1][j], dp[i-1][j - 현재 물건의 무게] + 현재 물건의 가치)

모든 물건과 무게에 대해 DP 배열을 채우고 나면 
최종적으로 dp[N][K]에 최대 가치값이 저장.

*/
