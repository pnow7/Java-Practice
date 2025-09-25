package study.algorithm.divide_conquer;

/*

페르마의 소정리
- a^p-1 ≡ 1 (mod P) -> 양변을 a로 나눈다
- a^p-2 ≡ a^-1 (mod P)
=> a^-1 ≡ a^p-2 (mod P)

P가 소수, a가 P의 배수가 아닐때 
K! < P, (N - K)! < P 이면

(K!)^-1 ≡ (K!)^p-2 (mod P)
((N - K)!)^-1 ≡ ((N - K)!)^p-2 (mod P)

[입력]
5 2

[출력]
10

*/

import java.io.*;
import java.util.*;

public class Fermat_Multiplication {
    
    static int P = 1000000007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        long fact_N = factorial(N, P);
        long inv_fact_K = power(factorial(K, P), P - 2, P);
        long inv_fact_NK = power(factorial(N - K, P), P - 2, P);
        
        long result = (fact_N * inv_fact_K % P) * inv_fact_NK % P;
        
        System.out.println(result);
        br.close();
    }

    static long factorial(int n, int p) {
        long result = 1;

        for (int i = 2; i <= n; i++) {
            result = (result * i) % p;
        }

        return result;
    }

    static long power(long base, long exponent, long p) {
        if (exponent == 0) return 1;
        if (exponent == 1) return base % p;

        long temp = power(base, exponent / 2, p);

        if (exponent % 2 == 0) {
            return (temp * temp) % p;
        } else {
            return (temp * temp % p) * base % p;
        }
    }         

}