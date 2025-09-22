package test.test06.test0606;


/*
스도쿠

[입력]
0 3 5 4 6 9 2 7 8
7 8 2 1 0 5 6 0 9
0 6 0 2 7 8 1 3 5
3 2 1 0 4 6 8 9 7
8 0 4 9 1 3 5 0 6
5 9 6 8 2 0 4 1 3
9 1 7 6 5 2 0 8 0
6 0 3 7 0 1 9 5 2
2 5 8 3 9 4 7 6 0


[입력]
1 3 5 4 6 9 2 7 8
7 8 2 1 3 5 6 4 9
4 6 9 2 7 8 1 3 5
3 2 1 5 4 6 8 9 7
8 7 4 9 1 3 5 2 6
5 9 6 8 2 7 4 1 3
9 1 7 6 5 2 3 8 4
6 4 3 7 8 1 9 5 2
2 5 8 3 9 4 7 6 1

*/

import java.io.*;
import java.util.*;

public class FMain2580 {

	static int[][] board = new int[9][9];
	static ArrayList<int[]> blanks = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 9; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
				
				if(board[i][j] == 0) {
					blanks.add(new int[] {i, j});
				}
			}
		}
		br.close();
		solve(0);
	}
	
	public static void solve(int idx) {
		if(idx == blanks.size()) {
			printBoard();
			System.exit(0); // 답 하나만 출력하고 종료
		}
		
		int[] pos = blanks.get(idx);
		int x = pos[0];
		int y = pos[1];
		
		for(int num = 1; num <= 9; num++) {
			if(isValid(x, y, num)) {
				board[x][y] = num;
				solve(idx + 1);
				board[x][y] = 0;
			}
		}
	}
	
	public static boolean isValid(int x, int y, int num) {
		// 행 확인
        for (int i = 0; i < 9; i++) {
            if (board[x][i] == num) return false;
        }

        // 열 확인
        for (int i = 0; i < 9; i++) {
            if (board[i][y] == num) return false;
        }

        // 3x3 박스 확인
        int boxX = (x / 3) * 3;
        int boxY = (y / 3) * 3;
        for (int i = boxX; i < boxX + 3; i++) {
            for (int j = boxY; j < boxY + 3; j++) {
                if (board[i][j] == num) return false;
            }
        }

        return true;
	}
	
	// 결과 출력
    public static void printBoard() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
