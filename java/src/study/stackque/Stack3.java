package study.stackque;

//"3 4 + 2 *"  ->  (3 + 4) * 2 = 14
import java.util.*;
public class Stack3 {

    public static void main(String[] args) {
    	
        System.out.println(evaluatePostfix("3 4 + 2 *")); // 14
        System.out.println(evaluatePostfix("5 1 2 + 4 * + 3 -")); // 14
        
    }
	public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        for (String token : expression.split(" ")) {
            if (token.matches("\\d+")) { // 숫자라면 스택에 push
                stack.push(Integer.parseInt(token)); //3 넣고 4 넣고
            } else { // 연산자라면 스택에서 두 개 꺼내서 계산
                int b = stack.pop(); //4
                int a = stack.pop(); //3

                switch (token) {
                //"+"이면 4와 3 더하고 7을 넣음
                //7넣으면 72 * 이렇게 되므로
                //7이랑 2 뺀걸 b와 a에 넣고
                //*을 7 * 2 해버린다
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                }
            }
        }

        return stack.pop(); // 최종 결과 반환
    }
}
