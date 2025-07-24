package collection.compare;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortMain4 {
    public static void main(String[] args) {

        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        List<MyUser> list = new LinkedList<>();
        list.add(myUser1);
        list.add(myUser2);
        list.add(myUser3);
        System.out.println("기본 데이터");
        System.out.println(list);

        System.out.println("Comparable 기본 정렬");
        list.sort(null);  // 현재 정렬 기준이 없음 (권장 방식)
//        Collections.sort(list);  // 이런 식으로 해도 가능
        System.out.println(list);

        System.out.println("IdComparator 정렬");
        list.sort(new IdComparator());  // 정렬 기준이 아이디 (권장 방식)
//        Collections.sort(list, new IdComparator());  // 이런 식으로 해도 가능
        System.out.println(list);
    }
}

/*
기본 데이터
[MyUser{id='a', age=30}, MyUser{id='b', age=20}, MyUser{id='c', age=10}]

Comparable 기본 정렬
[MyUser{id='c', age=10}, MyUser{id='b', age=20}, MyUser{id='a', age=30}]

IdComparator 정렬
[MyUser{id='a', age=30}, MyUser{id='b', age=20}, MyUser{id='c', age=10}]
*/
