public class Main {
    public static void main(String[] args) {

        Author author = new Author("Джером", "Сэинджер");
        Author author1 = new Author("Мариам", "Петросян");
        Book book = new Book(author, "Над пропастью во ржи", 1951);
        Book book1 = new Book(author1, "Дом в котором", 2009);

        System.out.println("author = " + author);
        System.out.println("author1 = " + author1);

        System.out.println("book = " + book);
        System.out.println("book1 = " + book1);

        book1.setYearBook(2012);
        System.out.println("book1 = " + book1);

    }
}