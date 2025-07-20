package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationTest {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);

        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);

        Set<Integer> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2);

        System.out.println("set1과 set2의 합집합: " + unionSet);
        System.out.println("set1과 set2의 교집합: " + intersectionSet);
        System.out.println("set1과 set2의 차집합: " + differenceSet);
    }
}

/*
set1과 set2의 합집합: [1, 2, 3, 4, 5, 6, 7]
set1과 set2의 교집합: [3, 4, 5]
set1과 set2의 차집합: [1, 2]
*/