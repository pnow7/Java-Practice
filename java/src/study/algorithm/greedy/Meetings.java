package study.algorithm.greedy;

/*
- 회의실 배정

한 개의 회의실이 있는데 이를 사용하고자 하는 N개의 회의에 대하여 회의실 사용표를 만들려고 한다. 
각 회의 I에 대해 시작시간과 끝나는 시간이 주어져 있고, 
각 회의가 겹치지 않게 하면서 회의실을 사용할 수 있는 회의의 최대 개수를 찾아보자.
 
단, 회의는 한번 시작하면 중간에 중단될 수 없으며 한 회의가 끝나는 것과 동시에 다음 회의가 시작될 수 있다. 
회의의 시작시간과 끝나는 시간이 같을 수도 있다. 이 경우에는 시작하자마자 끝나는 것으로 생각하면 된다.

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
		
		/*
		 * 종료시간(a[1])을 기준으로 오름차순 정렬 (가장 빨리 끝나는 회의를 먼저 배치) 
		 * 종료시간(a[1])이 같다면 시작시간(a[0])을 오름차순
		 */
		Arrays.sort(meetings, (a, b) -> {
			if (a[1] == b[1]) {
				return a[0] - b[0];
			}
			return a[1] - b[1];
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