package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV3 {

    public static void hello(Process process) {

        System.out.println("프로그램 시작!");
        process.run();
        System.out.println("프로그램 종료...");
    }

    public static void main(String[] args) {

        Process dice = new Process() {

            @Override
            public void run() {
                int dice = new Random().nextInt(6) + 1;
                System.out.println("주사위의 눈: " + dice);
            }

        };

        Process sum = new Process() {

            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        };

        hello(dice);
        hello(sum);
    }
}

/*
프로그램 시작!
주사위의 눈: 5
프로그램 종료...
프로그램 시작!
i = 1
i = 2
i = 3
프로그램 종료...
*/