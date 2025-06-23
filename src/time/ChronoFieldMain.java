package time;

import java.time.temporal.ChronoField;

public class ChronoFieldMain {
    public static void main(String[] args) {

        ChronoField[] values = ChronoField.values();
        for (ChronoField value : values) {
            System.out.println(value + ", range = " + value.range());
        }

        System.out.println("MONTH_OF_YEAR.range() = " + ChronoField.MONTH_OF_YEAR.range());
        System.out.println("DAY_OF_MONTH.range() = " + ChronoField.DAY_OF_MONTH.range());
    }
}

/*
NanoOfSecond, range = 0 - 999999999
NanoOfDay, range = 0 - 86399999999999
MicroOfSecond, range = 0 - 999999
MicroOfDay, range = 0 - 86399999999
MilliOfSecond, range = 0 - 999
MilliOfDay, range = 0 - 86399999
SecondOfMinute, range = 0 - 59
SecondOfDay, range = 0 - 86399
MinuteOfHour, range = 0 - 59
MinuteOfDay, range = 0 - 1439
HourOfAmPm, range = 0 - 11
ClockHourOfAmPm, range = 1 - 12
HourOfDay, range = 0 - 23
ClockHourOfDay, range = 1 - 24
AmPmOfDay, range = 0 - 1
DayOfWeek, range = 1 - 7
AlignedDayOfWeekInMonth, range = 1 - 7
AlignedDayOfWeekInYear, range = 1 - 7
DayOfMonth, range = 1 - 28/31
DayOfYear, range = 1 - 365/366
EpochDay, range = -365243219162 - 365241780471
AlignedWeekOfMonth, range = 1 - 4/5
AlignedWeekOfYear, range = 1 - 53
MonthOfYear, range = 1 - 12
ProlepticMonth, range = -11999999988 - 11999999999
YearOfEra, range = 1 - 999999999/1000000000
Year, range = -999999999 - 999999999
Era, range = 0 - 1
InstantSeconds, range = -9223372036854775808 - 9223372036854775807
OffsetSeconds, range = -64800 - 64800
MONTH_OF_YEAR.range() = 1 - 12
DAY_OF_MONTH.range() = 1 - 28/31
*/