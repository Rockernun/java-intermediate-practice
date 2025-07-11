package collection.list.test.ex1;

public class ArrayEx1 {
    public static void main(String[] args) {

        int[] students = {100, 95, 90, 85, 80};

        int sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i];
        }

        double average = sum / students.length;
        System.out.println("총 점수: " + sum);
        System.out.println("평균 점수: " + average);
    }
}

/*
총 점수: 450
평균 점수: 90.0
*/
