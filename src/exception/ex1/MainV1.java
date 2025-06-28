package exception.ex1;

import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {

//        NetworkServiceV1_1 networkService = new NetworkServiceV1_1();
        NetworkServiceV1_2 networkService = new NetworkServiceV1_2();


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
http://example.com 서버 연결 실패!
[네트워크 오류 발생] 오류 코드: connectError...

전송할 데이터: error2
http://example.com 서버가 성공적으로 연결되었습니다.
http://example.com 서버에 데이터 전송 실패: error2
[네트워크 오류 발생] 오류 코드: sendError...

전송할 데이터: exit
프로그램을 정상적으로 종료합니다.
*/
