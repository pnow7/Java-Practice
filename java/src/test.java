import java.io.*;
import java.util.*;

public class test {
    
    static int C = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());  
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        System.out.println(solve(A, B));
        br.close();
    }

    static long solve(long base, long exponent) {
        if (exponent == 1) return base % C;

        long temp = solve(base, exponent / 2);

        if (exponent % 2 == 0) {
            return (temp * temp) % C;
        } else {
            return ((temp * temp % C) * (base % C)) % C;
        }
    }
}