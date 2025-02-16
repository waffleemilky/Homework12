import java.util.Objects;

public class Book {

    private String nameBook;
    private int yearBook;
    private Author author;

    public Book(Author author, String nameBook, int yearBook) {
        this.author = author;
        this.nameBook = nameBook;
        this.yearBook = yearBook;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getYearBook() {
        return this.yearBook;
    }

    public String toString() {
        return author + " " + nameBook + " " + yearBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearBook == book.yearBook && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    public int hashCode() {
        return Objects.hash(nameBook, yearBook, author);
    }
}
