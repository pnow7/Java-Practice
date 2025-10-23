package ct;

/*

1 부터 n 까지 카드를 쌓고

맨 위의 카드는 버린다

그 후 맨 위의 카드를 맨 아래에 둔다.

이런 식으로 계속 반복 할때 나머지 남는 카드의 숫자는?

*/

import java.util.*;

public class Ct4 {
    
    public static void main(String[] args) {
        System.out.println(solution(4));
        System.out.println(solution(11));

        System.out.println(solution1(4));
        System.out.println(solution1(11));
    }

    static int solution(int n) {
        Deque<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            q.addLast(i);
        }

        while (q.size() > 1) {
            q.pollFirst();

            if (q.size() > 0) {
                int lastCard = q.pollFirst();
                q.addLast(lastCard);   
            }
        }

        return q.peekFirst();
    }

    static int solution1(int n) {
        Deque<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            q.addFirst(i);
        }

        while (q.size() > 1) {
            q.pollLast();

            if (q.size() > 0) {
                int lastCard = q.pollLast();
                q.addFirst(lastCard);
            }
        }

        return q.peekFirst();
    }

}

/*

**add는 역순**

addFirst는 Top에서 순차적으로 넣고

addLast는 땅에서 밀어넣음

*/
