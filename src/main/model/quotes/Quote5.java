package model.quotes;

public class Quote5 implements Quotes, Authors {
    String quote;
    Boolean status;
    String author;

    public Quote5() {
        this.quote = "There’s no such things as a small act of kindness."
                + "Every act creates a ripple with no logical end";
        this.author = "Scott Adams";
        this.status = false;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public Boolean setFavourite() {
        return false;
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

