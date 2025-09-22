package test.test04.test0402;

/*
28297 덱2
정수를 저장하는 덱을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 여덟 가지이다.

1 X: 정수 X를 덱의 앞에 넣는다. (1 ≤ X ≤ 100,000)
2 X: 정수 X를 덱의 뒤에 넣는다. (1 ≤ X ≤ 100,000)
3: 덱에 정수가 있다면 맨 앞의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
4: 덱에 정수가 있다면 맨 뒤의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
5: 덱에 들어있는 정수의 개수를 출력한다.
6: 덱이 비어있으면 1, 아니면 0을 출력한다.
7: 덱에 정수가 있다면 맨 앞의 정수를 출력한다. 없다면 -1을 대신 출력한다.
8: 덱에 정수가 있다면 맨 뒤의 정수를 출력한다. 없다면 -1을 대신 출력한다.
입력
첫째 줄에 명령의 수 N이 주어진다. (1 ≤ N ≤ 1,000,000)

둘째 줄부터 N개 줄에 명령이 하나씩 주어진다.
[입력]
11
6
1 3
1 8
7
8
3
2 5
1 2
5
4
4

[출력]
1
8
3
8
3
5
3
*/

import java.io.*;
import java.util.*;
public class Main28279 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Deque<Integer> q = new LinkedList<>();
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			
			if(num == 1) {
				q.addFirst(Integer.parseInt(st.nextToken()));
			}
			else if(num == 2) {
				 q.addLast(Integer.parseInt(st.nextToken()));
			}
			else if(num == 3) {
				bw.write(q.isEmpty() ? "-1\n" : q.pollFirst()+"\n");
			}
			else if(num == 4) {
				bw.write(q.isEmpty() ? "-1\n" : q.pollLast()+"\n");
			}
			else if(num == 5) {
				bw.write(q.size()+"\n");
			}
			else if(num == 6) {
				bw.write(q.isEmpty() ? "1\n" : "0\n");
			}
			else if(num == 7) {
				bw.write(q.isEmpty() ? "-1\n" : q.peekFirst()+"\n");
			}
			else {
				bw.write(q.isEmpty() ? "-1\n" : q.peekLast()+"\n");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
