package collection.set;

import java.util.Arrays;

public class HashStart4 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // [1, 2, 5, 8, 14, 99]를 입력값으로 받았다고 가정
        System.out.println("hashIndex(1): " + hashIndex(1));
        System.out.println("hashIndex(2): " + hashIndex(2));
        System.out.println("hashIndex(5): " + hashIndex(5));
        System.out.println("hashIndex(8): " + hashIndex(8));
        System.out.println("hashIndex(14): " + hashIndex(14));
        System.out.println("hashIndex(99): " + hashIndex(99));

        Integer[] arr = new Integer[CAPACITY];
        add(arr, 1);
        add(arr, 2);
        add(arr, 5);
        add(arr, 8);
        add(arr, 14);
        add(arr, 99);

        System.out.println("arr = " + Arrays.toString(arr));

        // 검색
        int searchValue = 14;
        int hashIndex = hashIndex(searchValue);
        Integer result = arr[hashIndex];
        System.out.println(result);

    }

    private static void add(Integer[] arr, int index) {
        int hashIndex = hashIndex(index);
        arr[hashIndex] = index;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}

/*

hashIndex(1): 1
hashIndex(2): 2
hashIndex(5): 5
hashIndex(8): 8
hashIndex(14): 4
hashIndex(99): 9
arr = [null, 1, 2, null, 14, 5, null, null, 8, 99]
14
*/