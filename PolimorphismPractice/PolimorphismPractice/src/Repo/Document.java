package Repo;

public class Document {

    private double docSize;
    private String format;
    private String title;
    private Repo repo;

    public Document(double docSize, String format, String title) {
        this.docSize = docSize;
        this.format = format;
        this.title = title;
    }

    public double getDocSize() {
        return docSize;
    }

    public String getFormat() {
        return format;
    }

    public String getTitle() {
        return title;
    }

    public Repo getRepo() {
        return repo;
    }

    public void setRepo(Repo repo) {
        this.repo = repo;
    }

    @Override
    public String toString() {
        return "Document{" +
                "docSize=" + docSize +
                ", format='" + format + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
