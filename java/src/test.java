/*

[입력]
1000

[출력]
517691607

*/

import java.io.*;

public class test {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long[][] arr = new long[2][2];
        arr[0][0] = arr[0][1] = arr[1][0] = 1;
        arr[1][1] = 0;

        arr = pow(arr, N);

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

        long[][] result = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                long sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += A[i][k] * B[k][j];
                }
                result[i][j] = sum % 1000000007;
            }
        }

        return result;
    }

    static long[][] pow(long[][] base, long exponent) {
        if (exponent == 0) return identityMatrix(base);
        if (exponent == 1) return base;

        long[][] temp = pow(base, exponent / 2);

        if (exponent % 2 == 0) {
            return multiply(temp, temp);
        } else {
            return multiply(multiply(temp, temp), base);
        }
    }

}