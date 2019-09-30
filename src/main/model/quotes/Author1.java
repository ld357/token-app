package model.quotes;

public class Author1 implements Authors {
    String author;

    public Author1() {
        this.author = "William Arthur Ward";
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

}
