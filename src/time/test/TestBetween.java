package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2025, 6, 23);
        LocalDate endDate = LocalDate.of(2025, 12, 25);

        Period period = Period.between(startDate, endDate);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("시작 날짜: " + startDate);
        System.out.println("목표 날짜: " + endDate);
        System.out.println("남은 기간: " + period.getYears() + "년 " + period.getMonths() + "개월 " + period.getDays() + "일 ");
        System.out.println("D-day: " + daysBetween + "일 남았습니다!");
    }
}

/*
시작 날짜: 2025-06-23
목표 날짜: 2025-12-25
남은 기간: 0년 6개월 2일
D-day: 185일 남았습니다!
*/
