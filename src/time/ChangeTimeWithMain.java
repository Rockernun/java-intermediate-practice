package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.of(2025, 1, 1, 0, 56, 30);
        System.out.println("dateTime = " + dateTime);

        LocalDateTime changeDateTime1 = dateTime.with(ChronoField.YEAR, 2025);
        System.out.println("changeDateTime1 = " + changeDateTime1);

        LocalDateTime changeDateTime2 = dateTime.withYear(2025);
        System.out.println("changeDateTime2 = " + changeDateTime2);

        // TemporalAdjuster 사용
        // 다음주 금요일을 어떻게 계산하지?
        LocalDateTime with1 = dateTime.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("기준 날짜: " + dateTime);
        System.out.println("다음 금요일 날짜: " + with1);

        // 이번 달의 마지막 일요일은?
        LocalDateTime with2 = dateTime.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println("같은 달의 마지막 일요일: " + with2);
    }
}

/*
dateTime = 2025-01-01T00:56:30
changeDateTime1 = 2025-01-01T00:56:30
changeDateTime2 = 2025-01-01T00:56:30
기준 날짜: 2025-01-01T00:56:30
다음 금요일 날짜: 2025-01-03T00:56:30
같은 달의 마지막 일요일: 2025-01-26T00:56:30
*/
