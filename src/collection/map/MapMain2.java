package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {

        Map<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("학생1", 90);
        System.out.println(studentMap);

        studentMap.put("학생1", 100);
        System.out.println(studentMap);

        // 특정 키값이 있냐?
        boolean containsKey = studentMap.containsKey("학생1");
        System.out.println("containsKey = " + containsKey);

        // 특정 학생 성적 삭제
        studentMap.remove("학생1");
        System.out.println(studentMap);
    }
}

/*
{학생1=90}
{학생1=100}
containsKey = true
{}
*/