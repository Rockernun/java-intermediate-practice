package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();
        deque.offerFirst(1);
        System.out.println(deque);
        deque.offerFirst(2);
        System.out.println(deque);
        deque.offerLast(3);
        System.out.println(deque);
        deque.offerLast(4);
        System.out.println(deque);

        // 다음 꺼낼 데이터 확인(꺼내지는 않음)
        System.out.println("deque.peekFirst() = " + deque.peekFirst());
        System.out.println("deque.peekLast() = " + deque.peekLast());

        // 데이터 꺼내기
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println("deque.pollLast() = " + deque.pollLast());
        System.out.println("deque.pollLast() = " + deque.pollLast());

        System.out.println(deque);

    }
}

/*
[1]
[2, 1]
[2, 1, 3]
[2, 1, 3, 4]
deque.peekFirst() = 2
deque.peekLast() = 4
deque.pollFirst() = 2
deque.pollFirst() = 1
deque.pollLast() = 4
deque.pollLast() = 3
[]
*/
