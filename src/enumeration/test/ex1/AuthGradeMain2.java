package enumeration.test.ex1;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        String grade = scanner.nextLine();

        AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase());
        System.out.println("당신의 등급은 " + authGrade.getDescription() + "입니다.");

        System.out.println("==메뉴 목록==");
        if (authGrade.getLevel() > 0) {
            System.out.println("- 메인 화면");
        }

        if (authGrade.getLevel() > 1) {
            System.out.println("- 이메일 관리 화면");
        }

        if (authGrade.getLevel() > 2) {
            System.out.println("- 관리자 화면");
        }

    }
}

/*
당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: guest
당신의 등급은 손님입니다.
==메뉴 목록==
- 메인 화면

당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: login
당신의 등급은 로그인입니다.
==메뉴 목록==
- 메인 화면
- 이메일 관리 화면

당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: admin
당신의 등급은 관리자입니다.
==메뉴 목록==
- 메인 화면
- 이메일 관리 화면
- 관리자 화면
*/
