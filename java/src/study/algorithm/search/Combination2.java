package study.algorithm.search;
/*
다리놓기


3
2 2
1 5
13 29

1
5
67863915
 */
import java.io.*;
import java.util.*;

public class Combination2 {
	
	static int[][] dp = new int[31][31];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());;
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			sb.append(combination(M,N)).append("\n");
		}
		bw.write(sb.toString());
		
		br.close();
		bw.flush();
		bw.close();
	}
	static int combination(int N, int K) {
		if(dp[N][K] > 0) {
			return dp[N][K];
		}
		
		if(N == K || K == 0) {
			return dp[N][K] = 1;
		}
		
		return dp[N][K] = combination(N-1, K-1) + combination(N-1, K);
	}

}
