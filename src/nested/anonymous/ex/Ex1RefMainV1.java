package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV1 {

    public static void hello(Process process) {

        System.out.println("프로그램 시작!");
        process.run();
        System.out.println("프로그램 종료...");
    }

    static class RollingDice implements Process {

        @Override
        public void run() {
            int dice = new Random().nextInt(6) + 1;
            System.out.println("주사위의 눈: " + dice);
        }

    }

    static class Sum implements Process {

        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        hello(new RollingDice());
        hello(new Sum());
    }
}

/*
프로그램 시작!
주사위의 눈: 2
프로그램 종료...
프로그램 시작!
i = 1
i = 2
i = 3
프로그램 종료...
*/