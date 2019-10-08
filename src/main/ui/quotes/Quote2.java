package ui.quotes;

public class Quote2 implements Quotes, Authors {
    String quote;
    Boolean status;
    String author;

    public Quote2() {
        this.quote = "Make each day your masterpiece";
        this.author = "John Wooden";
        this.status = false;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public Boolean saveAuthor() {
        return true;
    }

    @Override
    public Boolean unSaveAuthor() {
        return false;
    }

    @Override
    public Boolean setFavourite() {
        return true;
    }

    @Override
    public String getQuote() {
        return this.quote;
    }

    @Override
    public Boolean getStatus() {
        return this.status;
    }
}