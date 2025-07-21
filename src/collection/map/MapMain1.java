package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {

        Map<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("학생1", 90);
        studentMap.put("학생2", 80);
        studentMap.put("학생3", 80);
        studentMap.put("학생4", 100);

        System.out.println(studentMap);

        // 특정 학생의 점수 조회
        Integer result = studentMap.get("학생3");
        System.out.println("result = " + result);

        System.out.println("=== keySet 활용 ===");
        Set<String> keySet = studentMap.keySet();
        for (String key : keySet) {
            Integer value = studentMap.get(key);
            System.out.println("key=" + key + ", value=" + value);
        }

        System.out.println("=== entrySet 활용 ===");
        Set<Map.Entry<String, Integer>> entrySet = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key=" + key + ", value=" + value);
        }

        System.out.println("=== values 활용 ===");
        Collection<Integer> values = studentMap.values();  // 중복이 될 수도 있기 때문에 Collection으로 반환
        for (Integer value : values) {
            System.out.println("value = " + value);
        }
    }
}

/*
{학생1=90, 학생2=80, 학생3=80, 학생4=100}
result = 80

=== keySet 활용 ===
key=학생1, value=90
key=학생2, value=80
key=학생3, value=80
key=학생4, value=100

=== entrySet 활용 ===
key=학생1, value=90
key=학생2, value=80
key=학생3, value=80
key=학생4, value=100

=== values 활용 ===
value = 90
value = 80
value = 80
value = 100
*/