package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {

        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new String() == 비교: " + (str1 == str2));
        System.out.println("new String() equals 비교: " + (str1.equals(str2)));

        /*
        new String() == 비교: false
        new String() equals 비교: true
        */

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교: " + (str3 == str4));  // 다른 참조값 연산 아닌가? 왜 결과가 true지...?
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4)));

        /*
        리터럴 == 비교: true
        리터럴 equals 비교: true
        */

    }
}
