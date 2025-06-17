package lang.string.test;

public class TestString2 {
    public static void main(String[] args) {

        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int totalLength = 0;

        for (String s : arr) {
            totalLength += s.length();
            System.out.printf("%s:%d\n", s, s.length());
        }

        System.out.println("모든 문자열 길이의 합은: " + totalLength);
    }
}

/*
hello:5
java:4
jvm:3
spring:6
jpa:3
모든 문자열 길이의 합은: 21
*/