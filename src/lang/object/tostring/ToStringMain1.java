package lang.object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        System.out.println("toString 메서드 출력값: " + string);
        System.out.println("object의 참조값 출력: " + object);
    }
}

/*
toString 메서드 출력값: java.lang.Object@2a84aee7
object의 참조값 출력: java.lang.Object@2a84aee7
*/