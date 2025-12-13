package study.algorithm.greedy;

/*
- 동전 0

준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.

동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 
이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.

=> 가장 큰 동전부터 사용하여 목표 금액 K를 채워나가는 
그리디 전략이 최소의 동전 개수를 보장합니다.

[입력]
10 4200
1
5
10
50
100
500
1000
5000
10000
50000

[출력]
6

*/

import java.io.*;
import java.util.*;

public class Coin0 {
	
	 public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st = new StringTokenizer(br.readLine());
		 
		 int N = Integer.parseInt(st.nextToken());
		 int K = Integer.parseInt(st.nextToken());
		 int[] coins = new int[N];
		 
		 for (int i = 0; i < N; i++) {
			 coins[i] = Integer.parseInt(br.readLine());
		 }
		 
		 int count = 0;
		 
		 for (int i = N - 1; i >= 0; i--) {
			 count += K / coins[i];
			 K %= coins[i];
			 
			 if (K == 0) {
				 break;
			 }
		 }
		 
		 System.out.println(count);
		 br.close();
	 }
	 
}