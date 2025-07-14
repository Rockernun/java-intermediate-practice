package collection.set;

import java.util.Arrays;

public class HastStart3 {
    public static void main(String[] args) {

        Integer[] arr = new Integer[100];
        arr[1] = 1;
        arr[3] = 3;
        arr[5] = 5;
        arr[7] = 7;
        arr[14] = 14;
        arr[98] = 98;
        System.out.println("입력된 배열: " + Arrays.toString(arr));

        int searchValue = 98;
        Integer result = arr[searchValue];  // O(1)
        System.out.println("result = " + result);
    }
}

/*
입력된 배열: [null, 1, null, 3, null, 5, null, 7, null, null]
result = 7
*/