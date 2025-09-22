package test.test04.test0402;

//진짜 모를때 하는 방법(Deque와 배열의 조합을 모를때 두개의 Deque 방법)
import java.io.*;
import java.util.*;

public class FMain2346_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        
        Deque<Integer> indexDeque = new ArrayDeque<>(); // 풍선 번호 저장
        Deque<Integer> moveDeque = new ArrayDeque<>();  // 이동 값 저장

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            indexDeque.addLast(i); // 풍선 번호 추가
            moveDeque.addLast(Integer.parseInt(st.nextToken())); // 풍선 이동 값 추가
        }

        StringBuilder sb = new StringBuilder();

        while (!indexDeque.isEmpty()) {
            int index = indexDeque.pollFirst(); // 현재 터뜨릴 풍선 번호
            int move = moveDeque.pollFirst();  // 해당 풍선의 이동 값
            
            sb.append(index).append(" "); // 결과 저장
            
            if (indexDeque.isEmpty()) break; // 마지막 풍선이면 종료
            
            // 풍선을 이동하는 과정
            if (move > 0) { // 오른쪽 이동
                for (int i = 0; i < move - 1; i++) { // 이미 하나 뽑았으므로 move-1만큼 이동
                    indexDeque.addLast(indexDeque.pollFirst());
                    moveDeque.addLast(moveDeque.pollFirst());
                }
            } else { // 왼쪽 이동
                for (int i = 0; i < Math.abs(move); i++) {
                    indexDeque.addFirst(indexDeque.pollLast());
                    moveDeque.addFirst(moveDeque.pollLast());
                }
            }
        }

        bw.write(sb.toString().trim());
        br.close();
        bw.flush();
        bw.close();
    }
}
