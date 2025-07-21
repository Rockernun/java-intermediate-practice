package collection.map.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ItemPriceTest {
    public static void main(String[] args) {

        Map<String, Integer> itemMap = new HashMap<>();
        itemMap.put("뿌셔뿌셔", 500);
        itemMap.put("포카칩", 500);
        itemMap.put("스윙칩", 1000);
        itemMap.put("칙촉", 1000);

        Iterator<String> iterator = itemMap.keySet().iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (!itemMap.get(item).equals(1000)) {
                iterator.remove();
            }
        }

        System.out.println(itemMap.keySet());
    }
}

// [스윙칩, 칙촉]
