package lang.immutable.change;

public class ImmutableObj {

    private final int value; // value는 절대 바뀌면 안 된다

    public ImmutableObj(int value) {
        this.value = value;
    }

    // 본인(value)의 값은 절대 바꾸지 않는 대신, 새로운 객체를 만들어서 반환
    public ImmutableObj add(int addValue) {
        int result = value + addValue;
        return new ImmutableObj(result);
    }

    public int getValue() {
        return value;
    }
}