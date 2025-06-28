package exception.ex1;

public class NetworkClientV1 {

    // 접근할 외부 서버의 주소
    private final String address;

    // 연결/전송 실패 필드 추가
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV1(String address) {
        this.address = address;
    }

    // 외부 서버에 연결
    public String connect() {
        if (connectError) {
            System.out.println(address + " 서버 연결 실패!");
            return "connectError...";
        }
        System.out.println(address + " 서버가 성공적으로 연결되었습니다.");
        return "Success";
    }

    // 연결한 외부 서버에 데이터 전송
    public String send(String data) {
        if (sendError) {
            System.out.println(address + " 서버에 데이터 전송 실패: " + data);
        }
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "Success";
    }

    // 외부 서버와 연결 해제
    public void disconnect() {
        System.out.println(address + " 서버 연결이 해제되었습니다.");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }

        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
