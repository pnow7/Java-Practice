package test.test07.test0706;

/*

- 쉬운 계단 수

45656이란 수를 보자.

이 수는 인접한 모든 자리의 차이가 1이다. 
이런 수를 계단 수라고 한다.

N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구해보자. 
0으로 시작하는 수는 계단수가 아니다.

첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 100보다 작거나 같은 자연수이다.

첫째 줄에 정답을 1,000,000,000으로 나눈 나머지를 출력한다.

[입력]
1

[출력]
9

[입력]
2

[출력]
17

*/

import java.io.*;

public class FMain10844 {

	static final int MOD = 1_000_000_000;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[][] dp = new long[N + 1][10];

        for (int j = 1; j <= 9; j++) {
            dp[1][j] = 1;
        }

        for (int i = 2; i <= N; i++) {
            for (int j = 0; j <= 9; j++) {
                if (j > 0) dp[i][j] += dp[i - 1][j - 1];
                if (j < 9) dp[i][j] += dp[i - 1][j + 1];
                dp[i][j] %= MOD;
            }
        }

        long answer = 0;
        for (int j = 0; j <= 9; j++) {
            answer = (answer + dp[N][j]) % MOD;
        }

        System.out.println(answer);
    }
}

/*

- 1_000_000_000 과 1_000000000 은 같은 값?

int a = 1000000000;     // 일반 숫자
int b = 1_000_000_000;  // 같은 숫자, 더 보기 쉬움
System.out.println(a == b); // true

[원리]

dp[i][j]는: i자리 수 중 마지막 숫자가 j인 계단 수의 개수
dp[1][0]은 0으로 시작하는 수는 허용 안 되므로 초기값 없음.
dp[1][1] = 1 → 1자리 계단 수 중 끝이 1인 건 1 하나 뿐.
dp[1][2] = 1 → 1자리 계단 수 중 끝이 2인 건 2 하나 뿐.

// 초기값: 1자리 수는 1~9까지 1개씩
for (int j = 1; j <= 9; j++) {
    dp[1][j] = 1;
}

dp[i][j] = dp[i-1][j-1] + dp[i-1][j+1]
i자리 수가 j로 끝난다는 건, 그 앞 자리(i-1)가 j-1 또는 j+1이어야 함.

예: 23 → 끝이 3이고 그 앞은 2 (→ j=3, 앞은 j-1=2)

예: 43 → 끝이 3이고 그 앞은 4 (→ j=3, 앞은 j+1=4)

* 예외처리
j = 0일 때는 j-1이 없음 → if (j > 0) 체크

j = 9일 때는 j+1이 없음 → if (j < 9) 체크

// DP 점화식 적용
for (int i = 2; i <= N; i++) {
    for (int j = 0; j <= 9; j++) {
        if (j > 0) dp[i][j] += dp[i - 1][j - 1];
        if (j < 9) dp[i][j] += dp[i - 1][j + 1];
        dp[i][j] %= MOD;
    }
}

// N자리 수에서 끝나는 모든 계단 수의 합
long answer = 0;
for (int j = 0; j <= 9; j++) {
    answer = (answer + dp[N][j]) % MOD;
}


|  자리 수(i)	| 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
|  ------- 	| - | - | - | - | - | - | - | - | - | - |
|  **1자리** 	| 0 | 1 | 1 | 1 | 1 | 1 | 1 | 1 | 1 | 1 |
|  **2자리** 	| 1 | 1 | 2 | 2 | 2 | 2 | 2 | 2 | 2 | 1 |
|  **3자리** 	| 1 | 3 | 3 | 4 | 4 | 4 | 4 | 4 | 3 | 2 |

DP는 이전 자리(i-1)의 좌/우 숫자를 보고 누적해 나가는 구조
dp[3][3] = dp[2][2] + dp[2][4] = 2 + 2 = 4 이렇게 계산됨.

  
*/