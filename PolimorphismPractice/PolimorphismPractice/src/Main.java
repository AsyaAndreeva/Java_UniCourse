import Repo.Repo;
import Repo.Document;
import Repo.Author;
import Repo.Book;

public class Main {
    public static void main(String[] args) {
        Repo repo = new Repo(20);
        Repo repo2 = new Repo(30, 5, 12);

        Document document = new Document(5, "txt", "document1");
        Document document2 = new Document(8, "txt", "document2");

        Author author = new Author("Ivanov");

        Book book = new Book(10, "pdf", "Book 1", author, "!@#$452");

        System.out.println(repo);
        System.out.println(repo2);

        System.out.println(document);
        System.out.println(document2);

        System.out.println(author);

        System.out.println(book);

        System.out.println(repo.uploadDocument(document));
        System.out.println(repo.uploadDocument(document2));

        System.out.println(repo);

        System.out.println(repo.uploadDocument(book));

        //dynamic dispatch /късно свързване/
        Document docRef = document;
        System.out.println(docRef);
        docRef = book;
        System.out.println(docRef);
    }
}