package time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.of(2025, 1, 1, 0, 56, 30);
        System.out.println("dateTime: " + dateTime);

        // 10년 추가
        LocalDateTime plusDateTime1 = dateTime.plus(10, ChronoUnit.YEARS);
        System.out.println("plusDateTime1 = " + plusDateTime1);

        LocalDateTime plusDateTime2 = dateTime.plusYears(10);
        System.out.println("plusDateTime2 = " + plusDateTime2);

        Period period = Period.ofYears(10);
        LocalDateTime plusDateTime3 = dateTime.plus(period);
        System.out.println("plusDateTime3 = " + plusDateTime3);
    }
}
