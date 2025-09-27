package study.algorithm.divide_conquer;

/*

[입력]
1000

[출력]
517691607

*/

import java.io.*;

public class Fibonacci_divide_conquer {
    
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
    
    static long[][] identityMatrix(long[][] A) {
        int n = A.length;
        
        long[][] I = new long[2][2];
        for (int i = 0; i < n; i++) {
            I[i][i] = 1;
        }
        
        return I;
    }
    
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

/*

1️⃣ 피보나치 수의 기본 정의
F(0) = 0, F(1) = 1
F(n) = F(n-1) + F(n-2) (n >= 2)

2️⃣ 점화식을 행렬로 표현하기
피보나치 점화식은 선형이니까 행렬 곱셈으로 옮길 수 있음
[ F(n)   ]   [ 1 1 ]   [ F(n-1) ]
[ F(n-1) ] = [ 1 0 ] * [ F(n-2) ]

    [ 1 1 ]
A = [ 1 0 ]

👉 A는 피보나치 전이 행렬

3️⃣ 반복 적용
[ F(n-1) ]           [ F(1) ]
[ F(n-2) ] = A^(n) * [ F(0) ]

        [ 1 ]   [ F(n-1) ]
A^(n) * [ 0 ] = [ F(n-2) ]

4️⃣ 요약
전이 행렬 
    [ 1 1 ]
𝐴 = [ 1 0 ] 을 거듭제곱하면 바로 F(n) 구할 수 있음
	
*/