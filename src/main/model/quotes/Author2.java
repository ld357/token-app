package model.quotes;

public class Author2 implements Authors {
    String author;
    Boolean favouriteAuthorStatus;

    public Author2() {
        this.author = "John Wooden";
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
