package model.quotes;

public class Author3 implements Authors {
    String author;

    public Author3() {
        this.author = "Unknown";
    }

    @Override
    public String getAuthor() {
        return this.author;
    }
}
