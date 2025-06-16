package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("아르", 4);
        Dog dog2 = new Dog("이브", 4);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

    }
}

/*
1. 단순 toString 호출
lang.object.tostring.Car@30f39991
강아지 이름: 아르, 나이: 4세
강아지 이름: 이브, 나이: 4세
2. println 내부에서 toString 호출
lang.object.tostring.Car@30f39991
강아지 이름: 아르, 나이: 4세
강아지 이름: 이브, 나이: 4세
3. Object 다형성 활용
--객체의 정보 출력-- lang.object.tostring.Car@30f39991
--객체의 정보 출력-- 강아지 이름: 아르, 나이: 4세
--객체의 정보 출력-- 강아지 이름: 이브, 나이: 4세
*/