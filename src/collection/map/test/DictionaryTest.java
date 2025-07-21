package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {

        Map<String, String> dictionary = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("== 단어 입력 단계 ==");
        while (true) {
            System.out.print("영어 단어를 입력하세요. (종료는 'q'): ");
            String word = sc.nextLine();
            if (word.equals("q")) break;

            System.out.print("뜻을 입력하세요: ");
            String mean = sc.nextLine();

            dictionary.put(word, mean);
        }

        System.out.println("== 단어 검색 단계 ==");
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요. (종료는 'q'): ");
            String word = sc.nextLine();
            if (word.equals("q")) break;

            if (dictionary.containsKey(word)) {
                System.out.println(word + "의 뜻: " + dictionary.get(word));
            }
        }
    }
}

/*
== 단어 입력 단계 ==
영어 단어를 입력하세요. (종료는 'q'): apple
뜻을 입력하세요: 사과
영어 단어를 입력하세요. (종료는 'q'): banana
뜻을 입력하세요: 바나나
영어 단어를 입력하세요. (종료는 'q'): q

== 단어 검색 단계 ==
찾을 영어 단어를 입력하세요. (종료는 'q'): apple
apple의 뜻: 사과
찾을 영어 단어를 입력하세요. (종료는 'q'): banana
banana의 뜻: 바나나
찾을 영어 단어를 입력하세요. (종료는 'q'): q
*/