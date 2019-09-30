package model.quotes;

public class Author5 implements Authors {
    String author;

    public Author5() {
        this.author = "Scott Adams";
    }


    @Override
    public String getAuthor() {
        return this.author;
    }
}
