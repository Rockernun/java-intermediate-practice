package nested.anonymous.ex;

public class Ex0RefMain {
    public static void main(String[] args) {
        print("Java");
        print("Spring");
    }

    public static void print(String text) {
        System.out.println("프로그램 시작!");
        System.out.println("Hello, " + text + "~");
        System.out.println("프로그램 종료...");
    }
}

/*
프로그램 시작!
Hello, Java~
프로그램 종료...
프로그램 시작!
Hello, Spring~
프로그램 종료...
*/