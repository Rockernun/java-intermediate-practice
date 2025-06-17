package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {

        String str1 = "Hello, Java!";
        String str2 = "hello, java!";
        String str3 = "Hello, Spring!";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2));

        System.out.println("'b' compareTo 'a': " + "b".compareTo("a"));
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));  // 사전적으로 얼마나 차이나는가
        System.out.println("str1 compareToIgnoreCase str2: " + str1.compareToIgnoreCase(str2));
        System.out.println("str1 starts with 'Hello': " + str1.startsWith("Hello"));
        System.out.println("str1 ends with 'Java!': " + str1.endsWith("Java!"));
    }
}

/*
str1 equals str2: false
str1 equalsIgnoreCase str2: true
'b' compareTo 'a': 1
str1 compareTo str3: -9
str1 compareToIgnoreCase str2: 0
str1 starts with 'Hello': true
str1 ends with 'Java!': true
*/
