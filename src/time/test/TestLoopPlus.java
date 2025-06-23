package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2025, 1, 1);
        for (int i = 0; i < 5; i++) {
            LocalDate nextDate = startDate.plus(2 * i, ChronoUnit.WEEKS);
            System.out.println("날짜 " + (i + 1) + ": " + nextDate);
        }
    }
}

/*
날짜 1: 2025-01-01
날짜 2: 2025-01-15
날짜 3: 2025-01-29
날짜 4: 2025-02-12
날짜 5: 2025-02-26
*/