package study.algorithm.greedy;

/*
[입력]
11
1 4
3 5
0 6
5 7
3 8
5 9
6 10
8 11
8 12
2 13
12 14

[출력]
4

*/

import java.io.*;
import java.util.*;

public class Meetings {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[][] meetings = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			meetings[i][0] = Integer.parseInt(st.nextToken());
			meetings[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(meetings, (a, b) -> {
			if (a[1] == b[1]) {
				return Integer.compare(a[0], b[0]);
			}
			return Integer.compare(a[1], b[1]);
		});
		
		int count = 0;
		int lastEndTime = 0;
		
		for (int i = 0; i < N; i++) {
			if (meetings[i][0] >= lastEndTime) {
				count++;
				lastEndTime = meetings[i][1];
			}
		}
		
		System.out.println(count);
		br.close();
	}
	
}

/*

- Greedy

meetings[i][0]: 시작시간
meetings[i][1]: 종료시간

- 예시 값
for (int i = 0; i < N; i++) {
	if (meetings[i][0] >= lastEndTime) {
		count++;
		lastEndTime = meetings[i][1];
	}
}

int[][] meetings = {{1, 4}, {2, 5}, {3, 5}, {4, 7}, {5, 8}}

i	meetings[i]		meetings[i][0] >= lastEndTime	count	lastEndTime	
0	{1, 4}				    1 >= 0 (참)				  1		    4	
1	{2, 5}					2 >= 4 (거짓)				  1		    4	
2	{3, 5}					3 >= 4 (거짓)				  1			4	
3	{4, 7}					4 >= 4 (참)				  2			7	
4	{5, 8}					5 >= 7 (거짓)				  2			7	

*/