package ct;

/*

1 부터 n 까지 카드를 쌓고 
=> 1이 맨위 -> [1, 2, 3, 4, ......, n]

맨 위의 카드는 버린다

그 후 맨 위의 카드를 맨 아래에 둔다.

이런 식으로 계속 반복 할때 나머지 남는 카드의 숫자는?

*/

import java.util.*;

public class Ct4 {
    
    public static void main(String[] args) {
        System.out.println(solution(4));
        System.out.println(solution(11));

        System.out.println(solution2(4));
        System.out.println(solution2(11));
    }

    static int solution(int n) {
        Deque<Integer> q = new LinkedList<>();
        
        // [1, 2, 3, 4, ..., n]
        for (int i = 1; i <= n; i++) {
            q.addLast(i);
        }

        while (q.size() > 1) {
        	// 버리기
            q.pollFirst();

            // 뽑은 카드를 뒤에 넣기
            if (q.size() > 0) {
                int lastCard = q.pollFirst();
                q.addLast(lastCard);   
            }
        }

        return q.peekFirst();
    }
    
    static int solution2(int n) {
    	List<Integer> list = new LinkedList<>();
    	
    	for (int i = 1; i <= n; i++) {
    		list.add(i);
    	}
    	
    	while (list.size() > 1) {
    		list.remove(0);
    		
    		if (list.size() > 0) {
    			int topCard = list.remove(0);
    			list.add(topCard);
    		}
    	}
    	
    	return list.get(0);
    }

}