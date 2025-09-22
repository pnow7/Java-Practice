package F;
//queuestack
/*
[입력]
4
0 1 1 0
1 2 3 4
3
2 4 7

[출력]
4 1 2


-해설
2 4 7

addLast(2) → q = [4, 1, 2] → pollFirst() → 출력 4

addLast(4) → q = [1, 2, 4] → pollFirst() → 출력 1

addLast(7) → q = [2, 4, 7] → pollFirst() → 출력 2
*/

import java.io.*;
import java.util.*;
public class FMain24511 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		Deque<Integer> q = new LinkedList<>(); 
		
		int N = Integer.parseInt(br.readLine());
		int[] type = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());;
		for(int i = 0; i < N; i++) {
			type[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(type[i] == 0) {
				q.addFirst(num);
			}
		}
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			int inputNum = Integer.parseInt(st.nextToken());
			q.addLast(inputNum);
			sb.append(q.pollFirst()).append(" ");
		}
		
		bw.write(sb.toString().trim());
		br.close();
		bw.flush();
		bw.close();
	}

}
