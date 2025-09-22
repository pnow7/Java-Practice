package test.test07.test0730;

/*
2156 - 포도주 시식


N잔의 포도주가 주어졌을 때, 최대한 많은 양의 포도주를 마시는 것이 목표입니다. 

포도주 잔을 선택하면 해당 포도주 양을 얻습니다.

연속된 3잔의 포도주는 마실 수 없습니다. 즉, 1번 잔, 2번 잔, 3번 잔을 모두 마실 수는 없습니다.


*/

import java.io.*;

public class S_DP2156 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 포도주 잔의 개수
        int N = Integer.parseInt(br.readLine()); 
		
        // 각 포도주 잔의 양 (인덱스 1부터 사용)
        int[] wines = new int[N + 1];
        
        for (int i = 1; i <= N; i++) {
            wines[i] = Integer.parseInt(br.readLine());
        }

        // 0잔일 경우
        if (N == 0) { 
            System.out.println(0);
            return;
        }

        // dp[i]는 i번째 잔까지 고려했을 때 마실 수 있는 최대 포도주 양
        int[] dp = new int[N + 1]; 

        // 초기값 설정
        dp[0] = 0; 
        
        // 1잔일 때는 첫 번째 잔만 마심
        if (N >= 1) {
            dp[1] = wines[1]; 
        }
        
        // 2잔일 때는 두 잔 모두 마심
        if (N >= 2) {
            dp[2] = wines[1] + wines[2]; 
        }

        // 3번째 잔부터 N번째 잔까지 계산
        for (int i = 3; i <= N; i++) {
            // 1. 현재 잔(i)을 마시지 않는 경우: dp[i-1]
            // 2. 현재 잔(i)을 마시고, 바로 전 잔(i-1)은 마시지 않은 경우: dp[i-2] + wines[i]
            // 3. 현재 잔(i)을 마시고, 바로 전 잔(i-1)도 마신 경우 (i-2는 반드시 마시지 않음): dp[i-3] + wines[i-1] + wines[i]
            dp[i] = Math.max(dp[i-1], Math.max(dp[i-2] + wines[i], dp[i-3] + wines[i-1] + wines[i]));
        }

        System.out.println(dp[N]); 
        
        br.close();
	}

}

/*

1. i번째 잔을 마시지 않는 경우:
이 경우 i번째 잔은 마시지 않았으므로, 
i-1번째 잔까지의 최대 포도주 양인 dp[i-1]와 같습니다.

2. i번째 잔을 마시는 경우:
i번째 잔을 마셨다면, 연속 3잔 규칙에 따라 
i-1번째 잔을 마셨는지 여부에 따라 다시 두 가지 경우로 나눌 수 있습니다.

2-1. i-1번째 잔을 마시지 않은 경우:
i번째 잔을 마시고 i-1번째 잔을 마시지 않았다면, 
i-2번째 잔까지의 최대 포도주 양에 i번째 잔의 양을 더하면 됩니다. 즉, dp[i-2] + wines[i]입니다.

2-2. i-1번째 잔을 마신 경우:
i번째 잔을 마시고 i-1번째 잔도 마셨다면, 
i-2번째 잔은 반드시 마시지 않아야 합니다 (연속 3잔 규칙). 따라서 i-3번째 잔까지의 최대 포도주 양에 i-1번째 잔과 i번째 잔의 양을 더하면 됩니다. 즉, dp[i-3] + wines[i-1] + wines[i]입니다.

결론적으로, dp[i]는 위 세 가지 경우 중 가장 큰 값을 선택해야 합니다.
dp[i] = max(dp[i-1], dp[i-2] + wines[i], dp[i-3] + wines[i-1] + wines[i])



초기값 설정:
dp[0] = 0 (포도주가 없는 경우)

dp[1] = wines[1] (첫 번째 잔만 마시는 경우)

dp[2] = wines[1] + wines[2] 
(두 번째 잔까지 마시는 경우, 연속 3잔은 불가능하므로 첫 번째와 두 번째 잔은 항상 마실 수 있습니다.)

============================================================================
포도주 양이 다음과 같다고 가정해 봅시다: 
[0, 6, 10, 13, 9, 8] (인덱스 0은 편의상 0으로 둡니다.)

dp[0] = 0

dp[1] = wines[1] = 6

dp[2] = wines[1] + wines[2] = 6 + 10 = 16

dp[3] 계산:

dp[2] (3번 잔 안 마심) = 16

dp[1] + wines[3] (3번 잔 마시고 2번 잔 안 마심) = 6 + 13 = 19

dp[0] + wines[2] + wines[3] (3번 잔 마시고 2번 잔 마심) = 0 + 10 + 13 = 23
dp[3] = max(16, 19, 23) = 23

dp[4] 계산:

dp[3] (4번 잔 안 마심) = 23

dp[2] + wines[4] (4번 잔 마시고 3번 잔 안 마심) = 16 + 9 = 25

dp[1] + wines[3] + wines[4] (4번 잔 마시고 3번 잔 마심) = 6 + 13 + 9 = 28
dp[4] = max(23, 25, 28) = 28

*/
