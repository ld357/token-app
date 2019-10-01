package model.quotes;

public class Author1 implements Authors {
    String author;
    Boolean favouriteAuthorStatus;

    public Author1() {
        this.author = "William Arthur Ward";
        this.favouriteAuthorStatus = false;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public Boolean saveAuthor() {
        return favouriteAuthorStatus = true;
    }

    @Override
    public Boolean unSaveAuthor() {
        return favouriteAuthorStatus = false;
    }

    // getter
    public Boolean getAuthorStatus() {
        return this.favouriteAuthorStatus;

    }

}
