package model.quotes;

public class Author3 implements Authors {
    String author;
    Boolean favouriteAuthorStatus;

    public Author3() {
        this.author = "Unknown";
        this.favouriteAuthorStatus = false;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public Boolean saveAuthor() {
        return this.favouriteAuthorStatus = true;
    }

    @Override
    public Boolean unSaveAuthor() {
        return this.favouriteAuthorStatus = false;
    }
}
