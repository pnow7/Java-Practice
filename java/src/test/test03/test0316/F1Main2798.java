package test.test03.test0316;

import java.io.*;
import java.util.*;

public class F1Main2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫 줄 입력: N, M
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 숫자 개수
        int M = Integer.parseInt(st.nextToken()); // 최대 허용 합
        
        // 숫자 배열 입력
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        // 내림차순 정렬
        Arrays.sort(arr);
        for(int i = 0; i < N / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[N - 1 - i];
            arr[N - 1 - i] = temp;
        }

        // 큰 수부터 하나씩 더함
        int sum = 0;
        for(int i = 0; i < N; i++) {
            if(sum + arr[i] <= M) {
                sum += arr[i];
            }
        }
        
        System.out.println(sum);
    }
}
