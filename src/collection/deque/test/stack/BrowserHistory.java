package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    private Deque<String> history = new ArrayDeque<String>();

    public void visitPage(String page) {
        System.out.println("방문: " + page);
        history.push(page);
    }

    public String goBack() {
        if (history.size() > 1) {
            history.pop();
            System.out.println("뒤로 가기: " + history.peek());
            return history.peek();
        } else {
            return "뒤로 갈 수 없습니다!";
        }
    }
}
