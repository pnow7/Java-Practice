package study.algorithm.binarysearch;

/* 

[입력]
3
7

[출력]
6

*/

import java.io.*;

public class Kth_Number {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        
        System.out.println(binarySearch(N, k));
        br.close();
    }
    
    static long binarySearch(int N, int k) {
        long lo = 1;
        long hi = (long) N * N;
        long answer = 0;
        
        while (lo <= hi) {
            long mid = (lo + hi) / 2;
            
            long count = 0;
            for (int i = 1; i <= N; i++) {
                count += Math.min(mid / i, N);
            }
            
            if (count >= k) {
                answer = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        
        return answer;
    }
    
}
