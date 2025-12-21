package study.algorithm.recursive;

/*
- 칸토어 집합

[입력]
0
1
3
2

[출력]
-
- -
- -   - -         - -   - -
- -   - -

*/

import java.io.*;

public class CantorSet2 {
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num;
        
        while ((num = br.readLine()) != null) {
            int N = Integer.parseInt(num);
            System.out.println(func(N));
        }
    }

    public static String func(int n) {
        if (n == 0) return "-";
        
        String str = func(n - 1);
        return str + " ".repeat(str.length()) + str;
    }
    
}