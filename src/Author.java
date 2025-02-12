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

}
