package study.algorithm.implementation;

/*
- 블랙잭

카드의 합이 21을 넘지 않는 한도 내에서
카드의 합을 최대한 크게 만드는 게임

N장의 카드가 숫자가 보이도록 놓음
딜러는 숫자 M을 크게 외침.
제한된 시간 안에 N장의 카드 중에서 3장의 카드를 골라야 한다.
플레이어가 고른 카드의 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 함.

N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력.

[입력]
5 21
5 6 7 8 9

10 500
93 181 245 214 315 36 185 138 216 295

[출력]
21

497

*/

import java.io.*;
import java.util.*;

public class BlackJack {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] num = new int[n];
		int sum = 0;
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = 0;
		for (int i = 0 ; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					sum = num[i] + num[j] + num[k];
					
					if (sum < m && sum > result) {
						result = sum;
					}
				}
			}
		}
		
		System.out.println(result);
		br.close();
	}
	
}
