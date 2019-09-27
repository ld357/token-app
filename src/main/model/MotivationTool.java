package model;

import java.util.HashSet;

// quotes button is displayed when homepage is launched
// box appears with the quote
// different quote is called each time app opens... is this possible?

// Represents a series of quotes
public class MotivationTool {
    private String quote;
    private String author;
    private Boolean status;
    private HashSet<MotivationTool> allquotes;
    private MotivationTool mt;

    public MotivationTool() {

    }

    // getters
    public String getQuote() {
        return quote;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getStatus() {
        return status;
    }



    // MODIFIES: this
    // EFFECTS: creates quote #1
    public String q1() {
        MotivationTool q1 = new MotivationTool();
        this.quote = "When we seek to discover the best in others,"
                + "we somehow bring out the best in ourselves";
        this.author = "William Arthur Ward";
        this.status = false;
        return this.quote + this.author;

    }

    // MODIFIES: this
    // EFFECTS: creates quote #2
    public String q2() {
        MotivationTool q2 = new MotivationTool();
        this.quote = "Make each day your masterpiece";
        this.author = "John Wooden";
        this.status = false;
        return this.quote + this.author;

    }

    // MODIFIES: this
    // EFFECTS: creates quote #3
    public  String q3() {
        MotivationTool q3 = new MotivationTool();
        this.quote = "People overestimate what they can do in a single day."
                + "And underestimate what they can do in their whole lives";
        this.author = "Unknown";
        this.status = false;
        return this.quote + this.author;
    }

    // MODIFIES: this
    // EFFECTS: create quote #4
    public String q4() {
        MotivationTool q3 = new MotivationTool();
        this.quote = "Dwell on the beauty of life. Watch the stars,"
                + "and see yourself running with them";
        this.author = "Marcus Aurelius";
        this.status = false;
        return this.quote + this.author;
    }

    // MODIFIES: this
    // EFFECTS: creates quote #5
    public String q5() {
        MotivationTool q3 = new MotivationTool();
        this.quote = "There’s no such things as a small act of kindness."
                + "Every act creates a ripple with no logical end";
        this.author = "Scott Adams";
        this.status = false;
        return this.quote + this.author;
    }

    // MODIFIES: this
    // EFFECTS: Sets the quote as a favourite
    public Boolean setFavourite(MotivationTool mt) {

        return this.status = true;
    }


}
