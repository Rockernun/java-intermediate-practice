package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // [1, 2, 5, 8, 14, 99]를 입력값으로 받았다고 가정
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];  // LinkedList를 넣을 수 있는 배열 생성
        System.out.println("buckets = " + Arrays.toString(buckets));
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }

        System.out.println("buckets = " + Arrays.toString(buckets));

        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9);  // 충돌 발생
        System.out.println("buckets = " + Arrays.toString(buckets));

        // 검색
        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("buckets.contains(" + searchValue + ") = " + contains);
    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];  // O(1)
        if (!bucket.contains(value)) {  // 중복 체크: O(n) 소요
            bucket.add(value);
        }
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];  // O(1)
        return bucket.contains(searchValue);  // O(n)
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }

}

/*
buckets = [null, null, null, null, null, null, null, null, null, null]
buckets = [[], [], [], [], [], [], [], [], [], []]
buckets = [[], [1], [2], [], [14], [5], [], [], [8], [99, 9]]
buckets.contains(9) = true
*/