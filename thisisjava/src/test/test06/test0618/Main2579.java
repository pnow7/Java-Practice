package test.test06.test0618;

/*
- 계단 오르기
계단 오르기 게임은 계단 아래 시작점부터 계단 꼭대기에 위치한 도착점까지 가는 게임
각각의 계단에는 일정한 점수가 쓰여 있는데 계단을 밟으면 그 계단에 쓰여 있는 점수를 얻게 된다.

1. 계단은 한 번에 한 계단씩 또는 두 계단씩 오를 수 있다. 
즉, 한 계단을 밟으면서 이어서 다음 계단이나, 다음 다음 계단으로 오를 수 있다.

2. 연속된 세 개의 계단을 모두 밟아서는 안 된다. 단, 시작점은 계단에 포함되지 않는다.

3. 마지막 도착 계단은 반드시 밟아야 한다.

따라서 첫 번째 계단을 밟고 이어 두 번째 계단이나, 세 번째 계단으로 오를 수 있다. 

하지만, 첫 번째 계단을 밟고 이어 네 번째 계단으로 올라가거나, 첫 번째, 두 번째, 세 번째 계단을 연속해서 모두 밟을 수는 없다.

각 계단에 쓰여 있는 점수가 주어질 때 이 게임에서 얻을 수 있는 총 점수의 최댓값을 구하는 프로그램을 작성하시오.

[입력]
6
10
20
15
25
10
20

[출력]
75

📌 문제 요약
한 번에 1계단 또는 2계단을 오를 수 있다.

세 계단을 연속해서 밟을 수 없다.

마지막 계단은 반드시 밟아야 한다.

각 계단에는 점수가 있다.

최대 점수를 구하라.

*/

import java.io.*;

public class Main2579 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		int[] dp = new int[T + 1];
		int[] arr = new int[T + 1];
		
		for(int i = 1; i <= T; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		dp[1] = arr[1];
		
		if(T >= 2) {
			dp[2] = arr[1] + arr[2];
		}
		
		for(int i = 3; i <= T; i++) {
			dp[i] = Math.max(dp[i-2] + arr[i], dp[i-3] + arr[i-1] + arr[i]);
		}
		
		System.out.println(dp[T]);
		
		br.close();
	}
	
}
