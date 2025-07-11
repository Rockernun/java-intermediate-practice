package collection.list.test.ex1;

import java.util.ArrayList;

public class ListEx1 {
    public static void main(String[] args) {

        ArrayList<Integer> students = new ArrayList<>();
        students.add(100);
        students.add(95);
        students.add(90);
        students.add(85);
        students.add(80);

        int sum = 0;
        for (Integer score : students) {
            sum += score;
        }

        double average = sum / students.size();
        System.out.println("총 점수: " + sum);
        System.out.println("평균 점수: " + average);
    }
}

/*
총 점수: 450
평균 점수: 90.0
*/