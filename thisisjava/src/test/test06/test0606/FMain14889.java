package test.test06.test0606;

/*
 
축구를 하기 위해 모인 사람은 총 N명이고 신기하게도 N은 짝수이다. 
이제 N/2명으로 이루어진 스타트 팀과 링크 팀으로 사람들을 나눠야 한다.

BOJ를 운영하는 회사 답게 사람에게 번호를 1부터 N까지로 배정했고, 
아래와 같은 능력치를 조사했다. 
능력치 Sij는 i번 사람과 j번 사람이 같은 팀에 속했을 때, 팀에 더해지는 능력치이다. 
팀의 능력치는 팀에 속한 모든 쌍의 능력치 Sij의 합이다. 
Sij는 Sji와 다를 수도 있으며, i번 사람과 j번 사람이 같은 팀에 속했을 때, 
팀에 더해지는 능력치는 Sij와 Sji이다.

N=4이고, S가 아래와 같은 경우를 살펴보자.

i\j	1	2	3	4
1	 	1	2	3
2	4	 	5	6
3	7	1	 	2
4	3	4	5	 

스타트 팀: S12 + S21 = 1 + 4 = 5
링크 팀: S34 + S43 = 2 + 5 = 7
1, 3번이 스타트 팀, 2, 4번이 링크 팀에 속하면, 두 팀의 능력치는 아래와 같다.

스타트 팀: S13 + S31 = 2 + 7 = 9
링크 팀: S24 + S42 = 6 + 4 = 10

첫째 줄에 N(4 ≤ N ≤ 20, N은 짝수)이 주어진다. 
둘째 줄부터 N개의 줄에 S가 주어진다. 
각 줄은 N개의 수로 이루어져 있고, i번 줄의 j번째 수는 Sij 이다. 
Sii는 항상 0이고, 나머지 Sij는 1보다 크거나 같고, 100보다 작거나 같은 정수이다.


[입력]
6
0 1 2 3 4 5
1 0 2 3 4 5
1 2 0 3 4 5
1 2 3 0 4 5
1 2 3 4 0 5
1 2 3 4 5 0 

[출력]
2

*/

import java.io.*;
import java.util.*;

public class FMain14889 {
	
	static int N;
	static int[][] team;
	static boolean[] visit;
	
	static int MIN = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		team = new int[N][N];
		visit = new boolean[N];
		
		for(int i = 0 ; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < N; j++) {
				team[i][j] = Integer.parseInt(st.nextToken());
			}
			
		}
		
		combi(0, 0);
		System.out.println(MIN);
		
	}
	
	public static void combi(int idx, int count) {
		if(count == N/2) {
			diff();
			return;
		}
		
		
		for(int i = idx; i < N; i++ ) {
			if(!visit[i]) {
				visit[i] = true;
				combi(i + 1, count + 1);
				visit[i] = false;
			}
		}
	}
	
	public static void diff() {
		int start = 0;
		int link = 0;
		
		for(int i = 0; i < N-1; i++) {
			for(int j = i + 1; j < N; j++) {
				if(visit[i] == true && visit[j] == true) {
					start += team[i][j];
					start += team[j][i];
				}
				else if(visit[i] == false && visit[j] == false) {
					link += team[i][j];
					link += team[j][i];
				}
			}
		}
		
		int val = Math.abs(start - link);
		
		if(val == 0) {
			System.out.println(val);
			System.exit(0);
		}
		
		MIN = Math.min(val,  MIN);
	}
}
