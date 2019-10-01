package model.quotes;

public class Author5 implements Authors {
    String author;
    Boolean favouriteAuthorStatus;

    public Author5() {
        this.author = "Scott Adams";
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
