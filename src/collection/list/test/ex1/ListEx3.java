package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요...");

        while (true) {
            int input = sc.nextInt();
            if (input == 0) {
                break;
            }

            list.add(input);
        }

        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }

        double average = sum / list.size();

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}

/*
n개의 정수를 입력하세요...
1
2
3
4
5
0
입력한 정수의 합계: 15
입력한 정수의 평균: 3.0
*/