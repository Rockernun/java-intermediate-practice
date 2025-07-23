package collection.iterable;

import java.util.*;

public class JavaIterableMain {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        printAll(list.iterator());
        printAll(set.iterator());

        forEach(list);
        forEach(set);

    }

    private static void printAll(Iterator<Integer> iterator) {
        System.out.println("iterator: " + iterator.getClass());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void forEach(Iterable<Integer> iterable) {
        System.out.println("iterable = " + iterable.getClass());
        for (Integer integer : iterable) {
            System.out.println(integer);
        }
    }
}

/*
iterator: class java.util.ArrayList$Itr
1
2
3

iterator: class java.util.HashMap$KeyIterator
1
2
3

iterable = class java.util.ArrayList
1
2
3

iterable = class java.util.HashSet
1
2
3
*/