package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {

        // 객체 생성 시점에 T의 타입이 결정된다.
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        integerBox.set(10);
//        integerBox.set("문자");  // Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.get();  // Integer 타입 변환, 캐스팅 할 필요 없음.
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
        String string = stringBox.get();
        System.out.println("string = " + string);

        // 원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(3.14);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);

        // 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();
    }
}

/*
integer = 10
string = hello
doubleValue = 3.14
*/