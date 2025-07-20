package collection.set.javaset;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {

        run(new HashSet<>());
        run(new LinkedHashSet<>());
        run(new TreeSet<>());

    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();
    }
}

/*
set = class java.util.HashSet
A 1 B 2 C

set = class java.util.LinkedHashSet
C B A 1 2

set = class java.util.TreeSet
1 2 A B C
*/