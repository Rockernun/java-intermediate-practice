package collection.set;

public class MyHashSetV3Main {
    public static void main(String[] args) {

        MySet<String> strSet = new MyHashSetV3<>(10);
        strSet.add("A");
        strSet.add("B");
        strSet.add("C");
        System.out.println(strSet);

        // 검색
        String searchStringValue = "A";
        boolean strResult = strSet.contains(searchStringValue);
        System.out.println("strSet.contains(" + searchStringValue + ") = " + strResult);

        MySet<Integer> intSet = new MyHashSetV3<>(10);
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        System.out.println(intSet);

        Integer searchIntegerValue = 3;
        boolean intResult = intSet.contains(searchIntegerValue);
        System.out.println("intSet.contains(" + searchIntegerValue + ") = " + intResult);

    }
}

/*
MyHashSetV3{buckets=[[], [], [], [], [], [A], [B], [C], [], []], size=3, capacity=10}
strSet.contains(A) = true
MyHashSetV3{buckets=[[], [1], [2], [3], [4], [], [], [], [], []], size=4, capacity=10}
intSet.contains(3) = true
*/
