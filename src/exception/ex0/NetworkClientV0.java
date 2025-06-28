package exception.ex0;

public class NetworkClientV0 {

    // 접근할 외부 서버의 주소
    private final String address;

    public NetworkClientV0(String address) {
        this.address = address;
    }

    // 외부 서버에 연결
    public String connect() {
        System.out.println(address + " 서버가 성공적으로 연결되었습니다.");
        return "Success";
    }

    // 연결한 외부 서버에 데이터 전송
    public String send(String data) {
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "Success";
    }

    // 외부 서버와 연결 해제
    public void disconnect() {
        System.out.println(address + " 서버 연결이 해제되었습니다.");
    }
}
