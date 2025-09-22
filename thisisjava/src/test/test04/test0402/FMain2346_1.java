package test.test04.test0402;

import java.io.*;
import java.util.*;

public class FMain2346_1 {

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
class Balloon {
    int index;  // 풍선 번호
    int move;   // 이동할 값

    Balloon(int index, int move) {
        this.index = index;
        this.move = move;
    }
}
