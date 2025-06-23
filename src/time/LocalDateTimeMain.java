package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {

        LocalDateTime nowDateTime = LocalDateTime.now();
        LocalDateTime ofDateTime = LocalDateTime.of(2025, 1, 1, 00, 56, 30);

        System.out.println("현재 날짜시각: " + nowDateTime);
        System.out.println("지정한 날짜시각: " + ofDateTime);

        // 날짜와 시각 분리
        LocalDate localDate = ofDateTime.toLocalDate();
        LocalTime localTime = ofDateTime.toLocalTime();
        System.out.println("localDate: " + localDate);
        System.out.println("localTime: " + localTime);

        // 날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime: " + localDateTime);

        // 계산(불변)
        LocalDateTime ofDateTimePlus = ofDateTime.plusDays(1000);
        System.out.println("지정 날짜시각 D+1000 = " + ofDateTimePlus);
        LocalDateTime ofDateTimePlus1Year = ofDateTime.plusYears(1);
        System.out.println("지정 날짜시각 D+365 = " + ofDateTimePlus1Year);

        // 비교
        System.out.println("현재 날짜시각이 지정 날짜시각보다 이전? " + nowDateTime.isBefore(ofDateTime));
        System.out.println("현재 날짜시각이 지정 날짜시각보다 이후? " + nowDateTime.isAfter(ofDateTime));
        System.out.println("현재 날짜시각이 지정 날짜시각과 같은가? " + nowDateTime.isEqual(ofDateTime));
    }
}
