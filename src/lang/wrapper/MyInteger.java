package lang.wrapper;

public class MyInteger {

    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    // 나의 값과 넘어온 값을 비교
    public int compareTo(int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return Integer.toString(value);  // 숫자를 문자로 변경
    }
}
