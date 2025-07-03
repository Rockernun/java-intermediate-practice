package generic.test.ex4;

public class MethodMain1 {
    public static void main(String[] args) {

        Integer i = 10;
        Object object = GenericMethod.objectMethod(i);

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);  // 타입 인자는 생략 가능

        Integer integerValue = GenericMethod.<Integer>numberMethod(10);  // 타입 인자는 생략 가능
        Double doubleValue = GenericMethod.<Double>numberMethod(30.0);  // 타입 인자는 생략 가능

    }
}

/*
Object print: 10
명시적 타입 인자 전달
Object print: 10
result = 10
bound print: 10
bound print: 30.0
*/