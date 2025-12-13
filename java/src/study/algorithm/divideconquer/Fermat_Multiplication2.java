package study.algorithm.divideconquer;

/*

[입력]
10 11 12

[출력]
4

*/

import java.io.*;
import java.util.*;

public class Fermat_Multiplication2 {
    
    static int C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        System.out.println(pow(A, B));
        br.close();
    }

    static long pow(long base, long exponent) {
        if (exponent == 0) return 1;
        if (exponent == 1) return base % C;
   
        long temp = pow(base, exponent / 2);

        if (exponent % 2 == 0) {
            return (temp * temp) % C;
        } else {
            return (temp * temp % C) * base % C;
        }
    }

}

/*

1. 지수(B)가 짝수일 경우:
B = 2k(k는 정수)라고 하면,
A^B = A^2k = (A^k)^2 = (A^B/2)^2

2. 지수(B)가 홀수일 경우:
B = 2k + 1이라고 하면,
A^B = A^2k + 1 = A^2k × A = (A^k)^2 × A = (A^(B−1)/2)^2 × A

모듈러 연산의 역할
(a × b)(mod m) = ((a(mod m)) × (b(mod m)))(mod m)

*/