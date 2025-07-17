package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {
    public static void main(String[] args) {

        MyHashSetV2 set = new MyHashSetV2(10);
        MemberNoHashNoEquals m1 = new MemberNoHashNoEquals("A");
        MemberNoHashNoEquals m2 = new MemberNoHashNoEquals("A");

        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set);  // Set 자료 구조인데 데이터가 중복으로 들어갔다...? 이미 망한 상황

        // 검색 실패
        MemberNoHashNoEquals searchValue = new MemberNoHashNoEquals("A");
        System.out.println("searchValue의 hashCode(): " + searchValue.hashCode());
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}

/*
m1.hashCode() = 1247233941
m2.hashCode() = 140435067
m1.equals(m2) = false
MyHashSetV2{buckets=[[], [MemberNoHashNoEquals{id='A'}], [], [], [], [], [], [MemberNoHashNoEquals{id='A'}], [], []], size=2, capacity=10}
searchValue의 hashCode(): 295530567
contains = false
*/