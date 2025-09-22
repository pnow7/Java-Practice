package test.test03.test0330;
/*
재현이는 잘못된 수를 부를 때마다 0을 외쳐서, 가장 최근에 재민이가 쓴 수를 지우게 시킨다.
재민이는 이렇게 모든 수를 받아 적은 후 그 수의 합을 알고 싶어 한다. 

정수가 "0" 일 경우에는 가장 최근에 쓴 수를 지우고, 아닐 경우 해당 수를 쓴다.

정수가 "0"일 경우에 지울 수 있는 수가 있음을 보장할 수 있다.

재민이가 최종적으로 적어 낸 수의 합을 출력한다.

[입력]
4
3
0
4
0

[출력]
0

[입력]
10
1
3
5
4
0
0
7
0
0
6

[출력]
7
*/
import java.io.*;
import java.util.*;
public class Main10773 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack<Integer> stack = new Stack<>();
		
		int K = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < K; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				stack.pop();
			}
			else {
				stack.push(num);
			}
		}
		
		int count = 0;
		int length = stack.size();
		//pop하면 stack.size()가 실시간으로 바뀐다
		for(int i = 0; i < length; i++) {
			count += stack.pop();
		}	
		bw.write(count + "");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
