package nested.test;

public class OuterClass3 {
    public void myMethod() {

        class LocalClass {
            public void helloMethod() {
                System.out.println("LocalClass.helloMethod");
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.helloMethod();
    }
}
