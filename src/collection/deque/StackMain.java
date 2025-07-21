package collection.deque;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        // 다음 꺼낼 요소를 확인(꺼내지는 않음)
        System.out.println("stack.peak(): " + stack.peek());

        // 스택 요소를 뽑고 반환
        System.out.println("stack.pop(): " + stack.pop());
        System.out.println("stack.pop(): " + stack.pop());
        System.out.println("stack.pop(): " + stack.pop());
        System.out.println(stack);

    }
}

/*
[1, 2, 3]
stack.peak(): 3
stack.pop(): 3
stack.pop(): 2
stack.pop(): 1
[]
*/