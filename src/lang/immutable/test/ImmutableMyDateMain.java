package lang.immutable.test;

public class ImmutableMyDateMain {
    public static void main(String[] args) {

        ImmutableMyDate date1 = new ImmutableMyDate(2025, 1, 1);
        ImmutableMyDate date2 = date1;

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("-- 2년 후로 변경 --");
        date2 = date2.changeYear(2027);

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("-- 11개월 후로 변경 --");
        date2 = date2.changeMonth(12);

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("-- 24일 후로 변경 --");
        date2 = date2.changeDay(25);

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}

/*
date1 = 2025-1-1
date2 = 2025-1-1
-- 2년 후로 변경 --
date1 = 2025-1-1
date2 = 2027-1-1
-- 11개월 후로 변경 --
date1 = 2025-1-1
date2 = 2027-12-1
-- 24일 후로 변경 --
date1 = 2025-1-1
date2 = 2027-12-25
*/