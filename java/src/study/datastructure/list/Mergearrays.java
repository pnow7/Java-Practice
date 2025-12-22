package study.datastructure.list;

/*
- 배열 합치기

정렬되어있는 두 배열 A와 B가 주어진다.
두 배열을 합친 다음 정렬해서 출력

첫째 줄에 배열 A의 크기 N, 배열 B의 크기 M이 주어짐
둘째 줄에는 배열 A의 내용,
셋째 줄에는 배열 B의 내용이 주어짐.

[입력]
2 2
3 5
2 9

2 1
4 7
1

[출력]
2 3 5 9

1 4 7
*/

import java.io.*;
import java.util.*;

public class Mergearrays {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		List<Integer> list = new ArrayList<>();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			list.add(num);
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());
			list.add(num);
		}
		
		Collections.sort(list);
		
		for (int value : list) {
			sb.append(value).append(" ");
		}
		
		System.out.println(sb.toString());
		br.close();
	}

}
