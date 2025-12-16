package study.algorithm.binarysearch;

/* 
- 숫자카드

숫자 카드는 정수 하나가 적혀져 있는 카드이다. 
상근이는 숫자 카드 N개를 가지고 있다. 

정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 
상근이가 가지고 있는지 아닌지를 구하는 프로그램을 작성하시오.

첫째 줄에 입력으로 주어진 M개의 수에 대해서, 
각 수가 적힌 숫자 카드를 상근이가 가지고 있으면 1을, 
아니면 0을 공백으로 구분해 출력한다.

[입력]
5
6 3 2 10 -10
8
10 9 -5 2 3 4 5 -10

[출력]
1 0 0 1 1 0 0 1

*/

import java.io.*;
import java.util.*;

public class B_NumberCard {

	static int N, M;
	static int[] num1;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		num1 = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			num1[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(num1);
		
		M = Integer.parseInt(br.readLine());
		
		int num2;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			num2 = Integer.parseInt(st.nextToken());
			bw.write(BinarySearch(num2) + " ");
		}
		br.close();
		bw.flush();
		bw.close();
	}
	
    // 값 찾기
	public static int BinarySearch(int num) {
		int lo = 0;
		int hi = N - 1;
		
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			int middleValue = num1[mid];
			
			if(middleValue > num) {
				hi = mid - 1;
			}
			else if(middleValue < num) {
				lo = mid + 1;
			}
			else {
				return 1;
			}
		}

		return 0;
	}

}