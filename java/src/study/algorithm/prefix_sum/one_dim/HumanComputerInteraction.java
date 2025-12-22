package study.algorithm.prefix_sum.one_dim;

/*
- 인간-컴퓨터 상호작용

'문자열에서 특정 알파벳이 몇 번 나타나는지 알아봐서 
자주 나타나는 알파벳이 중지나 검지 위치에 오는 알파벳인지 확인하면 실용적인지 확인할 수 있을 것이다.'

승재를 도와 특정 문자열 S, 
특정 알파벳 alpha와 문자열의 구간 [l,r]이 주어지면 
S의 l번째 문자부터 r번째 문자 사이에 

alpha가 몇 번 나타나는지 구하는 프로그램을 작성하여라. 

[입력]
seungjaehwang
4
a 0 5
a 0 6
a 6 10
a 7 10

[출력]
0
1
2
1
*/

import java.io.*;
import java.util.*;

public class HumanComputerInteraction {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String S = br.readLine();
		int Q = Integer.parseInt(br.readLine());
		
		int[][] prefixSum = new int[26][S.length() + 1];
		for (int i = 0; i <S.length(); i++) {
			for (int j = 0; j < 26; j++) {
				prefixSum[j][i + 1] = prefixSum[j][i];
			}
			
			prefixSum[S.charAt(i) - 'a'][i + 1]++;
			
		}
		
		StringTokenizer st;
		for (int i = 0; i < Q; i++) {
			st = new StringTokenizer(br.readLine());
			
			char alpha = st.nextToken().charAt(0);
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			
			int alphaIndex = alpha - 'a';
			
			int count = prefixSum[alphaIndex][r + 1] - prefixSum[alphaIndex][l];
			sb.append(count).append("\n");
		}
		
		br.close();
		System.out.print(sb);
		
	}

}

/*

- 'banana'라는 문자열에 대해 prefixSum 배열을 채운 결과
 prefixSum 배열은 [26][문자열 길이 + 1] 크기를 가진 2차원 배열
 
 	  index_0  index_1  index_2  index_3  index_4  index_5  index_6
a        0        0        1        1        2        2        3
b        0        1        1        1        1        1        1
n        0        0        0        1        1        2        2

 - 'banana'에서 인덱스 1부터 4까지 'a'가 몇 개 있는지
prefixSum[alphaIndex][r + 1] - prefixSum[alphaIndex][l]

alphaIndex: 'a'를 의미

l: 시작 인덱스, 여기서는 1

r: 끝 인덱스, 여기서는 4

prefixSum[a][4 + 1]−prefixSum[a][1]

*/