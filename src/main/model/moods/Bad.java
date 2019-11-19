package model.moods;

public class Bad extends AllTypesOfMoods implements Mood {
    int moodNum;
    String moodName;
    String soundMood;
    String announcement;

    public Bad() {
        super("bad", 2);
        this.moodName = "bad";
        this.moodNum = 2;
        this.colourMood("medium blue");
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
    // EFFECTS: sets soundMood to Ugh!
    public void soundMood() {
        this.soundMood = "Ugh!";
    }

    @Override
    // MODIFIES: this
    // EFFECTS: sets announceMood to I am feeling bad!
    public void announceMood() {
        this.announcement = "I am feeling bad!";

    }
}
