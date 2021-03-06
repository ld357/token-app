package model.moods;

public class Terrible extends AllTypesOfMoods implements Mood {
    int moodNum;
    String moodName;
    String soundMood;
    String announcement;

    public Terrible() {
        super("terrible", 1);
        this.moodName = "terrible";
        this.moodNum = 1;
        this.colourMood("dark blue");
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
    // MODIFIES: this
    // EFFECTS: sets soundMood
    public void soundMood() {
        this.soundMood = "DARNN...";
    }

    @Override
    // MODIFIES: this
    // EFFECTS: sets announceMood to I am feeling terrible!
    public void announceMood() {
        this.announcement = "I am feeling terrible!";

    }


    // MODIFIES: this
    // EFFECTS: sets data for terrible mood
}
