package collection.array;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {

        MyArrayListV3 numberList = new MyArrayListV3();

        // 숫자만 입력 하기를 기대함
        numberList.add(1);
        numberList.add(2);
        numberList.add("3");  // 실수로 문자를 입력
        System.out.println(numberList);

        // Object를 반환하기 때문에 다운 캐스팅 필요
        Integer num1 = (Integer) numberList.get(0);
        Integer num2 = (Integer) numberList.get(1);

        // ClassCaseException 발생, 문자를 Integer로 캐스팅
        Integer num3  = (Integer) numberList.get(2);

    }
}

/*
[1, 2, 3] size=3, capacity=5
Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
	at collection.array.MyArrayListV3BadMain.main(MyArrayListV3BadMain.java:19)
*/