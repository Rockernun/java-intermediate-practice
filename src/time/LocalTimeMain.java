package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {

        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(19, 10, 30);

        System.out.println("현재 시각: " + nowTime);
        System.out.println("지정 시각: " + ofTime);

        // 계산(불변)
        LocalTime ofTimePlus = ofTime.plusHours(4);
        System.out.println("지정 시각 +4h: " + ofTimePlus);
    }
}
