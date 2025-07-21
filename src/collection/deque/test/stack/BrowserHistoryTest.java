package collection.deque.test.stack;

public class BrowserHistoryTest {
    public static void main(String[] args) {

        BrowserHistory browser = new BrowserHistory();

        // 유저가 방문한 웹페이지
        browser.visitPage("youtube.com");
        browser.visitPage("google.com");
        browser.visitPage("facebook.com");

        // 뒤로 가기
        String currentPage1 = browser.goBack();
        System.out.println("currentPage1 = " + currentPage1);

        String currentPage2 = browser.goBack();
        System.out.println("currentPage2 = " + currentPage2);

        String error = browser.goBack();
        System.out.println(error);
    }
}

/*
방문: youtube.com
방문: google.com
방문: facebook.com

뒤로 가기: google.com
currentPage1 = google.com

뒤로 가기: youtube.com
currentPage2 = youtube.com

currentPage3 = 뒤로 갈 수 없습니다!
*/