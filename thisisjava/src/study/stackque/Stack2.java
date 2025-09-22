package study.stackque;

//문자열 검증(올바른 괄호인지 확인)
import java.util.*;
public class Stack2 {
	
	 public static boolean isValid(String s) {
		 
	        Stack<Character> stack = new Stack<>();

	        for (char ch : s.toCharArray()) {
	            if (ch == '(' || ch == '{' || ch == '[') {
	                stack.push(ch); // 여는 괄호 저장
	            } else {
	                if (stack.isEmpty()) return false;
	                char top = stack.pop();

	                // 괄호가 짝을 이루는지 확인
	                if ((ch == ')' && top != '(') ||
	                    (ch == '}' && top != '{') ||
	                    (ch == ']' && top != '[')) {
	                    return false;
	                }
	            }
	        }

	        return stack.isEmpty(); // 스택이 비어 있으면 올바른 괄호
	    }

	    public static void main(String[] args) {
	        System.out.println(isValid("(){}[]")); // true
	        System.out.println(isValid("({[)]}")); // false
	    }
}
