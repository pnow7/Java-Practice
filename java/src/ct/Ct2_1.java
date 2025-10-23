package ct;

public class Ct2_1 {
    
    public static void main(String[] args) {
        System.out.println(solution("ABCDE12345", 2, 7));
        System.out.println(solution("developer", 1, 5));
    }

    static String solution(String str, int start, int end) {
        String first = str.substring(0, start);
        String middle = new StringBuilder(str.substring(start, end)).reverse().toString();
        String last = str.substring(end, str.length());

        return first + middle + last;
    }
}
