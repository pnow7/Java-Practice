package study.algorithm.greedy;

/*

[입력]
55-50+40

10+20+30+40

00009-00009

[출력]
-35

100

0

*/

import java.io.*;

public class LostParenthesis {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String exp = br.readLine();
		
		int sum = 0;
		
		String[] subExp = exp.split("-");
		
		// - 부호가 없다하면 subExp[0]에는 전부다 +만 붙은 숫자들만 들어가 있음
		// 그래서 secondGroup이 존재하지 않음 -> for (int i = 1; i < 1; i++) 이렇게 됨
		String[] firstGroup = subExp[0].split("\\+");
		for (String s : firstGroup) {
			sum += Integer.parseInt(s);
		}
		
		for (int i = 1; i < subExp.length; i++) {
			String[] secondGroup = subExp[i].split("\\+");
			for (String s : secondGroup) {
				sum -= Integer.parseInt(s);
			}
		}
			
		System.out.println(sum);
		br.close();
	}
	
}