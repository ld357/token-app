package model.quotes;

public class Quote3 implements Quotes, Authors {
    String quote;
    Boolean status;
    String author;

    public Quote3() {
        this.quote = "People overestimate what they can do in a single day."
                + "And underestimate what they can do in their whole lives";
        this.author = "Unknown";
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

