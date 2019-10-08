package ui.quotes;

public class Author4 implements Authors {
    String author;
    Boolean favouriteAuthorStatus;

    public Author4() {
        this.author = "Marcus Aurelius";
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
