package lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {

        String str = "100";

        // String에서 Integer로 변환
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        // Integer에서 int로 변환
        int intValue = integer1;
        System.out.println("intValue = " + intValue);

        // int에서 Integer로 변환
        Integer integer2 = intValue;
        System.out.println("integer2 = " + integer2);

    }
}

/*
integer1 = 100
intValue = 100
integer2 = 100
*/
