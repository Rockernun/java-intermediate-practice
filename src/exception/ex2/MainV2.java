package exception.ex2;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2 {

//        NetworkServiceV2_1 networkService = new NetworkServiceV2_1();
//        NetworkServiceV2_2 networkService = new NetworkServiceV2_2();
//        NetworkServiceV2_3 networkService = new NetworkServiceV2_3();
        NetworkServiceV2_4 networkService = new NetworkServiceV2_4();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 데이터: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }

            networkService.sendMessage(input);
            System.out.println();
        }

        System.out.println("프로그램을 정상적으로 종료합니다.");
    }
}

/*
전송할 데이터: error1
[오류] 코드: connectError..., 메시지: http://example.com 서버 연결 실패!
http://example.com 서버 연결이 해제되었습니다.

전송할 데이터: error2
http://example.com 서버가 성공적으로 연결되었습니다.
Exception in thread "main" java.lang.RuntimeException: ex
	at exception.ex2.NetworkClientV2.send(NetworkClientV2.java:26)
	at exception.ex2.NetworkServiceV2_4.sendMessage(NetworkServiceV2_4.java:13)
	at exception.ex2.MainV2.main(MainV2.java:21)
*/