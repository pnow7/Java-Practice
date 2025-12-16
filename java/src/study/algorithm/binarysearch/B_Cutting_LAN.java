package study.algorithm.binarysearch;

/*
- 랜선 자르기

박성원이 캠프 때 쓸 N개의 랜선을 만들어야 하는데 
너무 바빠서 영식이에게 도움을 청했다.

이미 오영식은 자체적으로 K개의 랜선을 가지고 있다. 
그러나 K개의 랜선은 길이가 제각각이다. 

박성원은 랜선을 모두 N개의 같은 길이의 랜선으로 만들고 싶었기 때문에 
K개의 랜선을 잘라서 만들어야 한다. 

예를 들어 300cm 짜리 랜선에서 140cm 짜리 랜선을 두 개 잘라내면 
20cm는 버려야 한다. (이미 자른 랜선은 붙일 수 없다.)

편의를 위해 랜선을 자르거나 만들 때 손실되는 길이는 없다고 가정하며, 
기존의 K개의 랜선으로 N개의 랜선을 만들 수 없는 경우는 없다고 가정하자. 
그리고 자를 때는 항상 센티미터 단위로 정수길이만큼 자른다고 가정하자. 
N개보다 많이 만드는 것도 N개를 만드는 것에 포함된다. 
이때 만들 수 있는 최대 랜선의 길이를 구하는 프로그램을 작성하시오.

첫째 줄에는 오영식이 이미 가지고 있는 랜선의 개수 K, 
필요한 랜선의 개수 N이 입력된다.

그 후 K줄에 걸쳐 이미 가지고 있는 
각 랜선의 길이가 센티미터 단위의 정수로 입력된다

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

    // 값 찾기
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
