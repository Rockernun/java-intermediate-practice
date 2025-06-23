package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        int minute = now.get(ChronoField.SECOND_OF_MINUTE);
        System.out.println("minute = " + minute);

        /*
        Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: SecondOfMinute
	    at java.base/java.time.LocalDate.get0(LocalDate.java:698)
	    at java.base/java.time.LocalDate.get(LocalDate.java:641)
	    at time.IsSupportedMain1.main(IsSupportedMain1.java:10)
        */

    }
}
