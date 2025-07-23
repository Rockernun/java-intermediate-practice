package collection.iterable;

import java.util.Iterator;

// 배열을 반복할 수 있는 반복자를 만든다.
public class MyArrayIterator implements Iterator<Integer> {

    private int currentIndex = -1;  // 현재 인덱스
    private int[] targetArr;  // 순회할 대상 배열

    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    }

    // 다음 항목이 있는지 검사, 배열의 끝에 다다르면 false를 반환
    @Override
    public boolean hasNext() {
        return currentIndex < targetArr.length - 1;
    }

    // 현재 인덱스를 하나 증가하고 항목을 반환
    @Override
    public Integer next() {
        return targetArr[++currentIndex];
    }
}
