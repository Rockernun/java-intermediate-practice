package nested.test.ex1;

public class Library {

    private Book[] books;
    private int count;

    public Library(int librarySize) {
        count = 0;
        books = new Book[librarySize];
    }

    public void addBook(String title, String author) {
        if (books.length > count) {
            books[count++] = new Book(title, author);
        } else {
            System.out.println("더 이상 도서관에 책을 저장할 수 없습니다!");
        }
    }

    public void showBooks() {
        System.out.println("==책 목록 출력==");
        for (int i = 0; i < count; i++) {
            System.out.println("도서 제목: " + books[i].title + ", 저자: "
            + books[i].author);
        }
    }

    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
