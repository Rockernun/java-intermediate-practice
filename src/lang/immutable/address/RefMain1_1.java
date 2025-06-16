package lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {

        // 이런 식으로 처음부터 다른 인스턴스를 참조하도록
        Address address1 = new Address("서울");
        Address address2 = new Address("서울");

        System.out.println("address1 = " + address1);
        System.out.println("address2 = " + address2);

        address2.setValue("부산");
        System.out.println("address1 = " + address1);
        System.out.println("address2 = " + address2);
    }
}

/*
address1 = Address{value='서울'}
address2 = Address{value='서울'}
address1 = Address{value='서울'}
address2 = Address{value='부산'}
*/