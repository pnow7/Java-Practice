package study.algorithm.greedy;

/*

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