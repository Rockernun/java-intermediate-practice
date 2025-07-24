package collection.compare.test;

public class Card implements Comparable<Card> {

    private final int cardNumber;
    private final Suit cardIcon;

    public Card(int cardNumber, Suit cardIcon) {
        this.cardNumber = cardNumber;
        this.cardIcon = cardIcon;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public Suit getCardIcon() {
        return cardIcon;
    }

    @Override
    public int compareTo(Card o) {
        if (this.cardNumber != o.cardNumber) {
            return Integer.compare(this.cardNumber, o.cardNumber);
        } else {
            return this.cardIcon.compareTo(o.cardIcon);
        }
    }

    @Override
    public String toString() {
        return cardNumber + "(" + cardIcon + ")";
    }
}