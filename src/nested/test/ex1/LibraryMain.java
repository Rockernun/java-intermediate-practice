package nested.test.ex1;

public class LibraryMain {
    public static void main(String[] args) {

        // 최대 4권의 도서를 저장할 수 있는 도서관 생성
        Library library = new Library(4);

        library.addBook("헤드퍼스트 자바", "캐시 시에라");
        library.addBook("헤드퍼스트 디자인 패턴", "에릭 프리먼");
        library.addBook("읽고 나면 진짜 쉬워지는 자료 구조", "제레미 쿠비카");
        library.addBook("Operating System", "Abraham silberschatz");

        library.showBooks();
    }
}

/*
==책 목록 출력==
도서 제목: 헤드퍼스트 자바, 저자: 캐시 시에라
도서 제목: 헤드퍼스트 디자인 패턴, 저자: 에릭 프리먼
도서 제목: 읽고 나면 진짜 쉬워지는 자료 구조, 저자: 제레미 쿠비카
도서 제목: Operating System, 저자: Abraham silberschatz
*/
