package exception.ex3;

import java.util.Scanner;

public class MainV3 {
    public static void main(String[] args) {

        NetworkServiceV3_1 networkService = new NetworkServiceV3_1();

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
전송할 데이터: hello
http://example.com 서버가 성공적으로 연결되었습니다.
http://example.com 서버에 데이터 전송: hello
http://example.com 서버 연결이 해제되었습니다.

전송할 데이터: error1
[연결 오류] 주소: http://example.com, 메시지: http://example.com 서버 연결 실패!
http://example.com 서버 연결이 해제되었습니다.

전송할 데이터: error2
http://example.com 서버가 성공적으로 연결되었습니다.
[전송 오류] 전송 데이터: error2, 메시지: http://example.com 서버에 데이터 전송 실패: error2
http://example.com 서버 연결이 해제되었습니다.

전송할 데이터: exit
프로그램을 정상적으로 종료합니다.
*/