package collection.set.test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesTest3 {
    public static void main(String[] args) {

        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new TreeSet<>();

        for (Integer i : inputArr) {
            set.add(i);
        }

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

        System.out.println();
    }
}

/*
10
20
30
*/