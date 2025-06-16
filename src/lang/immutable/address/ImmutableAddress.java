package lang.immutable.address;

public class ImmutableAddress {

    private final String value; // value 값을 바꿀 수 없도록 수정

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ImmutableAddress{" +
                "value='" + value + '\'' +
                '}';
    }
}