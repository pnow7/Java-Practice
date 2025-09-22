package test.test09.test0912;

/*

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

public class FMain16139 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String S = br.readLine();
		int Q = Integer.parseInt(br.readLine());
		
		int[][] prefixSum = new int[26][S.length() + 1];
		for(int i = 0; i <S.length(); i++) {
			for(int j = 0; j < 26; j++) {
				prefixSum[j][i + 1] = prefixSum[j][i];
			}
			prefixSum[S.charAt(i) - 'a'][i + 1]++;
			
		}
		
		StringTokenizer st;
		for(int i = 0; i < Q; i++) {
			st = new StringTokenizer(br.readLine());
			
			char alpha = st.nextToken().charAt(0);
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			
			int alphaIndex = alpha - 'a';
			
			int count = prefixSum[alphaIndex][r + 1] - prefixSum[alphaIndex][l];
			sb.append(count).append("\n");
		}
				
		System.out.print(sb);
		br.close();
		
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