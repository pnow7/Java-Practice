package test.test11.test1116;

/* 
- N번째 큰 수
NxN의 표에 수 N^2개 채워져 있다. 
채워진 수에는 한 가지 특징이 있는데, 모든 수는 자신의 한 칸 위에 있는 수 보다 크다는 것이다. 
N=5일 때의 예를 들어보자

12	7	9	15	5
13	8	11	19	6
21	10	26	31	16
48	14	28	35	25
52	20	32	41	49

이러한 표가 주어졌을 때, N번재 큰 수를 찾는 프로그램을 작성하시오. 
표에 채워진 수는 모두 다르다.

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

public class Main2075 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				int num = Integer.parseInt(st.nextToken());
				maxHeap.add(num);
			}
		}
		
		while (N > 1) {
			maxHeap.poll();
			N--;
		}
		
		System.out.println(maxHeap.poll());
		br.close();
	}
	
}
