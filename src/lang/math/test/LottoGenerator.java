package lang.math.test;

import java.util.Random;

public class LottoGenerator {

    private final Random rand = new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] generate() {
        lottoNumbers = new int[6];
        count = 0;

        while (count < 6) {
            int lottoNumber = rand.nextInt(45) + 1;
            if (isUnique(lottoNumber)) {
                lottoNumbers[count] = lottoNumber;
                count++;
            }
        }

        return lottoNumbers;
    }

    private boolean isUnique(int number) {
        for (int i = 0; i < count; i++) {
            if (number == lottoNumbers[i]) {
                return false;
            }
        }

        return true;
    }
}
