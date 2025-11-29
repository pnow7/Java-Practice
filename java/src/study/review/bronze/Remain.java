package study.review.bronze;

/*
- 나머지

두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 
예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 
그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

[입력]
1
2
3
4
5
6
7
8
9
10

[출력]
10

*/

import java.io.*;
import java.util.*;

public class Remain {
	
	private static int[] check = new int[42];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Arrays.fill(check, -1);
		
		for (int i = 0; i < 10; i++) {
			int num = Integer.parseInt(br.readLine());
			
			check[num % 42] = num % 42;
		}
		
		int count = 0;
		
		for (int i = 0; i < check.length; i++) {
			if (check[i] != -1) {
				count++;
			}
		}
		
		System.out.println(count);
		br.close();
	}
	
}

/*
 * HashSet<Integer> set = new HashSet<Integer>();
 * 
 * for (int i = 0; i < 10; i++) {
 *     set.add(Integer.parseInt(br.readLine()%42);
 * }
 * 
 * System.out.println(set.size());
 */