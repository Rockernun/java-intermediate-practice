package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {

        LocalDate nowDate = LocalDate.now();  // 현재 날짜
        System.out.println("오늘 날짜는 " + nowDate);

        LocalDate ofDate = LocalDate.of(2025, 1, 1);
        System.out.println("지정한 날짜를 출력: " + ofDate);

//        // 계산도 가능(불변인 점을 주의 -> 반환값을 받아야 함)
//        ofDate.plusDays(10);
//        System.out.println("지정한 날짜 D+13 = " + ofDate);  // 지정한 날짜 D+10 = 2025-01-01

        ofDate = ofDate.plusDays(13);
        System.out.println("지정한 날짜 D+13 = " + ofDate);
    }
}

/*
오늘 날짜는 2025-06-23
지정한 날짜를 출력: 2025-01-01
지정한 날짜 D+13 = 2025-01-14
*/
