package test.test12.test1205;

/*
- 시각

정수 N과 K가 입력되었을 때 00시 00분 00초부터 N시 59분 59초까지의 모든 시각 중에서
K가 하나라도 포함 되는 모든 시각을 세는 프로그램 작성

예를 들어 K = 3일 때, 다음의 시각들은 3이 하나 이상 포함되어 있으므로 
세어야 하는 시각의 대표적인 예시

23시 00분 00초
07시 08분 33초

반면에 다음의 시각들은 3이 하나도 포함되어 있지 않으므로 세면 안되는 예시

15시 02분 55초
18시 27분 45초

[입력]
5 3

[출력]
11475

*/

import java.io.*;
import java.util.*;

public class Main18312 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int count = 0;
		for (int h = 0; h <= N; h++) {
			for (int m = 0; m < 60; m++) {
				for (int s = 0; s < 60; s++) {
					if (h / 10 == K || h % 10 == K ||
						m / 10 == K || m % 10 == K ||
						s / 10 == K || s % 10 == K) {
						count++;
					}
				}
			}
		}
		
		System.out.println(count);
		br.close();
	}
	
}
