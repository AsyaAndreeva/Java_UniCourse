package Repo;

public class Book extends Document{
    private Author author;
    private String ISBN;

    public Book(double docSize, String format, String title, Author author, String ISBN) {
        super(docSize, format, title);
        this.author = author;
        this.ISBN = ISBN;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", ISBN='" + ISBN + '\'' +
                "} " + super.toString();
    }
}
