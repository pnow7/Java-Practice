package study.stackque;

/*
Deque<Integer> q = new LinkedList<>();
q.offer();	// push
q.pop();	// pop
q.size();	// size
q.isEmpty();	// empty
q.peek();	// front
q.peekLast();	// back

*/

import java.io.*;
import java.util.*;
public class Deque3_Integer {
		public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			Deque<Integer> q = new LinkedList<>();
			
			int N = Integer.parseInt(br.readLine());
			while(N-- > 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				//int와 Integer 객체차이
				String s = st.nextToken();
				switch(s) {
				case "push":
					q.offer(Integer.parseInt(st.nextToken()));
					break;
				case "pop":
					Integer itm = q.poll();
					if(itm == null) {
						bw.write("-1\n");
					}
					else {
						bw.write(itm+"\n");
					}
					break;
				case "size":
					bw.write(q.size()+"\n");
					break;
				case "empty":
					if(q.isEmpty()) {
						bw.write("1\n");
					}
					else {
						bw.write("0\n");
					}
					break;
				case "front":
					Integer ite = q.peek();
					if(ite == null) {
						bw.write("-1\n");
					}
					else {
						bw.write(ite+"\n");
					}
					break;
				case "back":
					Integer it = q.peekLast();
					if(it == null) {
						bw.write("-1\n");
					}
					else {
						bw.write(it+"\n");
					}
					break;
				}
			}
					
			br.close();
			bw.flush();
			bw.close();
	}

}


