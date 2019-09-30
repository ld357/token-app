package model.quotes;

public class Author2 implements Authors {
    String author;

    public Author2() {
        this.author = "John Wooden";
    }

    @Override
    public String getAuthor() {
        return this.author;
    }
}
