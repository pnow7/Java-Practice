package study.algorithm.divide_conquer;

/*

[입력]
9
0 0 0 1 1 1 -1 -1 -1
0 0 0 1 1 1 -1 -1 -1
0 0 0 1 1 1 -1 -1 -1
1 1 1 0 0 0 0 0 0
1 1 1 0 0 0 0 0 0
1 1 1 0 0 0 0 0 0
0 1 -1 0 1 -1 0 1 -1
0 -1 1 0 1 -1 0 1 -1
0 1 -1 1 0 -1 0 1 -1

[출력]
10
12
11

*/

import java.io.*;
import java.util.*;

public class NumberOfPapers {
    
    static int[][] paper;
    static int minusOne = 0;
    static int zero = 0;
    static int one = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        paper = arr;

        divideConquer(0, 0, N);

        System.out.println(minusOne);
        System.out.println(zero);
        System.out.println(one);
        br.close();
    }

    // 정사각형 영역을 재귀적으로 4등분
    // 영역 전체가 같은 색인지 확인 → 2차원 배열 내의 색종이 개수, 특정 숫자 칸의 개수 확인
    static void divideConquer(int x, int y, int size) {
        if (check(x, y, size)) {
            if (paper[x][y] == -1) {
                minusOne++;
            } else if (paper[x][y] == 0) {
                zero++;
            } else {
                one++;
            }
            return;
        }

        int newSize = size / 3;

        /*
        divideConquer(x, y, newSize);

        divideConquer(x, y + newSize, newSize);
        divideConquer(x, y + newSize * 2, newSize);

        divideConquer(x + newSize, y, newSize);
        divideConquer(x + newSize * 2, y, newSize);

        divideConquer(x + newSize, y + newSize, newSize);
        divideConquer(x + newSize * 2, y + newSize, newSize);
        divideConquer(x + newSize, y + newSize * 2, newSize);
        divideConquer(x + newSize * 2, y + newSize * 2, newSize);
         */

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                divideConquer(x + newSize * i, y + newSize * j, newSize);
            }
        }
    }  

    static boolean check(int x, int y, int size) {
        int num = paper[x][y];

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (paper[i][j] != num) {
                    return false;
                }
            }
        }

        return true;
    }

}
