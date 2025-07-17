package collection.set;

public class MyHashSetV2Main1 {
    public static void main(String[] args) {

        MyHashSetV2 set = new MyHashSetV2(10);
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("AB");
        set.add("SET");
        System.out.println(set);

        System.out.println("A의 해시 코드: " + "A".hashCode());
        System.out.println("B의 해시 코드: " + "B".hashCode());
        System.out.println("AB의 해시 코드: " + "AB".hashCode());
        System.out.println("SET의 해시 코드: " + "SET".hashCode());

        // 검색
        String searchValue = "SET";
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + "): " + result);
    }
}

/*
MyHashSetV2{buckets=[[], [AB], [], [], [], [A], [B, SET], [C], [D], []], size=6, capacity=10}
A의 해시 코드: 65
B의 해시 코드: 66
AB의 해시 코드: 2081
SET의 해시 코드: 81986
set.contains(SET): true
*/