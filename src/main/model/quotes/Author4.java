package model.quotes;

public class Author4 implements Authors {
    String author;

    public Author4() {
        this.author = "Marcus Aurelius";
    }

    @Override
    public String getAuthor() {
        return this.author;
    }
}
