package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {
    public static void main(String[] args) {

        // Object의 기본 해시 코드는 객체의 참조값을 기반으로 생성된다.
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashCode() = " + obj1.hashCode());  // 객체의 참조값이 반환됨
        System.out.println("obj2.hashCode() = " + obj2.hashCode());  // 객체의 참조값이 반환됨

        // 각 클래스마다 해시 코드를 오버라이딩 해 놓은 상태
        Integer i = 10;
        String str1 = "A";
        String str2 = "AB";
        System.out.println("정수 10의 hashCode: " + i.hashCode());
        System.out.println("문자 A의 hashCode: " + str1.hashCode());
        System.out.println("문자열 AB의 hashCode: " + str2.hashCode());

        // 해시 코드는 음수 값을 가질 수 있다.
        System.out.println("-1의 hashCode: " + Integer.valueOf(-1).hashCode());

        // 동일성/동등성 비교
        Member member1 = new Member("id1");
        Member member2 = new Member("id1");

        // equals 메서드와 해시 코드를 오버라이딩 하지 않은 경우와 그렇지 않은 경우를 비교
        System.out.println("(member1 == member2) = " + (member1 == member2));
        System.out.println("member1 equals member2 = " + (member1.equals(member2)));
        System.out.println("member1의 해시 코드: " + member1.hashCode());
        System.out.println("member2의 해시 코드: " + member2.hashCode());
    }
}

/*
obj1.hashCode() = 713338599
obj2.hashCode() = 1067040082

정수 10의 hashCode: 10
문자 A의 hashCode: 65
문자열 AB의 hashCode: 2081

-1의 hashCode: -1

(member1 == member2) = false
member1 equals member2 = true

member1의 해시 코드: 104054
member2의 해시 코드: 104054
*/
