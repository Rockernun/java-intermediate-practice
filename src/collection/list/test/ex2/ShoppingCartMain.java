package collection.list.test.ex2;

public class ShoppingCartMain {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("맥북 프로", 3500000, 1);
        Item item2 = new Item("매직 트랙패드", 190000, 2);
        Item item3 = new Item("에어팟", 200000, 3);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        cart.displayItems();
    }
}

/*
장바구니 상품 출력...
상품명: 맥북 프로, 합계: 3500000원
상품명: 매직 트랙패드, 합계: 380000원
상품명: 에어팟, 합계: 600000원
전체 가격 합: 4480000원
*/