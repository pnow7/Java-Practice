package study.algorithm.binarysearch;

/*

[입력]
4 11
802
743
457
539

[출력]
200

*/

import java.io.*;
import java.util.*;

public class Cutting_LAN {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[K];
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.print(lowerBound(arr, N));
        br.close();
    }

    static long lowerBound(int[] arr, int N) {
        long low = 1;
        long high = Math.max(arr[arr.length - 1], 1);
        long maxLen = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            long count = 0;
            for (int len : arr) {
                count += len / mid;
            }

            if (count >= N) {
                maxLen = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return maxLen;
    }

}
