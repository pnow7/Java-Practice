package F;
/*
-괄호 짝 이루기(균형잡힌 세상)
[입력]
So when I die (the [first] I will see in (heaven) is a score list).
[ first in ] ( first out ).
Half Moon tonight (At least it is better than no Moon at all].
A rope may form )( a trail in a maze.
Help( I[m being held prisoner in a fortune cookie factory)].
([ (([( [ ] ) ( ) (( ))] )) ]).
 .
.

([)]
[출력]
yes
yes
no
no
no
yes
yes
*/

import java.io.*;
import java.util.*;
public class FMain4949 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String s = br.readLine();
			if(s.equals(".")) {
				break;
			}
			bw.write(isValid(s)+"\n");
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
			if(ch == '(' || ch == '[') {
				stack.push(ch); 
			}
			else if(ch == ')') {
				if(stack.isEmpty() || stack.peek() != '(') {
					return "no";
				}
				else {
					stack.pop();
				}
			}
			else if(ch == ']') {
				//(the [first] I will see in (heaven) is a score list)인경우
				//stack.push로 ( [ 넣고 
				//stack.peek이 [니까
				//[를 뽑고
				//(이 남음
				
				
				//(heaven)
				//(이 남아있음
				//(heaven)에서 (이기때문에 stack.push로 (넣음
				//stack에 ((있고 )만남
				//stack.peek 했을때 (이 되기때문에
				//stack에서는 ((에서 stack.pop을 하기때문에 (만 남음
				//list)인경우
				//)만나서 stack.pop을 해서 stack에서는 아무것도 남지않음
				
				//아무것도 만나지않으면 return "yes"출력
				if(stack.isEmpty() || stack.peek() != '[') {
					return "no";
				}
				else {
					stack.pop();
				}
			}
			
		}
		
		//.이 있는경우는 stack.isEmpty니까 	
		if(stack.isEmpty()) {
			return "yes";
		}
		else {
			return "no";
		}
	}

}
