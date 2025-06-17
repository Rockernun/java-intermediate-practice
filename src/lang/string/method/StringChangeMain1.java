package lang.string.method;

public class StringChangeMain1 {
    public static void main(String[] args) {

        String str = "Hello, Java! Welcome to Java World";

        System.out.println("인덱스 7부터의 부분 문자열: " + str.substring(7));
        System.out.println("인덱스 7부터 12까지의 부분 문자열: " + str.substring(7, 12));
        System.out.println("문자열 결합: " + str.concat("~~~"));
        System.out.println("'Java'를 'Spring'으로 대체: " + str.replace("Java", "Spring"));
        System.out.println("첫 번째 'Java'를 'Mac'으로 대체: " + str.replaceFirst("Java", "Mac"));
    }
}

/*
인덱스 7부터의 부분 문자열: Java! Welcome to Java World
인덱스 7부터 12까지의 부분 문자열: Java!
문자열 결합: Hello, Java! Welcome to Java World~~~
'Java'를 'Spring'으로 대체: Hello, Spring! Welcome to Spring World
첫 번째 'Java'를 'Mac'으로 대체: Hello, Mac! Welcome to Java World
*/
