package enumeration.ref3;

public class EnumRefMain3_2 {
    public static void main(String[] args) {

        int price = 10000;

        System.out.println("BASIC 등급의 할인 금액: " + Grade.BASIC.discount(price));
        System.out.println("GOLD 등급의 할인 금액: " + Grade.GOLD.discount(price));
        System.out.println("DIAMOND 등급의 할인 금액: " + Grade.DIAMOND.discount(price));
    }
}

/*
BASIC 등급의 할인 금액: 1000
GOLD 등급의 할인 금액: 2000
DIAMOND 등급의 할인 금액: 3000
VIP 등급의 할인 금액: 4000
*/