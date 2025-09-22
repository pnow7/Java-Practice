package study.algorithm.dp;

import java.io.*;
import java.util.*;

public class LISLDS {

    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 증가, 감소 부분 수열
        int[] up = lis(A);
        int[] down = lds(A);

        // 바이토닉 수열 최대 길이
        int max = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, up[i] + down[i] - 1);
        }

        System.out.println(max);
    }
    
    public static int[] lis(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return dp;
    }

    public static int[] lds(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j > i; j--) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return dp;
    }
    
}

/*

** Arrays.fill() 함수 **
예)

int[] arr = new int[5];
Arrays.fill(arr, 1);  // 모든 원소를 1로 채움

2차원 배열에서도 사용 가능
예)

int[][] dp = new int[3][3];
for (int i = 0; i < dp.length; i++) {
    Arrays.fill(dp[i], -1);  // 각 행을 -1로 초기화
}

** LIS(Longest Increasing Subsequence, 최장 증가 부분 수열) **
: 오름차순으로 증가하는 가장 긴 부분 수열의 길이

A = [10, 20, 10, 30, 20, 50]
LIS = [10, 20, 30, 50]
길이: 4

예)

int[] dp = new int[N];
Arrays.fill(dp, 1); // 최소 자기 자신만 있는 수열 길이는 1

for (int i = 0; i < N; i++) {
    for (int j = 0; j < i; j++) {
        if (A[j] < A[i]) {
            dp[i] = Math.max(dp[i], dp[j] + 1);
        }
    }
}

** LDS(Longest Decreasing Subsequence, 최장 감소 부분 수열) **
: 내림차순으로 감소하는 가장 긴 부분 수열의 길이

예)

int[] dp = new int[N];
Arrays.fill(dp, 1);

for (int i = N - 1; i >= 0; i--) {
    for (int j = N - 1; j > i; j--) {
        if (A[j] < A[i]) {
            dp[i] = Math.max(dp[i], dp[j] + 1);
        }
    }
}

Arrays.fill(arr, x) → 배열을 x로 초기화

LIS: 오름차순 최장 부분 수열 (DP O(N²))

LDS: 내림차순 최장 부분 수열 (DP O(N²), 반대로 탐색)




*/
