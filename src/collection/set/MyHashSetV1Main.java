package collection.set;

public class MyHashSetV1Main {
    public static void main(String[] args) {

        MyHashSetV1 set = new MyHashSetV1();
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9);  // 해시 인덱스 중복
        System.out.println(set);

        // 검색
        int searchValue = 9;
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);

        // 삭제
        boolean removeResult = set.remove(searchValue);
        System.out.println("removeResult = " + removeResult);
        System.out.println(set);

    }
}

/*
MyHashSetV1{buckets=[[], [1], [2], [99], [], [5], [], [], [8], [9], [], [], [], [], [14], []], size=7}
set.contains(9) = true
removeResult = true
MyHashSetV1{buckets=[[], [1], [2], [99], [], [5], [], [], [8], [], [], [], [], [], [14], []], size=6}
*/