package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {

        Integer i1 = Integer.valueOf(10);  // 숫자를 래퍼 객체로 변환 가능
        Integer i2 = Integer.valueOf("10");  // 문자열을 래퍼 객체로 변환하는 것도 가능
        int intValue = Integer.parseInt("10");

        // 비교
        int compareResult = i1.compareTo(20);  // 내 값이 더 작으니까 -1 출력
        System.out.println("compareResult = " + compareResult);

        // 산술 연산
        System.out.println("sum: " + Integer.sum(10, 20));
        System.out.println("min: " + Integer.min(10, 20));
        System.out.println("max: " + Integer.max(10, 20));
    }
}

/*
compareResult = -1
sum: 30
min: 10
max: 20
*/