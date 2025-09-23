import java.io.*;
import java.util.*;

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
public class test {
    
    static int minusOne = 0;
    static int zero = 0;
    static int one = 0;
    static int[][] paper;

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

        for (int i = 0 ; i < 3; i++) {
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
