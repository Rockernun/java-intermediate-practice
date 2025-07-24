package collection.compare;

import java.util.Arrays;

public class SortMain3 {
    public static void main(String[] args) {

        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        MyUser[] arr = {myUser1, myUser2, myUser3};
        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(arr));

        System.out.println("Comparable 기본 정렬");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // 아이디를 기준으로 추가 정렬
        System.out.println("IdComparator 정렬");
        Arrays.sort(arr, new IdComparator());
        System.out.println(Arrays.toString(arr));

        // 거꾸로 정렬
        System.out.println("IdComparator().reversed() 정렬");
        Arrays.sort(arr, new IdComparator().reversed());
        System.out.println(Arrays.toString(arr));
    }
}

/*
기본 데이터
[MyUser{id='a', age=30}, MyUser{id='b', age=20}, MyUser{id='c', age=10}]

Comparable 기본 정렬
[MyUser{id='c', age=10}, MyUser{id='b', age=20}, MyUser{id='a', age=30}]

IdComparator 정렬
[MyUser{id='a', age=30}, MyUser{id='b', age=20}, MyUser{id='c', age=10}]

IdComparator().reversed() 정렬
[MyUser{id='c', age=10}, MyUser{id='b', age=20}, MyUser{id='a', age=30}]
*/
