package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {

        // 생성
        Instant now = Instant.now();  // UTC 기준이므로 9시간 뺀 시각이 나온다.
        System.out.println("now: " + now);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        Instant from = Instant.from(zonedDateTime);
        System.out.println("from: " + from);

        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart = " + epochStart);

        // 계산
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);
        
        // 조회
        long laterEpochSecone = later.getEpochSecond();  // epoch로부터 흐른 시간
        System.out.println("laterEpochSecone = " + laterEpochSecone);
    }
}

/*
now: 2025-06-23T03:12:43.178686Z 
from: 2025-06-23T03:12:43.191816Z
epochStart = 1970-01-01T00:00:00Z
later = 1970-01-01T01:00:00Z
laterEpochSecone = 3600
*/
