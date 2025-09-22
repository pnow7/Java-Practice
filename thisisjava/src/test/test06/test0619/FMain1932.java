package test.test06.test0619;

/*
- 정수 삼각형

		7
      3   8
    8   1   0
  2   7   4   4
4   5   2   6   5

크기가 5인 정수 삼각형의 한 모습이다.

맨 위층 7부터 시작해서 아래에 있는 수 중 하나를 선택하여 아래층으로 내려올 때, 
이제까지 선택된 수의 합이 최대가 되는 경로를 구하는 프로그램을 작성하라. 
아래층에 있는 수는 현재 층에서 선택된 수의 대각선 왼쪽 또는 대각선 오른쪽에 있는 것 중에서만 선택할 수 있다.
삼각형의 크기는 1 이상 500 이하이다. 삼각형을 이루고 있는 각 수는 모두 정수이며, 범위는 0 이상 9999 이하이다.

첫째 줄에 합이 최대가 되는 경로에 있는 수의 합을 출력한다.

[입력]
5
7
3 8
8 1 0
2 7 4 4
4 5 2 6 5

[출력]
30

*/

import java.io.*;
import java.util.*;

public class FMain1932 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
				
		int[][] triangle = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j <= i; j++) {
				triangle[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] dp = new int[N][N];
		dp[0][0] = triangle[0][0];
		
        for (int i = 1; i < N; i++) {
        	
            dp[i][0] = dp[i-1][0] + triangle[i][0];
            
            for (int j = 1; j < i; j++) {
            	
                dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + triangle[i][j];
                
            }
            
            dp[i][i] = dp[i-1][i-1] + triangle[i][i];
        }
		
		int max = 0;
		
		for(int i = 0 ; i < N; i++) {
			max = Math.max(max, dp[N-1][i]);
		}
		
		System.out.println(max);
		
		br.close();
		
	}
	
}

/*

예시

	    7
	   3 8
	  8 1 0
	 2 7 4 4
	4 5 2 6 5


dp[0][0] = 7

다음 줄
dp[1][0] = 7 + 3 = 10
dp[1][1] = 7 + 8 = 15

다음 줄
dp[2][0] = 10 + 8 = 18
dp[2][1] = max(10, 15) + 1 = 16
dp[2][2] = 15 + 0 = 15

...계속...

마지막 줄
dp[4] = [30, 35, 30, 33, 30]
최대값 = 35

*/