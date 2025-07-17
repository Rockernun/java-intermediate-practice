package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {
    public static void main(String[] args) {

        MyHashSetV2 set = new MyHashSetV2(10);
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");

        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));  // 참조값이 다르기 때문에 false를 반환

        set.add(m1);
        set.add(m2);
        System.out.println(set);  // 해시 인덱스가 같으니까 일단 같은 위치에 들어감.

        // 검색 실패
        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        System.out.println("searchValue의 hashCode(): " + searchValue.hashCode());  // 해시 코드도 같은데 왜 검색이 안 되지...?
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);

        // m1과 m2의 참조값은 엄연히 다른 것을 확인할 수 있다. (+searchValue도 다름)
        System.out.println("System.ref(m1) = " + System.identityHashCode(m1));
        System.out.println("System.ref(m2) = " + System.identityHashCode(m2));
        System.out.println("System.ref(searchValue) = " + System.identityHashCode(searchValue));
    }
}

/*
m1.hashCode() = 96
m2.hashCode() = 96
m1.equals(m2) = false

MyHashSetV2{buckets=[[], [], [], [], [], [], MemberOnlyHash{id='A'}, MemberOnlyHash{id='A'}, [], [], []], size=2, capacity=10}

searchValue의 hashCode(): 96

contains = false

System.ref(m1) = 357863579
System.ref(m2) = 1811044090
System.ref(searchValue) = 745160567
*/