package F;

import java.io.*;
public class FMain4779_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num;
        while((num = br.readLine()) != null) {
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