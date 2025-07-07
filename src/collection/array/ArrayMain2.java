package collection.array;

import java.util.Arrays;

public class ArrayMain2 {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

        // 배열의 첫번째 위치에 값을 추가
        System.out.println("배열의 첫번째 위치에 3을 추가: O(n)");
        int newValue = 3;
        addFirst(arr, newValue);
        System.out.println(Arrays.toString(arr));

        // 인덱스 위치에 추가
        System.out.println("배열의 2번 인덱스 위치에 4 추가: O(n)");
        int index = 2;
        int value = 4;
        addAtIndex(arr, 2, 4);
        System.out.println(Arrays.toString(arr));

        // 배열의 마지막에 값 추가
        System.out.println("배열의 마지막 위치에 5 추가: O(1)");
        addLast(arr, 5);
        System.out.println(Arrays.toString(arr));
    }

    private static void addFirst(int[] arr, int newValue) {
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];  // 왼쪽에 있는 값을 오른쪽에 넣기
        }

        arr[0] = newValue;
    }

    private static void addAtIndex(int[] arr, int index, int newValue) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = newValue;
    }

    private static void addLast(int[] arr, int newValue) {
        arr[arr.length - 1] = newValue;
    }
}

/*
[1, 2, 0, 0, 0]
배열의 첫번째 위치에 3을 추가: O(n)
[3, 1, 2, 0, 0]
배열의 2번 인덱스 위치에 4 추가: O(n)
[3, 1, 4, 2, 0]
배열의 마지막 위치에 5 추가: O(1)
[3, 1, 4, 2, 5]
*/