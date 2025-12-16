package study.algorithm.binarysearch;

/*
- 숫자 카드 2

상근이는 숫자 카드 N개를 가지고 있다.
정수 M개가 주어졌을 때, 
이 수가 적혀있는 숫자 카드를 상근이가 몇 개 가지고 있는지 구하라 

[입력]
10
6 3 2 10 10 10 -10 -10 7 3
8
10 9 -5 2 3 4 5 -10

[출력]
3 0 0 1 2 0 0 2

*/

import java.io.*;
import java.util.*;

public class Lo_Up_NumberCard2 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(upperBound(arr, num)  - lowerBound(arr, num)).append(" ");
        }

        System.out.print(sb.toString());
        br.close();
        
    }

    // 인덱스 찾기 (최소)
    static int lowerBound(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length;

        while (lo < hi) {
            int mid = (hi + lo) / 2;
            int midValue = arr[mid];

            if (midValue >= target) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }

        return lo;
    }

    // 인덱스 찾기 (최대)
    static int upperBound(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length;

        while (lo < hi) {
        	int mid = (hi + lo) / 2;
            int midValue = arr[mid];

            if (midValue > target) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }

        return lo;
    }

}