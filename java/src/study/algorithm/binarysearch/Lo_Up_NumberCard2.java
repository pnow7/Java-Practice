package study.algorithm.binarysearch;

/*

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