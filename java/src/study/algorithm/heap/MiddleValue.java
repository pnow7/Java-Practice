package study.algorithm.heap;

/*
- 중앙값 구하기
어떤 수열을 읽고, 홀수번째 수를 읽을 때 마다, 
지금까지 입력받은 값의 중앙값을 출력하는 프로그램을 작성하시오.

예를 들어, 수열이 
1, 5, 4, 3, 2 이면, 
홀수번째 수는 1번째 수, 
3번째 수, 5번째 수이고, 

1번째 수를 읽었을 때 중앙값은 1, 
3번째 수를 읽었을 때는 4, 
5번째 수를 읽었을 때는 3이다.

[입력]
3
9
1 2 3 4 5 6 7 8 9
9
9 8 7 6 5 4 3 2 1
23
23 41 13 22 -3 24 -31 -11 -8 -7
3 5 103 211 -311 -45 -67 -73 -81 -99
-33 24 56

[출력]
5
1 2 3 4 5
5
9 8 7 6 5
12
23 23 22 22 13 3 5 5 3 -3
-7 -3

*/

import java.io.*;
import java.util.*;

public class MiddleValue {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		while (T-- > 0) {
			PriorityQueue<Integer> minHeap = new PriorityQueue<>();
			PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
			
			int M = Integer.parseInt(br.readLine());
			
			sb.append((M + 1) / 2).append("\n");
			
			int outputCount = 0;
			StringTokenizer st = null;
			
			for (int i = 0; i < M; i++) {
				// 10개 입력 마다 매 줄 반영  
				if (i % 10 == 0) {
					st = new StringTokenizer(br.readLine());
				}
				
				int num = Integer.parseInt(st.nextToken());
				
                // 작은 숫자들의 최대 힙, 큰 숫자들의 최소 힙
				if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
					maxHeap.add(num);
				} else {
					minHeap.add(num);
				}
				
				// 균형 맞추기
				if (maxHeap.size() < minHeap.size()) {
					maxHeap.add(minHeap.poll());
				} else if (maxHeap.size() > minHeap.size() + 1) {
					minHeap.add(maxHeap.poll());
				}
				
				// 홀수 번째 입력 시 출력
				if ((i + 1) % 2 != 0) {
					sb.append(maxHeap.peek()).append(" ");
					outputCount++;
					
					if (outputCount % 10 == 0) {
						sb.append("\n");
					}
				}
			}
			
			if (M > 0 && outputCount % 10 != 0) {
				sb.append("\n");
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
}
