package study.algorithm.binary_search;

/*
- 가장 긴 증가하는 부분 수열 2

수열 A가 주어졌을 때, 
가장 긴 증가하는 부분 수열을 구하는 프로그램을 작성하시오.

예를 들어, 수열 A = {10, 20, 10, 30, 20, 50} 인 경우에 
가장 긴 증가하는 부분 수열은 A = {10, 20, 10, 30, 20, 50} 이고, 
길이는 4이다.

[입력]
6
10 20 10 30 20 50

[출력]
4

*/

import java.io.*;
import java.util.*;

public class Longest_Increasing_Subsequence {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> LISList = new ArrayList<>();
        
        LISList.add(Integer.parseInt(st.nextToken()));
        
        for (int i = 1; i < N; i++) {
            int val = Integer.parseInt(st.nextToken());
            int lastVal = LISList.get(LISList.size() - 1);
            
            if (val > lastVal) {
                LISList.add(val);
            } else {
                int idx = lowerBound(LISList, val);
                LISList.set(idx, val);
            }
        }
        
        System.out.println(LISList.size());
        br.close();
    }
    
    // 인덱스 찾기
    static int lowerBound(List<Integer> list, int target) {
        int lo = 0;
        int hi = list.size();
        
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            
            if (list.get(mid) >= target) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        
        return lo;
    }
    
}
