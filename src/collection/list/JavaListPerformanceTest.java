package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class JavaListPerformanceTest {
    public static void main(String[] args) {

        int size = 50_000;
        System.out.println("=== ArrayList 추가 ===");
        addFirst(new ArrayList<>(), size);
        addMiddle(new ArrayList<>(), size);  // 찾는 과정은 O(1), 데이터를 추가하는데 밀어야 하므로 O(n)

        ArrayList<Integer> arrayList = new ArrayList<>();  // 조회용 데이터
        addLast(arrayList, size);  // 찾는 과정은 O(1), 데이터를 추가하는데 O(1)

        int loop = 10_000;  // 1만번을 돌면서 조회를 해보자.
        System.out.println("=== ArrayList 조회 ===");
        getIndex(arrayList, loop, 0);  // 앞부분을 조회하는 경우
        getIndex(arrayList, loop, size / 2);  // 중간 부분을 조회하는 경우
        getIndex(arrayList, loop, size - 1);  // 마지막 부분을 조회하는 경우

        System.out.println("=== ArrayList 검색 ===");
        search(arrayList, loop, 0);  // 앞부분에서 바로 찾음
        search(arrayList, loop, size / 2);  // 중간 부분에서 찾음
        search(arrayList, loop, size - 1);  // 가장 마지막에서 찾음

        System.out.println("=== LinkedList 추가 ===");
        addFirst(new LinkedList<>(), size);
        addMiddle(new LinkedList<>(), size);  // 찾는 과정은 O(n), 데이터를 추가하는데 O(1)

        LinkedList<Integer> linkedList = new LinkedList<>();  // 조회용 데이터
        addLast(linkedList, size);  // 찾는 과정은 O(1), 데이터를 추가하는데 O(1)

        System.out.println("=== LinkedList 조회 ===");
        getIndex(linkedList, loop, 0);  // 앞부분을 조회하는 경우
        getIndex(linkedList, loop, size / 2);  // 중간 부분을 조회하는 경우
        getIndex(linkedList, loop, size - 1);  // 마지막 부분을 조회하는 경우

        System.out.println("== LinkedList 검색 ==");
        search(linkedList, loop, 0);  // 앞부분을 조회하는 경우
        search(linkedList, loop, size / 2);  // 중간 부분을 조회하는 경우
        search(linkedList, loop, size - 1);  // 마지막 부분을 조회하는 경우
    }

    private static void addFirst(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addMiddle(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i);  // 대략 중간 정도 위치에 데이터를 추가
        }

        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addLast(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void getIndex(List<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("인덱스: " + index + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void search(List<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("찾는 값: " + findValue + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}

/*
=== ArrayList 추가 ===
앞에 추가 - 크기: 50000, 계산 시간: 108ms
평균 추가 - 크기: 50000, 계산 시간: 51ms
뒤에 추가 - 크기: 50000, 계산 시간: 1ms

=== ArrayList 조회 ===
인덱스: 0, 반복: 10000, 계산 시간: 0ms
인덱스: 25000, 반복: 10000, 계산 시간: 0ms
인덱스: 49999, 반복: 10000, 계산 시간: 0ms

=== ArrayList 검색 ===
찾는 값: 0, 반복: 10000, 계산 시간: 1ms
찾는 값: 25000, 반복: 10000, 계산 시간: 102ms
찾는 값: 49999, 반복: 10000, 계산 시간: 199ms

=== LinkedList 추가 ===
앞에 추가 - 크기: 50000, 계산 시간: 2ms
평균 추가 - 크기: 50000, 계산 시간: 944ms
뒤에 추가 - 크기: 50000, 계산 시간: 2ms

=== LinkedList 조회 ===
인덱스: 0, 반복: 10000, 계산 시간: 0ms
인덱스: 25000, 반복: 10000, 계산 시간: 377ms
인덱스: 49999, 반복: 10000, 계산 시간: 0ms

== LinkedList 검색 ==
찾는 값: 0, 반복: 10000, 계산 시간: 1ms
찾는 값: 25000, 반복: 10000, 계산 시간: 407ms
찾는 값: 49999, 반복: 10000, 계산 시간: 813ms
*/
