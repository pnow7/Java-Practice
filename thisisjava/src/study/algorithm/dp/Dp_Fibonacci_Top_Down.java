package study.algorithm.dp;

public class Dp_Fibonacci_Top_Down {

	// 결과를 저장할 배열
	private static long[] memo;
		
	public static void main(String[] args) {
		
		int n = 500;
		memo = new long[n+1];
		
		System.out.println(fibonacci(n));
		
	}
	
	public static long fibonacci(int n) {
		// 기본 조건 처리
		if (n <= 1) {
			return n;
		}
		
		// 이미 계산된 값이 있으면 그 값을 반환
		if (memo[n] > 0) {
			return memo[n];
		}
		
		// 계산하고 메모리에 저장
		memo[n] = fibonacci(n-1) + fibonacci(n-2);
		
		return memo[n];
	}
	
}
