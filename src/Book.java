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

}
