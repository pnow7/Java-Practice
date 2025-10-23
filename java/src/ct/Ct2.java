package ct;

public class Ct2 {
    
    public static void main(String[] args) {
        System.out.println(solution("ABCDE12345", 2, 7));
        System.out.println(solution("developer", 1, 5));
    }

    static String solution(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < start; i++) {
            sb.append(str.charAt(i));
        }

        for (int i = end - 1; i >= start; i--) {
            sb.append(str.charAt(i));
        }

        for (int i = end; i < str.length(); i++) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
    
}
