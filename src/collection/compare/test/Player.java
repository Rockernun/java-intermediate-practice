package collection.compare.test;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private List<Card> picked;

    public Player(String name) {
        this.name = name;
        this.picked = new ArrayList<>();
    }

    public void drawCard(Deck deck) {
        picked.add(deck.drawCard());
    }

    public int sum() {
        int result = 0;
        for (Card card : picked) {
            result += card.getCardNumber();
        }

        return result;
    }

    public void showPicked() {
        picked.sort(null);
        System.out.println(name + "의 카드: " + picked + ", 합계: " + sum());
    }

    public String getName() {
        return name;
    }
}
