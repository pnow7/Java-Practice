package study.stackque;

/*
Deque<Integer> q = new LinkedList<>();'

q.offer();	// push
q.pop();	// pop
q.size();	// size
q.isEmpty();	// empty
q.peek();	// front
q.peekLast();	// back

[입력]
15
push 1
push 2
front
back
size
empty
pop
pop
pop
size
empty
pop
push 3
empty
front

[출력]
1
2
2
0
1
2
-1
0
1
-1
0
3
*/

import java.io.*;
import java.util.*;
public class Deque1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Deque<Integer> q = new LinkedList<>();
		
		int N = Integer.parseInt(br.readLine());
		while(N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String s = st.nextToken();
			if(s.equals("push")) {
				q.offer(Integer.parseInt(st.nextToken()));
			}
			else if(s.equals("pop")) {
				bw.write(q.isEmpty() ? "-1\n" : q.poll()+"\n");
			}
			else if(s.equals("size")) {
				bw.write(q.size()+"\n");
			}
			else if(s.equals("empty")) {
				bw.write(q.isEmpty() ? "1\n" : "0\n");
			}
			else if(s.equals("front")) {
				bw.write(q.isEmpty() ? "-1\n" : q.peek()+"\n");
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

