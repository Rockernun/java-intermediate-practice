package lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {

        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교1: " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2: " + isSame(str3, str4));
    }

    private static boolean isSame(String str1, String str2) {
        // return str1 == str2;
        return str1.equals(str2);
    }
}

/*
str1 == str2일 경우
메서드 호출 비교1: false
메서드 호출 비교2: true

str1.equals(str2)일 경우
메서드 호출 비교1: true
메서드 호출 비교2: true
*/
