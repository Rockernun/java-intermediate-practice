package time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeMain {
    public static void main(String[] args) {

        OffsetDateTime nowOffsetDateTime = OffsetDateTime.now();
        System.out.println("nowOffsetDateTime: " + nowOffsetDateTime);

        LocalDateTime localDateTime = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        System.out.println("localDateTime: " + localDateTime);

        // LocalDateTime에 OffsetDateTime, 즉 시간 차이에 대한 정보도 넣어줄 수 있다.
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, ZoneOffset.of("+01:00"));
        System.out.println("offsetDateTime = " + offsetDateTime);
    }
}

/*
nowOffsetDateTime: 2025-06-23T11:37:27.597426+09:00
localDateTime: 2030-01-01T13:30:50
offsetDateTime = 2030-01-01T13:30:50+01:00
*/