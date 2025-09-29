package study.algorithm.divide_conquer;

/* 0928

[입력]
7 2 1 4 5 1 3 3
4 1000 1000 1000 1000
0

[출력]
8
4000

*/

import java.io.*;
import java.util.*;

public class Histogram {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            if (n == 0) break;

            int[] heights = new int[n];
            for (int i = 0; i < n; i++) {
                heights[i] = Integer.parseInt(st.nextToken());
            }

            sb.append(findMaxArea(heights, 0, n - 1)).append("\n");
        }

        System.out.print(sb);
        br.close();
    }

    static long findMaxArea(int[] heights, int start, int end) {
        if (start == end) {                                                                         // 재귀의 기저 조건: 막대가  한 개일 때
            return (long) heights[start];
        }

        int mid = (start + end) / 2;                                                                // 절반으로 나누기
        int left = mid;
        int right = mid + 1;
                                                                                                    // 초기 넓이 설정 (두 막대로 이루어진 직사각형)
        long leftArea = findMaxArea(heights, start, mid);                                           // 왼쪽과 오른쪽 부분 문제 해결하기
        long rightArea = findMaxArea(heights, mid + 1, end);
        long h = Math.min(heights[left], heights[right]);                                           // 두 막대의 높이가 다를 수 있으므로 둘 중 더 낮은 높이를 기준으로 해야 두 막대를 모두 포함하는 직사각형 만들 수 있음
        
        long centerArea = 0;                                      
        centerArea = Math.max(leftArea, rightArea);                                                 
        centerArea = Math.max(centerArea, h * 2);                                                   // 그래서 곱하기 2를 하는 이유는 너비가 2이기 때문(작은사각형 높이 * 2)                                         

        while (start < left || right < end) {                                                       // 높이가 작은 사각형 찾기 (양쪽으로 확장하며 넓이 계산(left가 start까지, right가 end까지 갈때까지 반복)
            if (right == end || (start < left && heights[left - 1] >= heights[right + 1])) {        // 1. 왼쪽으로 더 확장할 수 있을때 // 왼쪽 막대가 오른쪽 막대보다 높이가 같거나 더 높은지를 확인함
                left--;                                                                             // 2. 오른쪽으로 더 확장할 수 있을때
                h = Math.min(h, heights[left]);                                                     // 3. 이 두조건이 만족하면 왼쪽으로 확장 
            }
            else {                                                                                  // 1. 오른쪽으로 더 확장할 수 있을 때
                right++;                                                                            // 2. 왼쪽으로 더 확장할 수 없을 때
                h = Math.min(h, heights[right]);                                                    // 3. 또는 오른쪽 막대가 더 높을 때
            }                                                                                       // 이 세 조건이 만족하면 오른쪽으로 확장

            centerArea = Math.max(centerArea, h * (right - left + 1));                              // 최대 넓이 갱신 -> h: 모든 막대들 중 가장 낮은 막대높이, left: 현재 직사각형의 왼쪽 끝 막대 인덱스, right: 오른쪽 끝 막대 인덱스
        }                                                                                           // 너비 계산은 예를 들면 left가 3이고 right가 5라면 5 - 3 + 1해야 너비가 3인걸 알 수 있음

        return Math.max(centerArea, Math.max(leftArea, rightArea));                                 // 세 영역(왼쪽, 오른쪽, 가운데)의 넓이 중 최댓값 반환
    }

}