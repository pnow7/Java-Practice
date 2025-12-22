package study.datastructure.que;

/*
- 풍선 터뜨리기

1번부터 N번까지의 풍선이 원형으로 배치되어 있다.
(1번의 왼쪽은 N번, N번의 오른쪽은 1번)

각 풍선 안에는 정수 하나가 적힌 종이가 들어 있다.

터뜨리는 규칙

항상 1번 풍선부터 터뜨린다
풍선을 터뜨린 뒤, 그 안의 숫자만큼 이동해서 다음 풍선을 터뜨린다

양수 → 오른쪽 이동
음수 → 왼쪽 이동

이동할 때는 이미 터진 풍선은 건너뛴다

이 과정을 모든 풍선이 터질 때까지 반복

출력/결과: 풍선이 터지는 순서

ex)
풍선 숫자: 3 2 1 -3 -1
터지는 순서:
1 → 4 → 5 → 3 → 2

즉, 원형 구조에서 숫자만큼 이동하며 풍선을 하나씩 제거하는 시뮬레이션 문제다.

[입력]
5
3 2 1 -3 -1

[출력]
1 4 5 3 2
*/

import java.io.*;
import java.util.*;

class Balloon {
    int index;  // 풍선 번호
    int move;   // 이동할 값

    Balloon(int index, int move) {
        this.index = index;
        this.move = move;
    }
}


public class PopBalloons1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        Deque<Balloon> deque = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 풍선 정보 입력
        for (int i = 1; i <= N; i++) {
            deque.add(new Balloon(i, Integer.parseInt(st.nextToken())));
        }

        // 첫 번째 풍선 터뜨리기
        Balloon current = deque.poll();
        sb.append(current.index).append(" ");

        while (!deque.isEmpty()) {
            int move = current.move;

            // 양수일 경우: 오른쪽으로 이동
            if (move > 0) {
                for (int i = 1; i < move; i++) { 
                    deque.addLast(deque.pollFirst());
                }
            } 
            // 음수일 경우: 왼쪽으로 이동
            else {
                for (int i = 0; i < Math.abs(move); i++) { 
                    deque.addFirst(deque.pollLast());
                }
            }
            // 다음 풍선 터뜨리기
            current = deque.poll();
            sb.append(current.index).append(" ");
        }
        
        System.out.println(sb);
        br.close();

	}

}