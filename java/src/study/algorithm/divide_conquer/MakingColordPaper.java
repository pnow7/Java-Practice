package study.algorithm.divide_conquer;

/*

- 사각형으로 칠해진 부분 색갈별 개수 세기

[입력]
8
1 1 0 0 0 0 1 1
1 1 0 0 0 0 1 1
0 0 0 0 1 1 0 0
0 0 0 0 1 1 0 0
1 0 0 0 1 1 1 1
0 1 0 0 1 1 1 1
0 0 1 1 1 1 1 1
0 0 1 1 1 1 1 1

[출력]
9
7

*/

import java.io.*;
import java.util.*;

public class MakingColordPaper {

    public static int white = 0;
    public static int blue = 0;
    public static int[][] paper;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] colorPaper = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                colorPaper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        paper = colorPaper;
        divideConquer(0, 0, N);

        System.out.println(white);
        System.out.println(blue);
        br.close();
    }

    public static void divideConquer(int x, int y, int size) {
        if (checkColor(x, y, size)) {
            if (paper[x][y] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }

        // 2. 분할: 모두 같은 색이 아니라면, 4등분해서 재귀 호출
        int newSize = size / 2;

        // 왼쪽위, 오른쪽 위, 왼쪽아래, 오른쪽 아래
        divideConquer(x, y, newSize);
        divideConquer(x, y + newSize, newSize);
        divideConquer(x + newSize, y, newSize);
        divideConquer(x + newSize, y + newSize, newSize);
    }

    public static boolean checkColor(int x, int y, int size) {
        int color = paper[x][y];

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (paper[i][j] != color) {
                    return false;
                }
            }
        }

        return true;
    }

}