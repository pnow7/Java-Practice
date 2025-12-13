package study.algorithm.dp;

public class Dp_Fibonacci_Bottom_Up {
	
	public static void main(String[] args) {
        int n = 50;
        
        System.out.println(fibonacci(n));
        
	}
	
	public static long fibonacci(int n) { 
		long[] dp = new long[n + 1];
		
        // 가장 작은 문제의 답부터 채워 넣기
        dp[0] = 0;
        
        if (n >= 1) {
            dp[1] = 1;
        }

        // 반복문을 통해 큰 문제의 답을 계산
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        return dp[n];
    }
	
}
