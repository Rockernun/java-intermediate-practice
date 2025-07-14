package collection.set;

import java.util.Arrays;

public class HastStart1 {
    public static void main(String[] args) {

        Integer[] arr = new Integer[4];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 5;
        arr[3] = 7;
        System.out.println("입력된 배열: " + Arrays.toString(arr));

        int searchValue = 7;
        for (Integer integer : arr) {
            if (integer == searchValue) {
                System.out.println(integer);
            }
        }
    }
}

/*
입력된 배열: [1, 3, 5, 7]
7
*/