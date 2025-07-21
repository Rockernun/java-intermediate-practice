package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {

        String[][] productArr = {{"맥북", "3500000"}, {"아이패드", "1800000"}, {"에어팟", "250000"}};

        Map<String, Integer> productMap = new HashMap<>();
        for (String[] product : productArr) {
            productMap.put(product[0], Integer.valueOf(product[1]));
        }

        for (String s : productMap.keySet()) {
            System.out.println("제품: " + s + ", 가격: " + productMap.get(s));
        }
    }
}

/*
제품: 에어팟, 가격: 250000
제품: 아이패드, 가격: 1800000
제품: 맥북, 가격: 3500000
*/