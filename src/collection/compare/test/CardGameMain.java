package collection.compare.test;

public class CardGameMain {
    public static void main(String[] args) {

        Deck deck = new Deck();
        Player player1 = new Player("사용자1");
        Player player2 = new Player("사용자2");

        for (int i = 0; i < 5; i++) {
            player1.drawCard(deck);
            player2.drawCard(deck);
        }

        player1.showPicked();
        player2.showPicked();

        Player champion = winner(player1, player2);

        if (champion != null) {
            System.out.println(champion.getName() + "의 승리!");
        } else {
            System.out.println("무승부...");
        }
    }

    private static Player winner(Player p1, Player p2) {
        int p1Sum = p1.sum();
        int p2Sum = p2.sum();

        if (p1Sum > p2Sum) {
            return p1;
        } else if (p1Sum == p2Sum) {
            return null;
        } else {
            return p2;
        }
    }
}

/*
사용자1의 카드: [3(SPADE), 9(SPADE), 12(DIAMOND), 12(CLOVER), 13(SPADE)], 합계: 49
사용자2의 카드: [2(SPADE), 3(DIAMOND), 7(HEART), 9(DIAMOND), 13(HEART)], 합계: 34
사용자1의 승리!

사용자1의 카드: [1(HEART), 7(SPADE), 8(HEART), 9(HEART), 12(DIAMOND)], 합계: 37
사용자2의 카드: [4(HEART), 5(CLOVER), 10(SPADE), 11(SPADE), 12(SPADE)], 합계: 42
사용자2의 승리!

사용자1의 카드: [2(DIAMOND), 4(CLOVER), 6(SPADE), 6(HEART), 7(SPADE)], 합계: 25
사용자2의 카드: [4(HEART), 4(DIAMOND), 5(DIAMOND), 5(CLOVER), 7(DIAMOND)], 합계: 25
무승부...
*/
