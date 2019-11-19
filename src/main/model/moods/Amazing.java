package model.moods;

public class Amazing extends AllTypesOfMoods implements Mood {
    int moodNum;
    String moodName;
    String soundMood;
    String announcement;

    public Amazing() {
        super("amazing", 5);
        this.moodName = "amazing";
        this.moodNum = 5;
        this.colourMood("yellow");
    }

    // getters
    public String getMoodName() {
        return moodName;
    }

    public int getMoodNum() {
        return moodNum;
    }

    public String getSoundMood() {
        return soundMood;
    }

    public String getAnnouncement() {
        return announcement;
    }

    @Override
    // MODIFIES: this
    // EFFECTS: sets soundMood to Yaay!
    public void soundMood() {
        this.soundMood = "Yaay!";

    }

    @Override
    // MODIFIES: this
    // EFFECTS: sets announceMood to I am feeling amazing!
    public void announceMood() {
        this.announcement = "I am feeling amazing!";
    }

}
