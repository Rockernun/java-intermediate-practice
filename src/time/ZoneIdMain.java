package time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {
    public static void main(String[] args) {

        // Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();  // 이용 가능한 zone ID에 대한 정보를 얻을 수 있다.
        for (String availableZondId : ZoneId.getAvailableZoneIds()) {
//            System.out.println("availableZondId = " + availableZondId);
//            ZoneId.of("Asia/Seoul");
            ZoneId zoneId = ZoneId.of(availableZondId);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZoneId.systemDefault = " + zoneId);
    }
}
