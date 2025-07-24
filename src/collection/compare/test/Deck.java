package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> deck = new ArrayList<Card>();

    public Deck() {
        initializeDeck();
        shuffleDeck();
    }

    private void initializeDeck() {
        for (int i = 1; i <= 13; i++) {
            for (Suit suit : Suit.values()) {
                deck.add(new Card(i, suit));
            }
        }
    }

    private void shuffleDeck() {
        Collections.shuffle(deck);
    }

    public Card drawCard() {
        // 첫 번째 인덱스에 있는 카드를 뽑고 반환
        return deck.remove(0);
    }
}
