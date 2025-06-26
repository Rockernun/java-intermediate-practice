package nested.test;

public class AnonymousMain {
    public static void main(String[] args) {

        Hello hello = new Hello() {
            @Override
            public void hello() {
                System.out.println("익명 클래스를 생성 후, hello() 호출");
            }
        };

        hello.hello();
    }
}

// 익명 클래스를 생성 후, hello() 호출