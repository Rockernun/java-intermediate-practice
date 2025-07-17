package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain3 {
    public static void main(String[] args) {

        // 중복 등록 되지 않음
        MyHashSetV2 set = new MyHashSetV2(10);
        Member m1 = new Member("A");
        Member m2 = new Member("A");

        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        // 검색 성공
        Member searchValue = new Member("A");
        System.out.println("searchValue의 hashCode(): " + searchValue.hashCode());  // 해시 코드도 같은데 왜 검색이 안 되지...?
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}

/*
m1.hashCode() = 96
m2.hashCode() = 96

m1.equals(m2) = true

MyHashSetV2{buckets=[[], [], [], [], [], [], [Member{id='A'}], [], [], []], size=1, capacity=10}

searchValue의 hashCode(): 96

contains = true
*/