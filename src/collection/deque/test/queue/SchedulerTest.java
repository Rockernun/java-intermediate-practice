package collection.deque.test.queue;

public class SchedulerTest {
    public static void main(String[] args) {

        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTask(new CompressionTask());
        scheduler.addTask(new BackUp());
        scheduler.addTask(new CleanTask());

        // 일정 시간 이후에 실행
        System.out.println("작업 시작");
        run(scheduler);
        System.out.println("작업 완료");
    }

    private static void run(TaskScheduler scheduler) {
        while (scheduler.getRemainingTasks() > 0) {
            scheduler.processNextTask();
        }
    }
}

/*
작업 시작
데이터 압축 중...
자료 백업 중...
자원 최적화 중...
작업 완료
*/
