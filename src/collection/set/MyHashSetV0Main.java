package collection.set;

public class MyHashSetV0Main {
    public static void main(String[] args) {

        MyHashSetV0 set = new MyHashSetV0();
        set.add(1);  // O(1)
        set.add(2);  // O(n)
        set.add(3);  // O(n)
        set.add(4);  // O(n)
        set.add(5);  // O(n)
        System.out.println(set);

        boolean result = set.add(4);
        System.out.println("중복 데이터 저장 결과: " + result);
        System.out.println(set);

        System.out.println("set.contains(2): " + set.contains(2));  // O(n)
        System.out.println("set.contains(100): "+ set.contains(100));  // O(n)
    }
}

/*
MyHashSetV0{elementData=[1, 2, 3, 4, 5], size=5}
중복 데이터 저장 결과: false
MyHashSetV0{elementData=[1, 2, 3, 4, 5], size=5}
set.contains(2): true
set.contains(100): false
*/