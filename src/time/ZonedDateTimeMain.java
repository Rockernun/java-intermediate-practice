package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {
    public static void main(String[] args) {

        ZonedDateTime nowZoneDateTime = ZonedDateTime.now();
        System.out.println("nowZoneDateTime = " + nowZoneDateTime);

        LocalDateTime localDateTime = LocalDateTime.of(2027, 1, 1, 13, 30, 50);
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(localDateTime, ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTime1 = " + zonedDateTime1);

        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(2030, 1, 1, 13, 30, 50, 0,
                ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTime2 = " + zonedDateTime2);

        ZonedDateTime utcZoneDateTime = zonedDateTime2.withZoneSameInstant(ZoneId.of("Asia/Seoul"));
        System.out.println("utcZoneDateTime = " + utcZoneDateTime);
    }
}

/*
nowZoneDateTime = 2025-06-23T11:32:37.275263+09:00[Asia/Seoul]
zonedDateTime1 = 2027-01-01T13:30:50+09:00[Asia/Seoul]
zonedDateTime2 = 2030-01-01T13:30:50+09:00[Asia/Seoul]
utcZoneDateTime = 2030-01-01T13:30:50+09:00[Asia/Seoul]
*/
