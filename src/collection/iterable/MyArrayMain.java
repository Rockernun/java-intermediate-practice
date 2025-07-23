package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {

        MyArray myArr = new MyArray(new int[]{1, 2, 3, 4});

        Iterator<Integer> iterator = myArr.iterator();
        System.out.println("iterator 사용...");
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println("value = " + value);
        }

        System.out.println("for-each 사용");
        for (int value : myArr) {
            System.out.println("value = " + value);
        }
    }
}

/*
iterator 사용...
value = 1
value = 2
value = 3
value = 4

for-each 사용
value = 1
value = 2
value = 3
value = 4
*/