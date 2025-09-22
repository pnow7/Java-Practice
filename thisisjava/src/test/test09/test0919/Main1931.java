package test.test09.test0919;

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

class Meeting {
	int start;
	int end;
	
	public Meeting(int start, int end) {
		this.start = start;
		this.end = end;
	}
}


public class Main1931 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Meeting> meetings = new ArrayList<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			meetings.add(new Meeting(start, end));
		}
		
		Collections.sort(meetings, (a, b) -> {
			// 종료 시간이 같으면 시작 시간을 기준으로 오름차순
			if (a.end == b.end) {
				return Integer.compare(a.start, b.start);
			}
			
			// 종료시간이 다르면 종료시간을 기준으로 오름차순
			return Integer.compare(a.end, b.end);
		});
		
		int count = 0;
		int lastEndtime = 0;
		
		for (Meeting m : meetings) {
			// 현재 회의의 시작 시간이 이전 회의의 종료 시간보다 크거나 같으면
			if (m.start >= lastEndtime) {
				count++;
				lastEndtime = m.end;
			}
		}
		
		System.out.println(count);
		br.close();
	}
}
