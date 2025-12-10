package study.algorithm.math;

/*
- 피보나치 수 6

피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 
그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.

n = 17일때 까지 피보나치 수를 써보면 다음과 같다.
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597

n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.

첫째 줄에 n번째 피보나치 수를 1,000,000,007으로 나눈 나머지를 출력한다.

[입력]
1000

[출력]
517691607

*/

import java.io.*;

public class Fibonacci {
    
    static long p = 1000000007;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long n = Long.parseLong(br.readLine());
        long[][] arr = new long[2][2];
        
        arr[0][0] = arr[0][1] = arr[1][0] = 1;
        arr[1][1] = 0;
        
        arr = pow(arr, n);
        
        System.out.println(arr[0][1]);
        br.close();
    }
    
    // 2 x 2 항등 행렬 생성
    static long[][] identityMatrix(long[][] A) {
        int n = A.length;
        
        long[][] I = new long[2][2];
        for (int i = 0; i < n; i++) {
            I[i][i] = 1;
        }
        
        return I;
    }
    
    // 두개의 2 x 2 행렬 A와 B를 곱함 (모듈러 연산)
    static long[][] multiply(long[][] A, long[][] B) {
        int n = A.length;
        
        long[][] result = new long[2][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                long sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += A[i][k] * B[k][j];
                }
                result[i][j] = sum % p;
            }
        }
        
        return result;
    }
    
    /*
     *  분할정복을 이용한 거듭제곱 (로그시간: (O(logn))
     *  2 x 2 행렬 base를 exponent 만틈 거듭제곱하고 결과 반환 (base^exponent)
     *  exponent = 0 -> base^0 이므로 항등 행렬 반환
     *  exponent = 1 -> base 행렬 자체 반환
     *  exponent = 짝수 => base^n = (base^(n/2) x base^(n/2)를 재귀적으로 계산
     *  exponent = 홀수 => base^n = (base^(n/2) x base^(n/2) x base를 재귀적으로 계산 
     */
    static long[][] pow(long[][] base, long exponent) {
        if (exponent == 0) return identityMatrix(new long[2][2]);
        if (exponent == 1) return base;
        
        long[][] temp = pow(base, exponent / 2);
        
        if (exponent % 2 == 0) {
            return multiply(temp, temp);
        } else {
            return multiply(multiply(temp, temp), base);
        }
    }
    
}
