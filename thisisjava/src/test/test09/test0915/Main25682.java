package test.test09.test0915;

/*

[입력]
4 4 3
BBBB
BBBB
BBBW
BBWB

10 13 10
BBBBBBBBWBWBW
BBBBBBBBBWBWB
BBBBBBBBWBWBW
BBBBBBBBBWBWB
BBBBBBBBWBWBW
BBBBBBBBBWBWB
BBBBBBBBWBWBW
BBBBBBBBBWBWB
WWWWWWWWWWBWB
WWWWWWWWWWBWB

[출력]
2

30

*/

import java.io.*;
import java.util.*;

public class Main25682 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[][] w_start = new int[N][M];
		int[][] b_start = new int[N][M];
		int[][] w_sum = new int[N + 1][M + 1];
		int[][] b_sum = new int[N + 1][M + 1];
		
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			for (int j = 0; j < M; j++) {
				char currentColor = s.charAt(j);
				
				if ((i + j) % 2 == 0) {
					if (currentColor != 'W') w_start[i][j] = 1;
					if (currentColor != 'B') b_start[i][j] = 1;
				} else {
					if (currentColor != 'W') b_start[i][j] = 1;
					if (currentColor != 'B') w_start[i][j] = 1;
				}
				
			}
		}
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				w_sum[i][j] = w_sum[i][j - 1] + w_sum[i - 1][j] - w_sum[i - 1][j - 1] + w_start[i - 1][j - 1];
				b_sum[i][j] = b_sum[i][j - 1] + b_sum[i - 1][j] - b_sum[i - 1][j - 1] + b_start[i - 1][j - 1];
			}
		}
		
		int min = 0;
		int result = Integer.MAX_VALUE;
		for (int i = K; i <= N; i++) {
			for (int j = K; j <= M; j++) {
				min = Math.min(w_sum[i][j] - w_sum[i - K][j] - w_sum[i][j - K] + w_sum[i - K][j - K], b_sum[i][j] - b_sum[i][j - K] - b_sum[i - K][j] + b_sum[i - K][j - K]);
				result = Math.min(result, min);
			}
		}
		
		System.out.println(result);
		br.close();
	}
	
}
