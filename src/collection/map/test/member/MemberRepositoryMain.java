package collection.map.test.member;

public class MemberRepositoryMain {
    public static void main(String[] args) {

        Member member1 = new Member("rockernun", "회원1");
        Member member2 = new Member("exunsxo", "회원2");
        Member member3 = new Member("5mongking", "회원3");

        // 회원 저장
        MemberRepository repository = new MemberRepository();
        repository.save(member1);
        repository.save(member2);
        repository.save(member3);

        // 회원 조회
        Member findMember1 = repository.findById("rockernun");
        System.out.println("findMember1 = " + findMember1);

        Member findMember2 = repository.findByName("회원2");
        System.out.println("findMember2 = " + findMember2);

        // 회원 삭제
        repository.remove("rockernun");
        Member removedMember1 = repository.findById("rockernun");
        System.out.println("removedMember1 = " + removedMember1);
    }
}

/*
findMember1 = Member{id='rockernun', name='회원1'}
findMember2 = Member{id='exunsxo', name='회원2'}
removedMember1 = null
*/