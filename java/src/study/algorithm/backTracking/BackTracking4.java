package study.algorithm.backTracking;

/*

자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.

1부터 N까지 자연수 중에서 M개를 고른 수열
같은 수를 여러 번 골라도 된다.
고른 수열은 비내림차순이어야 한다.

[입력]
3 1

[출력]
1
2
3

[입력]
4 2

[출력]
1 1
1 2
1 3
1 4
2 2
2 3
2 4
3 3
3 4
4 4

[입력]
3 3

[출력]
1 1 1
1 1 2
1 1 3
1 2 2
1 2 3
1 3 3
2 2 2
2 2 3
2 3 3
3 3 3
 

*/


import java.util.*;
import java.io.*;

public class BackTracking4 {
	
	private static int[] arr;
	private static int N, M;
	private static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		
		dfs(1, 0);
		bw.write(sb.toString());
		
		br.close();
		bw.flush();
		bw.close();

	}
	
	public static void dfs(int at, int depth) {
		if(depth == M) {
			for(int val : arr) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = at; i <= N; i++) {
			arr[depth] = i;
			dfs(i, depth + 1);
		}
	}
	
}
