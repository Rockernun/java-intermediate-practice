package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {

        Address address = new Address("서울");

        // 회원A와 회원B는 같은 Address 인스턴스를 참조
        MemberV1 memberA = new MemberV1("회원A", address);
        MemberV1 memberB = new MemberV1("회원B", address);

        // 처음 회원A, 회원B의 주소는 모두 서울이다.
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        // 요구 사항 변경 (회원B의 주소가 부산으로 변경해야 함)
        memberB.getAddress().setValue("부산");
        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}

/*
memberA = MemberV1 [name=회원A, address=Address{value='서울'}]
memberB = MemberV1 [name=회원B, address=Address{value='서울'}]
부산 -> memberB.address
memberA = MemberV1 [name=회원A, address=Address{value='부산'}]
memberB = MemberV1 [name=회원B, address=Address{value='부산'}]
*/