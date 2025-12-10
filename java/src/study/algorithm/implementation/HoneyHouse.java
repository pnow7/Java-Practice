package study.algorithm.implementation;

/*
- 벌집


중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다. 
숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때,
몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오. 

[입력]
13

58

[출력]
3

5

*/

import java.io.*;
import java.util.*;

public class HoneyHouse {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(sol(n));
		br.close();
	}
	
	private static int sol(int n) {
		int count = 1;
		int range = 2;
		
		if (n == 1) {
			return 1;
		} else {
			while (range <= n) {
				range = range + (6 * count);
				// System.out.println("range: " + range);
				count++;
			}
			return count;
		}
	}
	
}
