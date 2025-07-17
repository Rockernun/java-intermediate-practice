package collection.set;

import collection.set.member.Member;

public class MyHashSetV2Main2 {
    public static void main(String[] args) {

        MyHashSetV2 set  = new MyHashSetV2(10);
        Member hi  = new Member("hi");
        Member java = new Member("java");
        Member spring = new Member("spring");
        Member jpa = new Member("JPA");

        System.out.println("hi의 해시 코드: " + hi.hashCode());
        System.out.println("java 해시 코드: " + java.hashCode());
        System.out.println("spring의 해시 코드: " + spring.hashCode());
        System.out.println("jpa의 해시 코드: " +jpa.hashCode());

        set.add(hi);
        set.add(java);
        set.add(spring);
        set.add(jpa);
        System.out.println(set);

        // 검색
        Member searchValue = new Member("JPA");
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);
    }
}

/*
hi의 해시 코드: 3360
java 해시 코드: 3254849
spring의 해시 코드: -895679956
jpa의 해시 코드: 73690
MyHashSetV2{buckets=[[Member{id='hi'}, Member{id='JPA'}], [], [], [], [], [], [Member{id='spring'}], [], [], [Member{id='java'}]], size=4, capacity=10}
set.contains(Member{id='JPA'}) = true
*/
