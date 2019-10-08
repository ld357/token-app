package model.moods;

public class Meh extends AllMoods implements Moods {
    int moodNum;
    String moodName;

    public Meh() {
        super("meh", 3);
        this.moodName = "meh";
        this.moodNum = 3;
        this.colourMood("green");

    }

    // getters
    public String getMoodName() {
        return moodName;
    }

    public int getMoodNum() {
        return moodNum;
    }


    @Override
    public void soundMood() {
        System.out.println("Ehhhhh...");
    }

    @Override
    public void announceMood() {
        System.out.println("I am feeling meh!");
    }


    // MODIFIES: this
    // EFFECTS: sets data for meh mood
}
