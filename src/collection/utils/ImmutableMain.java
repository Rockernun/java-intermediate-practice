package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {

        // 불변 리스트 생성
        List<Integer> list = List.of(1, 2, 3);

        // 가변 리스트로 변경
        ArrayList<Integer> mutableList =  new ArrayList<>(list);
        mutableList.add(4);
        System.out.println("mutableList = " + mutableList);
        System.out.println("mutableList class = " + mutableList.getClass());

        // 다시 불변 리스트로 변경
        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
//        unmodifiableList.add(5);  // java.lang.UnsupportedOperationException 예외 발생
        System.out.println("unmodifiableList class = " + unmodifiableList.getClass());
    }
}

/*
mutableList = [1, 2, 3, 4]
mutableList class = class java.util.ArrayList
unmodifiableList class = class java.util.Collections$UnmodifiableRandomAccessList
*/