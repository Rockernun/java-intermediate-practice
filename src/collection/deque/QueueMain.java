package collection.deque;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();  // (권장 방법) 하지만, LinkedList를 사용해도 무방

        // 데이터 추가
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);

        // 다음 꺼낼 데이터를 확인(꺼내지는 않음)
        System.out.println("queue.peek(): " + queue.peek());

        // 데이터 꺼내기
        System.out.println("queue.poll(): " + queue.poll());
        System.out.println("queue.poll(): " + queue.poll());
        System.out.println("queue.poll(): " + queue.poll());
        System.out.println(queue);
    }
}

/*
[1, 2, 3]
queue.peek(): 1
queue.poll(): 1
queue.poll(): 2
queue.poll(): 3
[]
*/