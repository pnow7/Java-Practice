package test.test11.test1101;

/*

- 최소 힙
: 배열에 자연수 x를 넣음
: 배열에서 가장 작은 값을 출력, 그 값을 배열에서 제거

[입력]
9
0
12345678
1
2
0
0
0
0
32


[출력]
0
1
2
12345678
0

*/

import java.io.*;
import java.util.*;

public class Main1927 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                if (minHeap.isEmpty()) {
                    sb.append("0").append("\n");
                } else {
                    sb.append(minHeap.poll()).append("\n");
                }
            } else {
                minHeap.add(num);
            }
        }

        System.out.println(sb.toString());
        br.close();
    }

}