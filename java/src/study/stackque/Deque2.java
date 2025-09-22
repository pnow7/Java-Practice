package study.stackque;

/*
11866 요세푸스 문제 0
1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있다 
이제 순서대로 K번째 사람을 제거한다. 
한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다. 

이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 
원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다. 

(7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.
[입력]
7 3

[출력]
<3, 6, 2, 7, 5, 1, 4>
*/

import java.io.*;
import java.util.*;
		
public class Deque2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Deque<Integer> q = new LinkedList<>();
		Deque<Integer> q1 = new LinkedList<>();
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		//1,2 뒤로 보내고 3빼고 , 4, 5 뒤로 보내고 6 빼고 
		for(int i = 1; i <= N; i++) {
			q.offer(i);
		}
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j < K; j++) {
				q.offer(q.peek());
				q.removeFirst();
			}
			q1.offer(q.poll());
		}
		
		String result = q1.toString().replace("[", "<").replace("]", ">");
		
		bw.write(result);
		
		br.close();
		bw.flush();
		bw.close();
	}

}

