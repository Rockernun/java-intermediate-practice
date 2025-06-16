package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {

        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        // 참조가 다름
        System.out.println("Identity: " + (user1 == user2));

        // 논리적으로는 같다면서 왜 false가 나오지..?
        System.out.println("Equality: " + user1.equals(user2));
    }
}

/*

Identity: false
Equality: false
*/