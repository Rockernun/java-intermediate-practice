package exception.ex3.exception;

public class SendExceptionV3 extends NetworkClientExceptionV3 {

    // 내부에 전송을 실패한 데이터
    private final String sendData;

    public SendExceptionV3(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
