package study.algorithm.dp;

/*

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
				if(str1.charAt(i - 1) == str2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				}
				else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		
		System.out.println(dp[len1][len2]);
	}
	
}

/*

A: 첫 번째 문자 'A'는 두 문자열 모두에 존재합니다.

ACAYKP

CAPCAK

C: 첫 번째 'A' 이후에 두 문자열 모두에 'C'가 존재합니다.

ACAYKP

CAPCAK

A: 'C' 이후에 'A'가 또 존재합니다.

ACAYKP

CAPCAK

K: 마지막으로 'A' 이후에 'K'가 공통으로 존재합니다.

ACAYPK

CAPCAK

*/
