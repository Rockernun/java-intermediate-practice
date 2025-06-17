package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = " java";

        String result1 = str1.concat(str2);
        String result2 = str1 + str2;  // + 연산 허용(원칙적으로는 참조값끼리 연산 불가)
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}

/*
result1 = hello java
result2 = hello java
*/