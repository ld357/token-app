package model.quotes;

public class Quote4 implements Quotes, Authors {
    String quote;
    Boolean status;
    String author;

    public Quote4() {
        this.quote = "Dwell on the beauty of life. Watch the stars,"
                + "and see yourself running with them";
        this.author = "Marcus Aurelius";
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

