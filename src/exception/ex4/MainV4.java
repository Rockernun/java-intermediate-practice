package exception.ex4;

import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) {

//        NetworkServiceV4 networkService = new NetworkServiceV4();
        NetworkServiceV5 networkService = new NetworkServiceV5();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 데이터: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }

            try {
                networkService.sendMessage(input);
            } catch (Exception e) {
                exceptionHandler(e);
            }

            System.out.println();
        }

        System.out.println("프로그램을 정상적으로 종료합니다.");
    }

    // 예외에 대한 정보를 받아서 어떻게 처리할 것인가? (공통 예외 처리)
    private static void exceptionHandler(Exception e) {
        // 공통 처리
        System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다!");
        System.out.println("==개발자용 디버깅 메시지==");
        e.printStackTrace(System.out);  // 스택 트레이스 출력

        // 필요하면 예외별로 별도의 추가 처리 가능
        if (e instanceof SendExceptionV4 sendEx) {
            System.out.println("[전송 오류] 전송 데이터: " + sendEx.getSendData());
        }
    }
}

/*
전송할 데이터: hello
http://example.com 서버가 성공적으로 연결되었습니다.
http://example.com 서버에 데이터 전송: hello
NetworkClientV5.close
http://example.com 서버 연결이 해제되었습니다.

전송할 데이터: error1
NetworkClientV5.close
http://example.com 서버 연결이 해제되었습니다.
[예외 확인]: http://example.com 서버 연결 실패!
사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다!
==개발자용 디버깅 메시지==
exception.ex4.exception.ConnectExceptionV4: http://example.com 서버 연결 실패!
	at exception.ex4.NetworkClientV5.connect(NetworkClientV5.java:18)
	at exception.ex4.NetworkServiceV5.sendMessage(NetworkServiceV5.java:11)
	at exception.ex4.MainV4.main(MainV4.java:22)

전송할 데이터: error2
http://example.com 서버가 성공적으로 연결되었습니다.
NetworkClientV5.close
http://example.com 서버 연결이 해제되었습니다.
[예외 확인]: http://example.com 서버에 데이터 전송 실패: error2
사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다!
==개발자용 디버깅 메시지==
exception.ex4.exception.SendExceptionV4: http://example.com 서버에 데이터 전송 실패: error2
	at exception.ex4.NetworkClientV5.send(NetworkClientV5.java:26)
	at exception.ex4.NetworkServiceV5.sendMessage(NetworkServiceV5.java:12)
	at exception.ex4.MainV4.main(MainV4.java:22)
[전송 오류] 전송 데이터: error2

전송할 데이터: exit
프로그램을 정상적으로 종료합니다.
*/