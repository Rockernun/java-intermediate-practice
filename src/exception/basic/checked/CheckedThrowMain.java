package exception.basic.checked;

public class CheckedThrowMain {
    public static void main(String[] args) throws MyCheckedException {

        Service service = new Service();

        // 예외를 해결 못하는 상태
        service.catchThrow();
        System.out.println("정상 종료");
    }
}

/*
Exception in thread "main" exception.basic.checked.MyCheckedException: ex
	at exception.basic.checked.Client.call(Client.java:8)
	at exception.basic.checked.Service.catchThrow(Service.java:22)
	at exception.basic.checked.CheckedThrowMain.main(CheckedThrowMain.java:9)

정상 종료를 출력하기도 전에 main() 메서드 밖으로 나가버린다.
예외 메시지와 더불어 폭탄이 어디서부터 거슬러 왔는지까지 출력해준다.
*/