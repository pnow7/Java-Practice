package test.test12.test1205;

/*
- 큰 수 구성하기

N보다 작거나 같은 자연수 중에서, 집합 K의 원소로만 구성된 가장 큰 수를 출력하는 프로그램을 작성하시오.
K의 모든 원소는 1부터 9까지의 자연수로만 구성된다.

예를 들어 N = 657이고, K = {1, 5, 7}일 때 답은 577이다.

[입력]
657 3
1 5 7

[출력]
577

*/

import java.io.*;
import java.util.*;

public class Main18511 {
	
    private static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] num = new int[K];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < K; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        dfs(num, 0, N);

        System.out.println(result);
        br.close();
    }

    private static void dfs(int[] num, int number, int N) {
        if (number > N) {
        	return;
        }
        
        result = Math.max(result, number);
        
        for (int i = 0; i < num.length; i++) {
        	dfs(num, number * 10 + num[i], N);
        }
    }
    
}