package test.test09.test0927;

/*

[입력]
1000

[출력]
517691607

*/

import java.io.*;

public class Main11444 {
    
    static int p = 1000000007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

    }

    static long fibonacci(long n) {
        if (n <= 1 ) return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
