package lang.object.equals;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        UserV2 user = (UserV2) obj; // obj에는 id 속성이 없기 때문에 다운 캐스팅 필요
        return id.equals(user.id);
    }
}