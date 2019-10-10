package model.moods;

public class Meh extends AllMoods implements Moods {
    int moodNum;
    String moodName;
    String soundMood;
    String announcement;

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

    // setters

    public String getSoundMood() {
        return soundMood;
    }

    public String getAnnouncement() {
        return announcement;
    }

    @Override
    // EFFECTS: sets soundMood
    public void soundMood() {
        this.soundMood = "Ehhhhh...";
    }

    @Override
    // EFFECTS: sets announceMood
    public void announceMood() {
        this.announcement = "I am feeling meh!";

    }
    // MODIFIES: this
    // EFFECTS: sets data for meh mood
}
