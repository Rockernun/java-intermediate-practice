package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력...");
        for (Item item : items) {
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice() + "원");
        }

        System.out.println("전체 가격 합: " + totalPrice(items) + "원");
    }

    private int totalPrice(List<Item> items) {
        int sum = 0;
        for (Item item : items) {
            sum += item.getTotalPrice();
        }

        return sum;
    }
}
