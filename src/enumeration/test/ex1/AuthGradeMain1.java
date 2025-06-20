package enumeration.test.ex1;

public class AuthGradeMain1 {
    public static void main(String[] args) {

        AuthGrade[] grades = AuthGrade.values();
        for (AuthGrade grade : grades) {
            System.out.println("grade=" + grade.name() + ", level=" +
                    grade.getLevel(grade) + ", description=" +
                    grade.getDescription(grade));
        }
    }
}

/*
grade=GUEST, level=1, description=손님
grade=LOGIN, level=2, description=로그인
grade=ADMIN, level=3, description=관리자
*/