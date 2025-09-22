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

public class Main2_1931 {
	
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
