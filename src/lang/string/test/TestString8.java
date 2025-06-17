package lang.string.test;

public class TestString8 {
    public static void main(String[] args) {

        String email = "hello@example.com";
        String[] part = email.split("@");

        System.out.println("ID: " + part[0]);
        System.out.println("Domain: " + part[1]);
    }
}

/*
ID: hello
Domain: example.com
*/