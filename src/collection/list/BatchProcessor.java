package collection.list;

public class BatchProcessor {

    // private final MyArrayList<Integer> list = new MyArrayList<>();
    // private final MyLinkedList<Integer> list = new MyLinkedList<>();
    private final MyList<Integer> list;

    // 부모(MyList)는 자식(MyArrayList, MyLinkedList)을 담을 수 있다.
    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);  // 데이터를 맨 앞에 추가
        }

        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
