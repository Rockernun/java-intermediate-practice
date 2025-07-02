package generic.test.ex2;

public class Pair<T1, T2> {

    private T1 firstValue;
    private T2 secondValue;

    public T1 getFirst() {
        return firstValue;
    }

    public void setFirst(T1 firstValue) {
        this.firstValue = firstValue;
    }

    public T2 getSecond() {
        return secondValue;
    }

    public void setSecond(T2 secondValue) {
        this.secondValue = secondValue;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firstValue=" + firstValue +
                ", secondValue=" + secondValue +
                '}';
    }
}
