package collection.list;

public class MyListPerformanceTest {
    public static void main(String[] args) {

        int size = 50_000;
        System.out.println("=== MyArrayList 추가 ===");
        addFirst(new MyArrayList<>(), size);
        addMiddle(new MyArrayList<>(), size);  // 찾는 과정은 O(1), 데이터를 추가하는데 밀어야 하므로 O(n)

        MyArrayList<Integer> arrayList = new MyArrayList<>();  // 조회용 데이터
        addLast(arrayList, size);  // 찾는 과정은 O(1), 데이터를 추가하는데 O(1)

        int loop = 10_000;  // 1만번을 돌면서 조회를 해보자.
        System.out.println("=== MyArrayList 조회 ===");
        getIndex(arrayList, loop, 0);  // 앞부분을 조회하는 경우
        getIndex(arrayList, loop, size / 2);  // 중간 부분을 조회하는 경우
        getIndex(arrayList, loop, size - 1);  // 마지막 부분을 조회하는 경우

        System.out.println("=== MyArrayList 검색 ===");
        search(arrayList, loop, 0);  // 앞부분에서 바로 찾음
        search(arrayList, loop, size / 2);  // 중간 부분에서 찾음
        search(arrayList, loop, size - 1);  // 가장 마지막에서 찾음

        System.out.println("=== MyLinkedList 추가 ===");
        addFirst(new MyLinkedList<>(), size);
        addMiddle(new MyLinkedList<>(), size);  // 찾는 과정은 O(n), 데이터를 추가하는데 O(1)

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();  // 조회용 데이터
        addLast(linkedList, size);  // 찾는 과정은 O(n), 데이터를 추가하는데 O(1)

        System.out.println("=== MyLinkedList 조회 =[]==");
        getIndex(linkedList, loop, 0);  // 앞부분을 조회하는 경우
        getIndex(linkedList, loop, size / 2);  // 중간 부분을 조회하는 경우
        getIndex(linkedList, loop, size - 1);  // 마지막 부분을 조회하는 경우

        System.out.println("== MyLinkedList 검색 ==");
        search(linkedList, loop, 0);  // 앞부분을 조회하는 경우
        search(linkedList, loop, size / 2);  // 중간 부분을 조회하는 경우
        search(linkedList, loop, size - 1);  // 마지막 부분을 조회하는 경우
    }

    private static void addFirst(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addMiddle(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i);  // 대략 중간 정도 위치에 데이터를 추가
        }

        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addLast(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void getIndex(MyList<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("인덱스: " + index + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void search(MyList<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("찾는 값: " + findValue + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}

/*
=== MyArrayList 추가 ===
앞에 추가 - 크기: 50000, 계산 시간: 1143ms
평균 추가 - 크기: 50000, 계산 시간: 517ms
뒤에 추가 - 크기: 50000, 계산 시간: 1ms

=== MyArrayList 조회 ===
인덱스: 0, 반복: 10000, 계산 시간: 0ms
인덱스: 25000, 반복: 10000, 계산 시간: 0ms
인덱스: 49999, 반복: 10000, 계산 시간: 0ms

=== MyArrayList 검색 ===
찾는 값: 0, 반복: 10000, 계산 시간: 0ms
찾는 값: 25000, 반복: 10000, 계산 시간: 104ms
찾는 값: 49999, 반복: 10000, 계산 시간: 195ms

=== MyLinkedList 추가 ===
앞에 추가 - 크기: 50000, 계산 시간: 3ms
평균 추가 - 크기: 50000, 계산 시간: 948ms
뒤에 추가 - 크기: 50000, 계산 시간: 1878ms

=== MyLinkedList 조회 ===
인덱스: 0, 반복: 10000, 계산 시간: 0ms
인덱스: 25000, 반복: 10000, 계산 시간: 376ms
인덱스: 49999, 반복: 10000, 계산 시간: 748ms

== MyLinkedList 검색 ==
찾는 값: 0, 반복: 10000, 계산 시간: 0ms
찾는 값: 25000, 반복: 10000, 계산 시간: 409ms
찾는 값: 49999, 반복: 10000, 계산 시간: 816ms
*/
