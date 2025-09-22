package study.algorithm.prefixsum.two_dim;

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

public class Chess {

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
		
		// result 변수 없애고 min만 쓰면 반복문 끝났을 때 min에는 마지막으로 계산된 K x K 사각형의 값만 남아있기때문에
		// result 변수를 선언하고 min값 중 가장 작은 값 출력하기 위함
		int min = 0;
		int result = Integer.MAX_VALUE;
		// N x M 체스판에서 K x K 사각형 반복 횟수
		// ex) 8 8 8 이면 8 x 8체스판에서 8 x 8 사각형은 하나 밖에 없으므로 한번만 돌아감 
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