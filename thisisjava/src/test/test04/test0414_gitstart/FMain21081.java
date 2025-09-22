package test.test04.test0414_gitstart;

import java.io.*;
import java.util.*;

public class FMain21081 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        int[] count = new int[8001]; // -4000 ~ 4000 -> 0 ~ 8000
        int sum = 0;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(br.readLine());
            nums[i] = val;
            sum += val;
            count[val + 4000]++;

            if (val > max) max = val;
            if (val < min) min = val;
        }

        Arrays.sort(nums); // 중앙값 구하기 위해 정렬

        // 최빈값 구하기
        int modeMax = 0;
        for (int i = 0; i < 8001; i++) {
            if (count[i] > modeMax) {
                modeMax = count[i];
            }
        }

        int mode = 0;
        boolean first = true;
        for (int i = 0; i < 8001; i++) {
            if (count[i] == modeMax) {
                if (first) {
                    mode = i - 4000;
                    first = false;
                } else {
                    mode = i - 4000;
                    break;
                }
            }
        }

        // 결과 출력
        //산술 평균 double 꼭해야함(7/2 -> 3 이므로 못나눔 double로 해야 3.5가 나와서 가능
        System.out.println(Math.round((double) sum / N));
        //중앙값
        System.out.println(nums[N / 2]);
        //최빈값
        System.out.println(mode);                        
        //범위
        System.out.println(max - min);                   
    }
}
