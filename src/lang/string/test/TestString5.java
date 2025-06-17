package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {

        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int startIndex = str.indexOf(key);
        int count = 0;

        while (startIndex >= 0) {
            startIndex = str.indexOf(key, startIndex + 1);
            count++;
        }

        System.out.println("count = " + count);

    }
}

// count = 3