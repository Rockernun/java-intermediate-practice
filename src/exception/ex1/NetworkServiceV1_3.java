package exception.ex1;

public class NetworkServiceV1_3 {

    public void sendMessage(String data) {

        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        String connectResult = client.connect();
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
        } else {
            String sendResult = client.send(data);
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            }
        }

        // 연결/데이터 전송에 실패해도 disconnect() 호출
        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("Success");
    }
}
