package exception.basic.unchecked;

public class UncheckedThrowMain {
    public static void main(String[] args) {

        Service service = new Service();
        service.callThrow();
        System.out.println("정상 종료");
    }
}

/*
Exception in thread "main" exception.basic.unchecked.MyUncheckedException: ex
	at exception.basic.unchecked.Client.call(Client.java:5)
	at exception.basic.unchecked.Service.callThrow(Service.java:24)
	at exception.basic.unchecked.UncheckedThrowMain.main(UncheckedThrowMain.java:7)

폭탄이 터졌는데, RuntimeException이네? 컴파일러가 체크하지 않는다.
체크는 하지 않지만, 폭탄은 터졌고 밖으로 빠져나온 것이다.
*/