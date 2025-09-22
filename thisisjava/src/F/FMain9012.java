package F;

/*
괄호

[입력]
6
(())())
(((()())()
(()())((()))
((()()(()))(((())))()
()()()()(()()())()
(()((())()(

[출력]
NO
NO
YES
NO
YES
NO

[입력]
3
((
))
())(()

[출력]
NO
NO
NO
*/
import java.io.*;
import java.util.*;
public class FMain9012 {
	// 여는 괄호가 있을 때는 스택에 쌓고 닫는 괄호가 있으면 여는 괄호를 하나 지우면(pop) 된다.
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			String s = br.readLine();
			bw.write(isValid(s));
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
	public static String isValid(String s) {
		Stack<Character> stack = new Stack<>();
		int length = s.length();
		
		for(int i = 0; i < length; i++) {
			char ch = s.charAt(i);
			if(ch == '(') {
				stack.push(ch); //여는 괄호 저장
			}
			else if(stack.isEmpty()) {
				return "NO\n"; 
			}
			else {
				stack.pop();
			}
		}
		
		if(!stack.isEmpty()) {
			return "NO\n";
		}
		else {
			return "YES\n";
		}
	}

}
