package collection.link;

public class MyLinkedListV2Main {
    public static void main(String[] args) {

        MyLinkedListV2 list = new MyLinkedListV2();

        // 마지막에 추가 O(n)
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        // 첫 번째 항목에 추가 및 삭제
        System.out.println("첫 번째 항목에 추가");
        list.add(0, "d");
        System.out.println(list);

        System.out.println("첫 번째 항목을 삭제");
        list.remove(0);
        System.out.println(list);

        // 중간 위치에 추가, 삭제
        System.out.println("중간 위치에 추가");
        list.add(1, "e");
        System.out.println(list);

        System.out.println("중간 위치에서의 삭제");
        list.remove(1);
        System.out.println(list);

    }
}

/*
MyLinkedListV1{first=[a -> b -> c], size=3}

첫 번째 항목에 추가
MyLinkedListV1{first=[d -> a -> b -> c], size=3}

첫 번째 항목을 삭제
MyLinkedListV1{first=[a -> b -> c], size=2}

중간 위치에 추가
MyLinkedListV1{first=[a -> e -> b -> c], size=2}

중간 위치에서의 삭제
MyLinkedListV1{first=[a -> b -> c], size=1}
*/
