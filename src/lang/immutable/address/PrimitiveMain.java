package lang.immutable.address;

public class PrimitiveMain {
    public static void main(String[] args) {

        // 기본형은 절대 같은 값을 공유하지 않는다.
        int a = 10;
        int b = a;
        System.out.println("a = " + a + ", b = " + b);

        b = 20;
        System.out.println("a = " + a + ", b = " + b);
    }
}

/*
a = 10, b = 10
a = 10, b = 20
*/