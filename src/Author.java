import java.util.Objects;

public class Author {

    private String name;
    private String lastName;

    public Author(String lastName, String name) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String toString() {
        return lastName + " " + name;
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(lastName, author.lastName);
    }

    public int hashCode() {
        return Objects.hash(name, lastName);
    }
}
