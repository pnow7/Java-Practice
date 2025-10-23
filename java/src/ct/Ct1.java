package ct;

public class Ct1 {
    
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(solution(i) + " ");
        }
    }

    static int solution(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return solution(n - 2) + solution(n - 1);
        }
    }

}
