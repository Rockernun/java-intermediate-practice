package lang.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {

        int[] intArr = {-1, 0, 1, 2, 3};

        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));

        // -1을 찾은 경우와 찾는 수가 배열에 없는 경우, 반환되는 값이 같다...

    }

    private static int findValue(int[] arr, int target) {
        for (int i : arr) {
            if (i == target) {
                return i;
            }
        }

        // 반환 타입이 int, 즉 기본형이기 때문에 뭐라도 반환해야 한다.
        return -1;
    }
}

/*
-1
0
1
-1
*/