package exception.ex3.exception;

public class ConnectExceptionV3 extends NetworkClientExceptionV3 {

    // 연결에 실패한 서버의 주소
    private final String address;

    public ConnectExceptionV3(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
