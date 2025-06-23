package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {

        // Formatting: 날짜와 시간를 문자로 바꾸기
        LocalDateTime now = LocalDateTime.of(2025, 1, 1, 00, 56, 30);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("날짜와 시간 포맷팅: " + formattedDateTime);

        // Parsing: 문자를 날짜와 시간으로 바꾸기
        String dateTimeString = "2025-01-14 11:01:00";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("문자열 파싱 날짜와 시간: " + parsedDateTime);
    }
}

/*
날짜와 시간 포맷팅: 2025-01-01 00:56:30
문자열 파싱 날짜와 시간: 2025-01-14T11:01
*/