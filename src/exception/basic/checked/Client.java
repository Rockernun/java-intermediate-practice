package exception.basic.checked;

public class Client {

    public void call() throws MyCheckedException {

        // 문제 상황 발생 -> 예외 터뜨리기
        throw new MyCheckedException("ex");
    }
}
