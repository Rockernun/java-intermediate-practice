package collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {

        MyArrayListV3 list = new MyArrayListV3();

        // 마지막에 추가
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        // 원하는 위치에 추가
        System.out.println("addLast");
        list.add(3, "addList");  // O(1)
        System.out.println(list);

        System.out.println("addFirst");
        list.add(0, "addFirst");
        System.out.println(list);

        // 삭제
        Object removed1 = list.remove(4);
        System.out.println("removed(4) = " + removed1);
        System.out.println(list);

        Object removed2 = list.remove(0);  // 첫번째 인덱스 삭제 시: O(n)
        System.out.println("remove(0) = " + removed2);
        System.out.println(list);
    }
}

/*
[a, b, c] size=3, capacity=5
addLast
[a, b, c, addList] size=4, capacity=5
addFirst
[addFirst, a, b, c, addList] size=5, capacity=5
removed(4) = addList
[addFirst, a, b, c] size=4, capacity=5
remove(0) = addFirst
[a, b, c] size=3, capacity=5
*/
