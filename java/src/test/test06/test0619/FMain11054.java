package test.test06.test0619;

/*
- 가장 긴 바이토닉 부분 수열

수열 S가 어떤 수 Sk를 기준으로 

S1 < S2 < ... Sk-1 < Sk > Sk+1 > ... SN-1 > SN을 만족한다면, 
그 수열을 바이토닉 수열이라고 한다.

예를 들어, {10, 20, 30, 25, 20}과 {10, 20, 30, 40}, {50, 40, 25, 10} 은 바이토닉 수열이지만, 

{1, 2, 3, 2, 1, 2, 3, 2, 1}과 {10, 20, 30, 40, 20, 30} 은 바이토닉 수열이 아니다.

수열 A가 주어졌을 때, 그 수열의 부분 수열 중 바이토닉 수열이면서 가장 긴 수열의 길이를 구하는 프로그램을 작성하시오.

[입력]
10
1 5 2 1 4 3 4 5 2 1

[출력]
7

예제의 경우 {1 5 2 1 4 3 4 5 2 1}이 가장 긴 바이토닉 부분 수열이다.

*/

import java.io.*;
import java.util.*;

public class FMain11054 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];
        int[] dp1 = new int[N]; // 증가
        int[] dp2 = new int[N]; // 감소

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            dp1[i] = dp2[i] = 1;
        }

        // 증가 부분 수열
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (A[j] < A[i]) {
                    dp1[i] = Math.max(dp1[i], dp1[j] + 1);
                }
            }
        }

        // 감소 부분 수열 (뒤에서부터)
        for (int i = N - 1; i >= 0; i--) {
            for (int j = N - 1; j > i; j--) {
                if (A[j] < A[i]) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + 1);
                }
            }
        }

        // 바이토닉 수열 최대 길이 계산
        int max = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, dp1[i] + dp2[i] - 1);
        }

        System.out.println(max);
    }

}

/*

1 5 2 1 4 3 4 5 2 1
dp1 (증가 부분 수열): 각 위치까지의 최장 증가 수열 길이

dp2 (감소 부분 수열): 각 위치부터 뒤로의 최장 감소 수열 길이

둘을 더하고 -1 하면 바이토닉 수열의 길이

최대값은 7 → [1 2 4 5 2 1] 같은 형태 가능

*/