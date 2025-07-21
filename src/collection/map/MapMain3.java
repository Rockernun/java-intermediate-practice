package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {
    public static void main(String[] args) {

        Map<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("학생1", 50);
        System.out.println(studentMap);

        // 학생이 없는 경우에만 추가
        if (!studentMap.containsKey("학생1")) {
            studentMap.put("학생1", 100);
        }

        System.out.println(studentMap);

        // 학생이 없는 경우에만 추가
        studentMap.putIfAbsent("학생1", 100);  // 학생1이라는 key가 없으면 100을 추가
        studentMap.putIfAbsent("학생2", 100);  // 학생2이라는 key가 없으면 100을 추가
        System.out.println(studentMap);
    }
}

/*
{학생1=50}
{학생1=50}
{학생1=50, 학생2=100}
*/