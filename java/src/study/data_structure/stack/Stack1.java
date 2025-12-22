package study.data_structure.stack;

import java.util.*;
public class Stack1 {
	
	public static void main(String[] args) {
		
        Stack<Integer> stack = new Stack<>();

        // push(x): 요소 추가
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack); // [10, 20, 30]

        // pop(): 맨 뒤 요소 뽑음(뽑으)
        int top = stack.pop();
        System.out.println("pop(): " + top); // 30
        System.out.println("Stack after pop: " + stack); // [10, 20]

        // peek(): 맨 뒤 요소 조회(조회)
        System.out.println("peek(): " + stack.peek()); // 20

        // isEmpty(): 스택이 비어 있는지 확인
        System.out.println("isEmpty(): " + stack.isEmpty()); // false

        // size(): 스택 크기 확인
        System.out.println("size(): " + stack.size()); // 2
    }
}
