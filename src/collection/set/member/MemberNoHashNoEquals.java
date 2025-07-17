package collection.set.member;

// hashCode()와 equals() 구현 안 한 경우
// 자동으로 Object가 제공하는 hashCode()와 equals()를 사용한다.
public class MemberNoHashNoEquals {

    private String id;

    public MemberNoHashNoEquals(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MemberNoHashNoEquals{" +
                "id='" + id + '\'' +
                '}';
    }
}
