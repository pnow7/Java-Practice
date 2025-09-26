package test.test09.test0926;

/*

[입력]
3 3
1 2 3
4 5 6
7 8 9

5 10
1 0 0 0 1
1 0 0 0 1
1 0 0 0 1
1 0 0 0 1
1 0 0 0 1

[출력]
468 576 684
62 305 548
656 34 412

512 0 0 0 512
512 0 0 0 512
512 0 0 0 512
512 0 0 0 512
512 0 0 0 512

*/


import java.io.*;
import java.util.*;

public class Main10830 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken()) % 1000;
            }
        }
        
        arr = pow(arr, B);
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        br.close();
    }
    
    static int[][] identifyMatrix(int[][] A) {
        int n = A.length;
        
        int[][] I = new int[n][n];
        for (int i = 0; i < n; i++) {
            I[i][i] = 1;
        }
        
        return I;
    }
    
    static int[][] multiply(int[][] A, int[][] B) {
        int n = A.length;
        
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                long sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += (long) (A[i][k] * B[k][j]);
                }
                result[i][j] = (int) (sum % 1000);
            }
        }
        
        return result;
    }
    
    static int[][] pow(int[][] A, long exponent) {
        if (exponent == 0) return identifyMatrix(A);
        if (exponent == 1) return A;
        
        int[][] temp = pow(A, exponent / 2);
        
        if (exponent % 2 == 0) {
            return multiply(temp, temp);
        } else {
            return multiply(multiply(temp, temp), A);
        }
    }
    
}