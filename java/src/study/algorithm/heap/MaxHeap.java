package study.algorithm.heap;

/*
- 최대 힙

1. 배열에 자연수 x를 넣음
2. 배열에서 가장 큰 값을 출력하고, 그 값을 배열에서 제거

* 프로그램은 처음에 비어있는 배열에서 시작

[입력]
13
0
1
2
0
0
3
2
1
0
0
0
0
0

[출력]
0
2
1
3
2
1
0
0

*/

import java.io.*;
import java.util.*;

public class MaxHeap {
    
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int num =Integer.parseInt(br.readLine());

            if (num == 0) {
                if (maxHeap.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(maxHeap.poll()).append("\n");
                }
            } else {
                maxHeap.add(num);
            }
        }

        System.out.println(sb.toString());
        br.close();
    }

}

/*
 * 최대 힙 
 * PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
 * 
 * : 부모 노드의 키 값이 항상 자식 노드의 키 값보다 크거나 같아야 하는 힙
 * ex) 가장 우선순위가 높은(큰) 항목을 빠르게 찾아야 할때
 * 
 * 
 * 최소 힙 
 * PriorityQueue<Integer> minHeap = new PriorityQueue<>();
 * 
 * : 부모 노드의 키 값이 항상 자식 노드의 키 값보다 작거나 같아야 하는 힙
 * ex) 가장 우선순위가 낮은(작은) 항목을 빠르게 찾아야 할 때 사용
 * 
 */