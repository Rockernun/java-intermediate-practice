package lang.math.test;

public class LottoGeneratorMain {
    public static void main(String[] args) {

        LottoGenerator lotto = new LottoGenerator();
        int[] lottoNumbers = lotto.generate();

        System.out.print("로또 번호: ");
        for (int i = 0; i < lottoNumbers.length; i++) {
            System.out.printf("%d ", lottoNumbers[i]);
        }
    }
}

// 로또 번호: 13 42 20 40 19 14 