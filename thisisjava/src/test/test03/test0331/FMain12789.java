package test.test03.test0331;
/*
-도키도키 간식드리미
5 4 1 3 2일때

[입력]
5
5 4 1 3 2

[출력]
Nice

그렇지 않다면 Sad 출력
*/


import java.io.*;
import java.util.*;
public class FMain12789 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] man = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			man[i] = Integer.parseInt(st.nextToken());
		}
		bw.write(isValid(man)+"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}
	public static String isValid(int[] num) {
		Stack<Integer> stack = new Stack<>();
		
		int order = 1;
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] == order) {
				order++;
			}
			else {
				stack.push(num[i]);
			}
			//while
			while(!stack.isEmpty() && stack.peek() == order) {
				stack.pop();
				order++;
			}
		}
		
		return stack.isEmpty() ? "Nice" : "Sad";
	}

}
