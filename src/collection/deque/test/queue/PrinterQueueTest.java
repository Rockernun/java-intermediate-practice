package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class PrinterQueueTest {
    public static void main(String[] args) {

        Queue<String> printQueue = new ArrayDeque<>();

        printQueue.offer("문서1");
        printQueue.offer("문서2");
        printQueue.offer("문서3");

        System.out.println("출력: " + printQueue.poll());
        System.out.println("출력: " + printQueue.poll());
        System.out.println("출력: " + printQueue.poll());
    }
}

/*
출력: 문서1
출력: 문서2
출력: 문서3
*/