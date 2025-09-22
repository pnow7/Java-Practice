package test.test03.test0330;

//stack
//peek
//pop
//size
//isEmpty

/*
1: X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
3: 스택에 들어있는 정수의 개수를 출력한다.
4: 스택이 비어있으면 1, 아니면 0을 출력한다.
5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
[입력]
9
4
1 3
1 5
3
2
5
2
2
5

[출력]
1
2
5
3
3
-1
-1
*/
import java.io.*;
import java.util.*;
public class Main28278 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Stack<Integer> stack = new Stack<>();

		int N = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st1.nextToken());

			if(num1 == 1) {
				stack.push(Integer.parseInt(st1.nextToken()));
			}
			else if(num1 == 2) {
				bw.write(stack.isEmpty() ? "-1\n" : stack.pop()+"\n");
			}
			else if(num1 == 3) {
				bw.write(stack.size()+"\n");
			}
			else if(num1 == 4) {
				bw.write(stack.isEmpty() ? "1\n" : "0\n");
			}
			else {
				bw.write(stack.isEmpty() ? "-1\n" : stack.peek()+"\n");
			}
		}
		br.close();
		bw.flush();
		bw.close();

	}

}