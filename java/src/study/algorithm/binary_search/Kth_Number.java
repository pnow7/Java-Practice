package study.algorithm.binary_search;

/* 
- K번째 수

크기가 N x N인 배열 A를 만들었다. 
배열에 들어있는 수 A[i][j] = i x j이다.
이 수를 일차원 배열 B에 넣으면 B의 크기는 N x N이 된다.

B를 오름차순 정렬했을 때, B[k]를 구해봐

첫째 줄에 배열의 크기 N이 주어짐.
둘째 줄에 k가 주어짐.

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
    
    // 값 찾기
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
