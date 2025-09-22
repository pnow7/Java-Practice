package test.test06.test0607;

import java.io.*;

public class FMain1904_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(tile(N));
		
		System.out.println(tile2(N));
		
		br.close();
	}
	
	public static int tile(int n) {
		if(n == 1) return 1;
		if(n == 2) return 2;
		
		int[] dp = new int[n + 1];
		dp[1] = 1;
		dp[2] = 2;
		
		for(int i = 3; i <= n; i++) {
			dp[i] = (dp[i-1] + dp[i-2]) % 15746;
		}
		
		return dp[n];
	}
	
	public static int tile2(int n) {
		if(n == 1) return 1;
		if(n == 2) return 2;
		
		int a = 1;
		int b = 2;
		int result = 0;
		
		for(int i = 3; i <= n; i++) {
			result = (a + b) % 15746;
			a = b;
			b = result;
		}
		
		return result;
	}
}
