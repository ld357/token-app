package model;

public class Amazing extends AllMoods implements Moods {
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
    // EFFECTS: sets soundMood
    public void soundMood() {
        this.soundMood = "Yaay!";

    }

    @Override
    // EFFECTS: sets announceMood
    public void announceMood() {
        this.announcement = "I am feeling amazing!";
    }

}
