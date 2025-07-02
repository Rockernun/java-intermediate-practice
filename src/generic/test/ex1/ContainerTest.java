package generic.test.ex1;

public class ContainerTest {
    public static void main(String[] args) {

        Container<String> stringContainer = new Container<>();
        System.out.println("빈 값 확인1: " + stringContainer.isEmpty());

        stringContainer.setItem("맥북 프로");
        System.out.println("저장 데이터: " + stringContainer.getItem());
        System.out.println("빈 값 확인2: " + stringContainer.isEmpty());

        Container<Integer> integerContainer = new Container<>();
        integerContainer.setItem(2800000);
        System.out.println("저장 데이터: " + integerContainer.getItem());
    }
}

/*
빈 값 확인1: true
저장 데이터: 맥북 프로
빈 값 확인2: false
저장 데이터: 2800000
*/
