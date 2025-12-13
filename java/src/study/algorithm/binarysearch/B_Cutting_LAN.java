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

public class B_Cutting_LAN {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[K];
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.print(binarySearch(arr, N));
        br.close();
    }

    static long binarySearch(int[] arr, int N) {
        long lo = 1;
        long hi = arr[arr.length - 1];
        long maxLen = 0;

        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;

            long count = 0;
            for (int len : arr) {
                count += len / mid;
            }

            if (count >= N) {
                maxLen = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return maxLen;
    }

}
