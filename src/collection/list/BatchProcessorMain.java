package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {

//        MyArrayList<Integer> list = new MyArrayList<>();
//        BatchProcessor processor = new BatchProcessor(list);  // 크기: 100000, 계산 시간: 4716ms

        MyLinkedList<Integer> list = new MyLinkedList<>();
        BatchProcessor processor = new BatchProcessor(list);  // 크기: 100000, 계산 시간: 2ms

        processor.logic(100_000);
    }
}
