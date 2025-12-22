package study.algorithm.divide_conquer;

/*
- 히스토그램에서 가장 큰 직사각형

히스토그램은 직사각형 여러 개가 아래쪽으로 정렬되어 있는 도형이다. 
각 직사각형은 같은 너비를 가지고 있지만, 높이는 서로 다를 수도 있다. 

직사각형의 수 n이 가장 처음으로 주어진다. (1 ≤ n ≤ 100,000) 
그 다음 n개의 정수 h1, ..., hn (0 ≤ hi ≤ 1,000,000,000)가 주어진다. 
이 숫자들은 히스토그램에 있는 직사각형의 높이이며, 왼쪽부터 오른쪽까지 순서대로 주어진다. 
모든 직사각형의 너비는 1이고, 입력의 마지막 줄에는 0이 하나 주어진다.

각 테스트 케이스에 대해서, 히스토그램에서 가장 넓이가 큰 직사각형의 넓이를 출력한다.

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
            
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            sb.append(findMaxArea(arr, 0, n - 1)).append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
    
    static long findMaxArea(int[] heights, int start, int end) {
        if (start == end) return (long) heights[start];
        
        int mid = (start + end) / 2;
        int left = mid;
        int right = mid + 1;
        
        long leftArea = findMaxArea(heights, start, left);
        long rightArea = findMaxArea(heights, right, end);
        long h = Math.min(heights[left], heights[right]);
        long centerArea = 0;
        
        centerArea = Math.max(leftArea, rightArea);
        centerArea = Math.max(centerArea, h * 2);
        
        while (start < left || right < end) {
            if (right == end || (start < left && heights[left - 1] >= heights[right + 1])) {
                left--;
                h = Math.min(h, heights[left]);
            } else {
                right++;
                h = Math.min(h, heights[right]);
            }
            
            centerArea = Math.max(centerArea, h * (right - left + 1));
        }
        
        return Math.max(centerArea, Math.max(leftArea, rightArea));
    }
    
}
