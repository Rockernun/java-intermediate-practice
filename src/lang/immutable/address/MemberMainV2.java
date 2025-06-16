package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {

        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원A", address);
        MemberV2 memberB = new MemberV2("회원B", address);

        // 처음 회원A, 회원B의 주소는 모두 서울이다.
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        // 요구 사항 변경 (회원B의 주소가 부산으로 변경해야 함)
        // memberB.getAddress().setValue("부산"); // Cannot resolve method 'setValue' in 'ImmutableAddress'
        memberB.setAddress(new ImmutableAddress("부산"));
        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}

/*
memberA = MemberV1 [name=회원A, address=ImmutableAddress{value='서울'}]
memberB = MemberV1 [name=회원B, address=ImmutableAddress{value='서울'}]
부산 -> memberB.address
memberA = MemberV1 [name=회원A, address=ImmutableAddress{value='서울'}]
memberB = MemberV1 [name=회원B, address=ImmutableAddress{value='부산'}]
*/