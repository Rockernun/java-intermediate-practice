package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {

        Random rand = new Random();
        // Random rand = new Random(1);  // seed가 같으면 실행을 반복해 결과가 계속 동일하다.

        int randomInt = rand.nextInt();
        System.out.println("randomInt = " + randomInt);

        double randomDouble = rand.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = rand.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        // 범위 조회
        int randomRange1 = rand.nextInt(10);
        System.out.println("0 ~ 9: " + randomRange1);

        int randomRange2 = rand.nextInt(10) + 1;
        System.out.println("1 ~ 10: " + randomRange2);
    }
}

/*
randomInt = -953326647
randomDouble = 0.1556065348287149
randomBoolean = false
0 ~ 9: 6
1 ~ 10: 8
*/