package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {

        ImmutableAddress address1 = new ImmutableAddress("서울");
        ImmutableAddress address2 = address1;

        System.out.println("address1 = " + address1);
        System.out.println("address2 = " + address2);

        // address2.setValue("부산");  // 컴파일 오류 발생
        address2 = new ImmutableAddress("부산");
        System.out.println("address1 = " + address1);
        System.out.println("address2 = " + address2);
    }
}

/*
address1 = ImmutableAddress{value='서울'}
address2 = ImmutableAddress{value='서울'}
address1 = ImmutableAddress{value='서울'}
address2 = ImmutableAddress{value='부산'}
*/
