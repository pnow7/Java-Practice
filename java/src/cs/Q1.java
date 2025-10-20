package cs;

/*

Q1. 주어진 문자열에서 가장 많이 반복되는 문자
(대소문자 구분 없음, 빈도수가 같을 경우 알파벳 순서가 빠른 문자 반환)

[입력]
Java

[출력]
a

*/

import java.io.*;

public class Q1 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine().toLowerCase();

        int[] alpha = new int[26];
        
        for (int i = 0; i < str.length(); i++) {
            int checkAlphaNum = str.charAt(i) - 'a';
            alpha[checkAlphaNum]++;
        }

        int idx = 0;
        int maxValue = 0;

        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] > maxValue) {
                maxValue = alpha[i];
                idx = i;
            }
        }

        char result = (char)(idx + 'a');

        System.out.println(result);
        br.close();
    }

}
