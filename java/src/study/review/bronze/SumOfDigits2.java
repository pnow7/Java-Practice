package study.review.bronze;

/*
- 분해합

어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다. 

어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다. 
예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 

따라서 245는 256의 생성자가 된다. 
물론, 어떤 자연수의 경우에는 생성자가 없을 수도 있다. 반대로, 생성자가 여러 개인 자연수도 있을 수 있다.

자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.

[입력]
216

[출력]
198

*/

import java.io.*;

public class SumOfDigits2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int result = 0;
		int length = String.valueOf(n).length();
		
		// 입력한 n 값에 대한 자리수에 9를 곱하여 최소값 설정을 해줌. 
		// (216은 3자리 수니까 자리수에 9를 곱함 -> 216 - 27 = 189 -> 189 부터 시작하여 만족하는 생성자 수를 찾음) 
		int start = n - (length * 9);
		
		if (start < 1) start = 1;
		
		for (int i = start; i < n; i++) {
			int sum = i;
			int temp = i;
			
			while (temp != 0) {
				sum += temp % 10;
				temp /= 10;
			}
			
			if (sum == n) {
				result = i;
				break;
			}
		}
		
		System.out.println(result);
		br.close();
	}
	
}