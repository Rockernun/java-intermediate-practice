package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {

        String strWithSpaces = "       Java Programming is awesome!   ";

        System.out.println("소문자로 변환: " + strWithSpaces.toLowerCase());
        System.out.println("대문자로 변환: " + strWithSpaces.toUpperCase());
        System.out.println("공백 제거(trim): '" + strWithSpaces.trim() + "'");
        System.out.println("공백 제거(strip): '" + strWithSpaces.strip() + "'");
        System.out.println("앞 공백 제거(strip): '" + strWithSpaces.stripLeading() + "'");
        System.out.println("뒤 공백 제거(strip): '" + strWithSpaces.stripTrailing() + "'");

    }
}

/*
소문자로 변환:        java programming is awesome!
대문자로 변환:        JAVA PROGRAMMING IS AWESOME!
공백 제거(trim): 'Java Programming is awesome!'
공백 제거(strip): 'Java Programming is awesome!'
앞 공백 제거(strip): 'Java Programming is awesome!   '
뒤 공백 제거(strip): '       Java Programming is awesome!'
*/
