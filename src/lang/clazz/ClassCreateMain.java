package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {

        // Class helloClass = Hello.class;
        Class helloClass = Class.forName("lang.clazz.Hello");
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();

        System.out.println("hello = " + hello);  // 객체 생성됨
        System.out.println("result = " + result);
    }
}

/*
hello = lang.clazz.Hello@a09ee92
result = Hello!
*/
