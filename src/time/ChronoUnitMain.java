package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {
    public static void main(String[] args) {

        ChronoUnit[] values = ChronoUnit.values();
        for (ChronoUnit value : values) {
            System.out.println("value = " + value);
        }

        System.out.println("HOURS = " + ChronoUnit.HOURS);
        System.out.println("HOURS.duration = " + ChronoUnit.HOURS.getDuration().getSeconds());
        System.out.println("DAYS = " + ChronoUnit.DAYS);
        System.out.println("DAYS.duration = " + ChronoUnit.DAYS.getDuration().getSeconds());

        // 차이 구하기
        LocalTime localTime1 = LocalTime.of(1, 10, 0);
        LocalTime localTime2 = LocalTime.of(2, 20, 30);

        long secondsBetween = ChronoUnit.SECONDS.between(localTime1, localTime2);
        System.out.println("secondsBetween = " + secondsBetween);

        long minutesBetween = ChronoUnit.MINUTES.between(localTime1, localTime2);
        System.out.println("minutesBetween = " + minutesBetween);
    }
}

/*
value = Nanos
value = Micros
value = Millis
value = Seconds
value = Minutes
value = Hours
value = HalfDays
value = Days
value = Weeks
value = Months
value = Years
value = Decades
value = Centuries
value = Millennia
value = Eras
value = Forever
HOURS = Hours
HOURS.duration = 3600
DAYS = Days
DAYS.duration = 86400
secondsBetween = 4230
minutesBetween = 70
*/
