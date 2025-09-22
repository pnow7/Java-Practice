package study.algorithm.dp;

/*

수열 A가 주어졌을 때, 가장 긴 증가하는 부분 수열을 구하는 프로그램을 작성하시오.

예를 들어, 수열 A = {10, 20, 10, 30, 20, 50} 인 경우에 

가장 긴 증가하는 부분 수열은 A = {10, 20, 10, 30, 20, 50} 이고, 길이는 4이다.

[입력]
6
10 20 10 30 20 50

[출력]
4

*/

import java.io.*;
import java.util.*;

public class Dp_LIS {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] dp = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.fill(dp, 1);
		
		int maxLen = 1;
		
		for(int i = 1; i < n; i++) {
			for(int j = 0; j < i; j++) {
				if(arr[i] > arr[j]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (dp[i] > maxLen) {
				maxLen = dp[i];
			}
		}
		
		br.close();
		
		System.out.println(maxLen);
		
	}

}

/*

1. DP 배열 정의

dp 배열을 생성. 
dp[i]는 i번째 원소를 마지막으로 하는 가장 긴 증가하는 부분 수열의 길이를 의미.

2. 초기값 설정

수열의 모든 원소는 그 자체만으로도 길이가 1인 증가 수열이 될 수 있으므로, 
dp 배열의 모든 값을 1로 초기화.

예시: A = {10, 20, 10, 30, 20, 50}
dp = {1, 1, 1, 1, 1, 1}

3. 점화식 (반복문)

두 개의 반복문을 사용.

바깥쪽 반복문 (i): i는 1부터 수열의 끝까지 순회합니다. 
이 때 i는 현재 계산하려는 원소의 인덱스.

안쪽 반복문 (j): j는 0부터 i-1까지 순회. 
이 때 j는 i번째 원소보다 앞에 있는 원소들의 인덱스.

조건: A[i](현재 원소)가 A[j](앞에 있는 원소)보다 크다면

A[i]는 A[j]로 끝나는 증가 수열 뒤에 붙을 수 있음.

따라서 dp[i] 값은 dp[j] + 1과 dp[i] 중 더 큰 값으로 갱신.

점화식: dp[i] = max(dp[i], dp[j] + 1)

*/