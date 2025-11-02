package test.test11.test1102;

/*

- 절대값 힙
: 배열에 정수 x(x != 0)를 넣는다.
: 배열에서 절댓값이 가장 작은 값을 출력하고, 그 값을 배열에서 제거한다.
: 절댓값이 가장 작은 값이 여러개일 때는, 가장 작은 수를 출력하고, 그 값을 배열에서 제거한다.

* 프로그램은 처음에 비어잇는 배열에서 시작
* 첫째줄 연산의 개수 N 주어짐
* x가 0이 아니라면 배열에서 x라는 값을 넣고, 0이라면 배열에서 절댓값이 가장 작은 값을 출력하고 제거함

[입력]
18
1
-1
0
0
0
1
1
-1
-1
2
-2
0
0
0
0
0
0
0

[출력]
-1
1
0
-1
-1
1
1
-2
2
0

*/

import java.io.*;
import java.util.*;

public class Main11286 {
	
	static Comparator<Integer> absComparator = (a, b) -> {
		if (Math.abs(a) == Math.abs(b)) {
			return a - b;
		} else {
			return Math.abs(a) - Math.abs(b);
		}
	};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> heap = new PriorityQueue<>(absComparator);
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if (num != 0) {
				heap.add(num);
			} else {
				if (heap.isEmpty()) {
					sb.append(0).append("\n");
				} else {
					sb.append(heap.poll()).append("\n");
				}
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}

}
