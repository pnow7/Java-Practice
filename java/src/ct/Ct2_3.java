package ct;

import java.util.*;

public class Ct2_3 {
    
    public static void main(String[] args) {
        System.out.println(solution("ABCDE12345", 2, 6));
        System.out.println(solution("developer", 0, 1));
    }

    static String solution(String input, int start, int end) {
        List<Character> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        Collections.reverse(list.subList(start, end + 1));

        for (char c : list) {
            sb.append(c);
        }

        return sb.toString();
    }
}
