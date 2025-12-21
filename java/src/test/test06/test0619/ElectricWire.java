package test.test06.test0619;

/*
- 전깃줄 (서로 교차되는 전깃줄 제거해야하는 최소 전깃줄 개수)

두 전봇대 A와 B 사이에 하나 둘씩 전깃줄을 추가하다 보니 전깃줄이 서로 교차하는 경우가 발생하였다. 
합선의 위험이 있어 이들 중 몇 개의 전깃줄을 없애 전깃줄이 교차하지 않도록 만들려고 한다.

전깃줄이 연결되어 있는 경우 
A의 1번 위치와 B의 8번 위치를 잇는 전깃줄, 
A의 3번 위치와 B의 9번 위치를 잇는 전깃줄, 
A의 4번 위치와 B의 1번 위치를 잇는 전깃줄을 없애면 남아있는 모든 전깃줄이 서로 교차하지 않게 된다.

전깃줄이 전봇대에 연결되는 위치는 전봇대 위에서부터 차례대로 번호가 매겨진다. 
전깃줄의 개수와 전깃줄들이 두 전봇대에 연결되는 위치의 번호가 주어질 때, 
남아있는 모든 전깃줄이 서로 교차하지 않게 하기 위해 없애야 하는 전깃줄의 최소 개수를 구하는 프로그램을 작성하시오.

첫째 줄에는 두 전봇대 사이의 전깃줄의 개수가 주어진다. 
전깃줄의 개수는 100 이하의 자연수이다. 
둘째 줄부터 한 줄에 하나씩 전깃줄이 A전봇대와 연결되는 위치의 번호와 B전봇대와 연결되는 위치의 번호가 차례로 주어진다. 
위치의 번호는 500 이하의 자연수이고, 같은 위치에 두 개 이상의 전깃줄이 연결될 수 없다.

[입력]
8
1 8
3 9
2 2
4 1
6 4
10 10
9 7
7 6

[출력]
3

*/

import java.io.*;
import java.util.*;

public class FMain2565 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        int[][] wires = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            wires[i][0] = Integer.parseInt(st.nextToken()); // A
            wires[i][1] = Integer.parseInt(st.nextToken()); // B
        }

        Arrays.sort(wires, Comparator.comparingInt(o -> o[0]));

        // LIS를 위한 dp 배열
        int[] dp = new int[N];
        Arrays.fill(dp, 1);

        // B 배열만 보고 LIS 계산
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (wires[j][1] < wires[i][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        // 최대 LIS 길이 구하기
        int max = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, dp[i]);
        }

        // 전체 - 최대 LIS = 제거해야 할 전깃줄 수
        System.out.println(N - max);
    }
}

/*

배열 2개 + LIS만 사용

A 기준 정렬 후 B에서 LIS 구하기


*/