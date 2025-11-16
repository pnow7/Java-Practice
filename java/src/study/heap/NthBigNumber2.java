package study.heap;

/*
- N번째 큰 수

[입력]
5
12 7 9 15 5
13 8 11 19 6
21 10 26 31 16
48 14 28 35 25
52 20 32 41 49

[출력]
35

*/

import java.io.*;
import java.util.*;

public class NthBigNumber2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				int num = Integer.parseInt(st.nextToken());
				
				if (minHeap.size() < N) {
					minHeap.add(num);
				} else if (num > minHeap.peek()) {
					minHeap.poll();
					minHeap.add(num);
				}
			}
		}
		
		System.out.println(minHeap.poll());
		br.close();
	}

}
