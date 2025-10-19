package test.test10.test1019;

/*

[입력]
6
10 20 10 30 20 50

[출력]
4

*/

import java.io.*;
import java.util.*;

public class Main12015 {
    
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
