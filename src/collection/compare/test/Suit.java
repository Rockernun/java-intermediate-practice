package collection.compare.test;

public enum Suit {
    SPADE("\u2600"), HEART("\u2665"), DIAMOND("\u2666"), CLOVER("\u2663");

    private String icon;

    Suit(String icon) {
        this.icon = icon;
    }

    private String getIcon() {
        return icon;
    }
}
