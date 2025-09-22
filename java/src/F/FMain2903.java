package F;

import java.io.*;

public class FMain2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int point = (int)Math.pow(2, n) + 1;
        int result = point * point;

        System.out.println(result);
    }
}

