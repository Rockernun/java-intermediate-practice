package collection.deque.test.queue;

public class CleanTask implements Task {

    @Override
    public void execute() {
        System.out.println("자원 최적화 중...");
    }
}
