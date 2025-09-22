package test.test04.test0418;
/*
피보나치 수 5

피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.

이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.

n=17일때 까지 피보나치 수를 써보면 다음과 같다.

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597

n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.

 */

import java.io.*;

public class Main10870 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(fibonacci1(n));
		br.close();
	}
	
	public static int fibonacci(int num) {
		int length = num + 1;
		int[] result = new int[length];
		
		result[0] = 0;
		result[1] = 1;
		
		for(int i = 2; i < length; i++) {
			result[i] = result[i-1] + result[i-2];
		}
		
		return result[num];
	}
	/*
	재귀 : 
	f(7) -> f(6) + f(5)
	f(6) -> f(5) + f(4)
	f(5) -> f(4) + f(3)
	....
	f(2) -> f(1) + f(0)  
	 */
	public static int fibonacci1(int num) {
		if(num == 0) return 0;
		if(num == 1) return 1;
		
		return fibonacci1(num-1) + fibonacci1(num-2);
	}


}
