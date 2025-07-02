package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {

        ObjectBox integerBox = new ObjectBox();
        integerBox.setValue(10);
        Integer integer = (Integer) integerBox.getValue();
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.setValue("hello");
        String string = (String) stringBox.getValue();
        System.out.println("string = " + string);

        // 잘못된 타입의 인수 전달
        integerBox.setValue("문자를 넣는다면...?");
        Integer result = (Integer) integerBox.getValue();
        System.out.println("result = " + result);
    }
}

/*
integer = 10
string = hello
Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer
(java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
	at generic.ex1.BoxMain2.main(BoxMain2.java:18)
*/