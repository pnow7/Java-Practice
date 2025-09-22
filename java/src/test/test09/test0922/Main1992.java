package test.test09.test0922;

/*

[입력]
8
11110000
11110000
00011100
00011100
11110000
11110000
11110011
11110011

[출력]
((110(0101))(0010)1(0001))

*/

import java.io.*;

public class Main1992 {
    
    public static int[][] quadTree;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for(int j = 0; j < N; j++) {
                arr[i][j] = Character.getNumericValue(line.charAt(j));
            }
        }

        quadTree = arr;

        System.out.println(divideConquer(0, 0, N));
        br.close();
    }

    public static String divideConquer(int x, int y, int size) {
        if (Check(x, y, size)) {
            return String.valueOf(quadTree[x][y]);
        }

        int newSize = size / 2;

        return "(" +
                divideConquer(x, y, newSize) +
                divideConquer(x, y + newSize, newSize) +
                divideConquer(x + newSize, y, newSize) +
                divideConquer(x + newSize, y + newSize, newSize) +
                ")";
    }

    public static boolean Check(int x, int y, int size) {
        int num = quadTree[x][y];

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (quadTree[i][j] != num) {
                    return false;
                }
            }
        }

        return true;
    }

}