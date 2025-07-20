package collection.set.test;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueNamesTest2 {
    public static void main(String[] args) {

        Integer[] inputArr = {30, 20, 20, 10, 10};

        Set<Integer> set = new LinkedHashSet<>();
        for (Integer i : inputArr) {
            set.add(i);
        }

        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}

/*
30
20
10
*/
