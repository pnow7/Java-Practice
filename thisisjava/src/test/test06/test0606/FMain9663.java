package test.test06.test0606;
/*

N-Queen 문제는 크기가 N × N인 체스판 위에 퀸 N개를 서로 공격할 수 없게 놓는 문제이다.

N이 주어졌을 때, 퀸을 놓는 방법의 수를 구하는 프로그램을 작성하시오.

첫째 줄에 N이 주어진다. (1 ≤ N < 15)

첫째 줄에 퀸 N개를 서로 공격할 수 없게 놓는 경우의 수를 출력한다.

[입력]
8

[출력]
92
*/

import java.io.*;
public class FMain9663 {
	
	static int N;
	static int count = 0;
	static int[] board;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		board = new int[N];
		
		solve(0);
		
		System.out.println(count);
	}
	
	public static void solve(int row) {
		if(row == N) {
			count++;
			return;
		}
		
		for(int col = 0; col < N; col++) {
			// row행에 퀸이 col열에 있다는 뜻
			// 같은 행에 두 개의 퀸이 놓일 수 없고,

			// board[row] 값이 바로 그 행의 퀸의 위치니까, 검사할 때도 간단
			board[row] = col;
			if(isValid(row)) {
				solve(row + 1);
			}
		}
	}
	
	public static boolean isValid(int row) {
		for(int i = 0; i < row; i++) {
			//같은 열에 이미 퀸이 있다(board[i] == board[row])
			//대각선에 퀸이 있다((0,0)과 (1,1)은 대각선 => |행 차이| == |열 차이|)
			if(board[i] == board[row] || Math.abs(row - i) == Math.abs(board[row] - board[i])) {
				return false;
			}
		}
		return true;
	}
}

/*
ex) N = 4
체스판이 4 * 4일 때 가능한 배치는 2가지 뿐
1)
. Q . .
. . . Q
Q . . .
. . Q .

2)
. . Q .
Q . . .
. . . Q
. Q . .

각 행에 퀸 하나씩만 있고, 서로 공격할 수 없다.


*/
