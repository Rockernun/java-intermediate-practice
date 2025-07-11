package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요...");
        while (true) {
            int input = sc.nextInt();
            if (input == 0) {
                break;
            }

            numList.add(input);
        }

        System.out.println("=== 출력=== ");
        for (int i = 0; i < numList.size(); i++) {
            System.out.print(numList.get(i));
            if (i < numList.size() - 1) {
                System.out.print(", ");
            }
        }
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
=== 출력===
1, 2, 3, 4, 5
*/
