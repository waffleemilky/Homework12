public class Main {
    public static void main(String[] args) {

        Author author = new Author("Джером", "Сэлинджер");
        Author author1 = new Author("Мариам", "Петросян");
        Author author2 = author;
        Book book = new Book(author, "Над пропастью во ржи", 1951);
        Book book1 = new Book(author1, "Дом в котором", 2009);
        Book book2 = new Book(author2, "Молодые Люди", 1940);

        System.out.println("author = " + author);
        System.out.println("author1 = " + author1);
        System.out.println("author2 = " + author2);

        System.out.println("book = " + book);
        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);

        book1.setYearBook(2012);
        System.out.println("book1 = " + book1);

        System.out.println(book.equals(book2));
        System.out.println(author.equals(author2));

    }
}