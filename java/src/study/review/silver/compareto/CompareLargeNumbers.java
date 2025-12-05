package study.review.silver.compareto;

/*
- 큰 수 구성하기

N보다 작거나 같은 자연수 중에서, 집합 K의 원소로만 구성된 가장 큰 수를 출력하는 프로그램을 작성하시오.
K의 모든 원소는 1부터 9까지의 자연수로만 구성된다.

예를 들어 N = 657이고, ㅏ = {1, 5, 7}일 때 답은 577이다.

[입력]
657 3
1 5 7

[출력]
577

*/

import java.io.*;
import java.util.*;

public class CompareLargeNumbers {

	private static String N;
	private static Integer[] K;
	
	private static int len;
	private static String answer = "";
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = st.nextToken();
		int k = Integer.parseInt(st.nextToken());
		
		K = new Integer[k];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < k; i++) {
			K[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(K, Collections.reverseOrder());
		
		len = N.length();
		
		dfs(0, "");
		
		System.out.println(answer);
		br.close();
	}
	
	private static void dfs(int depth, String num) {
		// 더 큰 수 갱신
		if (!num.isEmpty() && (answer.isEmpty() || num.compareTo(answer) > 0)) {
			answer = num;
		}
		
		if (depth == len) {
			return;
		}
		
		for (int i = 0; i < K.length; i++) {
			String newNum = num + K[i];
			
			if (newNum.length() <= len) {
				String nPrefix = N.substring(0, newNum.length());
				
				if (newNum.compareTo(nPrefix) > 0) {
					continue;
				}
			}
			
			dfs(depth + 1, newNum);
		}
	}

}

