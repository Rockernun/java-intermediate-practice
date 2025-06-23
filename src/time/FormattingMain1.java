package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {

        // Formatting: 날짜를 문자로 바꾸기
        LocalDate date = LocalDate.of(2025, 1, 14);
        System.out.println("date = " + date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String formattedDate = date.format(formatter);
        System.out.println("포맷팅된 날짜: " + formattedDate);

        // Parsing: 문자를 날짜로 바꾸기
        String input = "2025년 01월 01일";
        LocalDate parsedDate = LocalDate.parse(input, formatter);
        System.out.println("문자열 파싱 날짜와 시간: " + parsedDate);
    }
}

/*
date = 2025-01-14
포맷팅된 날짜: 2025년 01월 14일
문자열 파싱 날짜와 시간: 2025-01-01
*/