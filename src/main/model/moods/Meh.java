package model.moods;

public class Meh extends AllTypesOfMoods implements Mood {
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
    // MODIFIES: this
    // EFFECTS: sets soundMood to Ehhhhh...
    public void soundMood() {
        this.soundMood = "Ehhhhh...";
    }

    @Override
    // EFFECTS: sets announceMood to I am feeling meh!
    public void announceMood() {
        this.announcement = "I am feeling meh!";

    }

}
