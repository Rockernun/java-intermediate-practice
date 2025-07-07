package collection.array;

public class MyArrayListV1Main {
    public static void main(String[] args) {

        MyArrayListV1 list = new MyArrayListV1();
        System.out.println("=== 데이터 추가 ===");
        System.out.println(list);

        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        System.out.println("=== 기능 사용 ===");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.indexOf('c') = " + list.indexOf("c"));
        System.out.println("list.set(2, 'z') = " + list.set(2, "z"));
        System.out.println(list);

        System.out.println("=== 범위 초과 ===");
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);
        list.add("f");  // 범위 초과(ArrayIndexOutOfBoundsException 예외 발생)
        System.out.println(list);
    }
}

/*
=== 데이터 추가 ===
[] size=0, capacity=5
[a] size=1, capacity=5
[a, b] size=2, capacity=5
[a, b, c] size=3, capacity=5
=== 기능 사용 ===
list.size() = 3
list.get(1) = b
list.indexOf('c') = 2
list.set(2, 'z') = c
[a, b, z] size=3, capacity=5
=== 범위 초과 ===
[a, b, z, d] size=4, capacity=5
[a, b, z, d, e] size=5, capacity=5
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	at collection.array.MyArrayListV1.add(MyArrayListV1.java:25)
	at collection.array.MyArrayListV1Main.main(MyArrayListV1Main.java:29)
*/