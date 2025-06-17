package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {

        int number = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        // valueOf 메서드
        String numString = String.valueOf(number);
        System.out.println("숫자의 문자열 값 " + numString);

        String boolString = String.valueOf(bool);
        System.out.println("불리언의 문자열 값: " + boolString);

        String objString = String.valueOf(obj);
        System.out.println("객체의 문자열 값: " + objString);

        // 아래와 같이 간단히 변환할 수 있음
        String numString2 = "" + number;
        System.out.println("빈 문자열 + number: " + numString2);

        // toCharArray 메서드
        char[] strCharArray = str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환: " + strCharArray);
        for (char c : strCharArray) {
            System.out.print(c);
        }

        System.out.println();
    }
}

/*
숫자의 문자열 값 100
불리언의 문자열 값: true
객체의 문자열 값: java.lang.Object@2a84aee7
빈 문자열 + number: 100
문자열을 문자 배열로 변환: [C@a09ee92
Hello, Java!
*/