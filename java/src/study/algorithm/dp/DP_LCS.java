package study.algorithm.dp;

/*
- - 가장 긴 증가하는 부분 수열

LCS(Longest Common Subsequence, 최장 공통 부분 수열)

문제는 두 수열이 주어졌을 때, 모두의 부분 수열이 되는 수열 중 가장 긴 것을 찾는 문제이다.

예를 들어, ACAYKP와 CAPCAK의 LCS는 ACAK가 된다.

*/

import java.io.*;

public class DP_LCS {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int len1 = str1.length();
		int len2 = str2.length();
		
		int[][] dp = new int[len1 + 1][len2 + 1];
		
		for(int i = 1; i <= len1; i++) {
			for(int j = 1; j <= len2; j++) {
				/*
				 * 문자가 같을 때 → LCS에 포함될 수 있음.
				 * 이 문자를 제외한 이전 문자열들의 LCS 길이(dp[i - 1][j - 1])에 1을 더해줌. 
				 */ 
				if(str1.charAt(i - 1) == str2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				}
				/*
				 * 문자가 다를 때 → LCS에 X → 더 큰 LCS 길이 선택 
				 * str1의 i번째 문자 포기(i - 1 번째 문자까지)와 str2의 j번째 문짜까지의 LCS
				 * str2의 j번째 문자 포기(j - 1 번째 문자까지)와 str1의 i번재 문자까지의 LCS
				 */
				else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		
		System.out.println(dp[len1][len2]);
	}
	
}

/*

ACAYKP
CAPCAK

A: 첫 번째 문자 'A'는 두 문자열 모두에 존재합니다.
C: 첫 번째 'A' 이후에 두 문자열 모두에 'C'가 존재합니다.
A: 'C' 이후에 'A'가 또 존재합니다.
K: 마지막으로 'A' 이후에 'K'가 공통으로 존재합니다.

*/
